package br.com.leafless.model;

import br.com.leafless.db.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Usuario {

    private int id;
    private String nomeCompleto;
    private String nomeApresentacao;
    private LocalDateTime dataNasc;
    private String cpf;
    private String email;
    private String cargo;
    private String telComercial;
    private List<Documento> docCriadas;
    private String username;
    private String password;
    private List<Grupo> grupos;

    public static void logout(JFrame telaAtual) {
        telaAtual.dispose();
    }

    public static boolean cadastrarUsuario(Usuario usuario) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "INSERT INTO tb_usuarios(`nome_completo`, `nome_apresentacao`, `data_cadastro`, `cpf`, `email`, `empresa`, `cargo`, "
                    + "`telefone_comercial`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuario.getNomeCompleto());
            ps.setString(2, usuario.getNomeApresentacao());
            ps.setString(3, usuario.getDataCadastro().toString());
            ps.setString(4, usuario.getCpf());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getEmpresa());
            ps.setString(7, usuario.getCargo());
            ps.setString(8, usuario.getTelComercial());
            ps.setString(9, usuario.getUsername());
            ps.setString(10, Acesso.encriptar(usuario.getPassword()));

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean login(String username, String password) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM tb_usuarios WHERE username = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, Acesso.encriptar(password));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("nome_completo"), rs.getString("nome_apresentacao"),
                        rs.getString("cpf"), rs.getString("email"), rs.getString("cargo"),
                        rs.getString("telefone_comercial"), rs.getString("username"), rs.getString("password"));
                usuario.setGrupos(Grupo.obterListaGrupoPorUsername(usuario.getUsername()));
                usuario.setDocCriadas(Documento.obterListaDocumentosPorUsername(usuario.getUsername(), usuario));

                UsuarioHolder.setUsuario(usuario);

                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean deletarUsuario(String username, String cpf) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        int idUsuario = obterIdUsuarioPorUsername(username);
        try {
            if (idUsuario == -1) {
                return false;
            }

            // Excluir associação
            String sqlDeleteRelacionados = "DELETE FROM tb_grupos_mtm_usuarios WHERE tb_usuarios_id = ?";
            PreparedStatement psDeleteRelacionados = connection.prepareStatement(sqlDeleteRelacionados);
            psDeleteRelacionados.setInt(1, idUsuario);
            psDeleteRelacionados.executeUpdate();

            // Excluir grupos
            String sqlDeleteGrupo = "DELETE FROM tb_usuarios WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sqlDeleteGrupo);
            ps.setInt(1, idUsuario);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean confirmarUsuario(String username, String cpf) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM tb_usuarios WHERE username = ? AND cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, cpf);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean alterarSenha(String username, String password) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "UPDATE tb_usuarios SET password = ? WHERE username = ?;";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, Acesso.encriptar(password));
            ps.setString(2, username);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static int obterIdUsuarioPorUsername(String username) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM tb_usuarios WHERE username = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username.trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            }
            return -1;
        } finally {
            connection.close();
        }
    }

    public Usuario() {
        if (UsuarioHolder.getUsuario() != null) {
            this.id = UsuarioHolder.getUsuario().getId();
            this.nomeCompleto = UsuarioHolder.getUsuario().getNomeCompleto();
            this.nomeApresentacao = UsuarioHolder.getUsuario().getNomeApresentacao();
            this.dataNasc = UsuarioHolder.getUsuario().getDataNasc();
            this.cpf = UsuarioHolder.getUsuario().getCpf();
            this.email = UsuarioHolder.getUsuario().getEmail();
            this.cargo = UsuarioHolder.getUsuario().getCargo();
            this.telComercial = UsuarioHolder.getUsuario().getTelComercial();
            this.docCriadas = UsuarioHolder.getUsuario().getDocCriadas();
            this.username = UsuarioHolder.getUsuario().getUsername();
            this.password = UsuarioHolder.getUsuario().getPassword();
            this.grupos = UsuarioHolder.getUsuario().getGrupos();
        }
    }

    public Usuario(int id, String nomeCompleto, String nomeApresentacao, String cpf, String email, String cargo,
            String telComercial, String username, String password) {
        super();
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeApresentacao = nomeApresentacao;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.telComercial = telComercial;
        this.username = username;
        this.password = password;
    }

    public Usuario(String nomeCompleto, String nomeApresentacao, String cpf, String email, String cargo,
            String telComercial, String username, String password) {
        super();
        this.nomeCompleto = nomeCompleto;
        this.nomeApresentacao = nomeApresentacao;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.telComercial = telComercial;
        this.username = username;
        this.password = password;
    }

    public Usuario(String username) {
        super();
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDateTime getDataCadastro() {
        return LocalDateTime.now();
    }

    public String getNomeApresentacao() {
        if (nomeApresentacao.trim().isEmpty() || nomeApresentacao.equals("null")) {
            return nomeCompleto;
        }
        return nomeApresentacao;
    }

    public void setNomeApresentacao(String nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
    }

    public LocalDateTime getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDateTime dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return "Leafless";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public List<Documento> getDocCriadas() {
        return docCriadas;
    }

    public void setDocCriadas(List<Documento> docCriadas) {
        this.docCriadas = docCriadas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public String getTelefoneComMascara() {
        return String.format("(%s) %s %s-%s", telComercial.substring(0, 2), telComercial.substring(2, 3),
                telComercial.substring(3, 7), telComercial.substring(7));
    }

}
