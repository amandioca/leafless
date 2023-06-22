package br.com.leafless.model;

import br.com.leafless.db.DatabaseManager;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Documento {

    private int id;
    private String titulo;
    private String caminho;
    private String autor;
    private String extensao;
    private LocalDateTime dataVencimento;
    private LocalDateTime dataInclusao;
    private int versao;
    private int temporalidade;
    private List<Grupo> permissoes;
    private int idAutor;

    public static int adicionarDocumento(Documento documento) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            // Excluir associação
            String sql = "INSERT INTO `db_leafless`.`tb_documentos` (`titulo`, `data_inclusao`, `caminho`, `extensao`, `versao`, "
                    + "`temporalidade`, `nome_autor`, `tb_usuarios_id_autor`) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, documento.getTitulo());
            ps.setTimestamp(2, Timestamp.valueOf(documento.getDataInclusao()));
            ps.setString(3, documento.getCaminho());
            ps.setString(4, documento.getExtensao());
            ps.setInt(5, documento.getVersao());
            ps.setInt(6, documento.getTemporalidade());
            ps.setString(7, documento.getAutor());
            ps.setInt(8, documento.getIdAutor());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
            return -1;
        } finally {
            connection.close();
        }
    }

    public static boolean excluirDocumentoPorId(int idDocumento) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            // Excluir associação
            String sqlDeleteRelacionados = "DELETE FROM tb_grupos_mtm_documentos WHERE tb_documentos_id = ?";
            PreparedStatement psDeleteRelacionados = connection.prepareStatement(sqlDeleteRelacionados);
            psDeleteRelacionados.setInt(1, idDocumento);
            psDeleteRelacionados.executeUpdate();

            // Excluir grupos
            String sqlDeleteGrupo = "DELETE FROM tb_documentos WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sqlDeleteGrupo);
            ps.setInt(1, idDocumento);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static Documento obterDocumentoPorId(int idDocumento) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM db_leafless.tb_documentos WHERE id = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idDocumento);

            ResultSet rs = ps.executeQuery();

            Documento documento = new Documento();
            if (rs.next()) {
                documento.setId(rs.getInt("id"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setCaminho(rs.getString("caminho"));
                documento.setAutor(rs.getString("nome_autor"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTemporalidade(rs.getInt("temporalidade"));
                documento.setDataInclusao(rs.getTimestamp("data_inclusao").toLocalDateTime());
                documento.setVersao(rs.getInt("versao"));;
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));

                return documento;
            }
            return null;
        } finally {
            connection.close();
        }
    }

    public static List<Documento> pesquisarDocumentoPorTitulo(String titulo) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM tb_documentos WHERE LOWER(titulo) LIKE LOWER(?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + titulo + "%");

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
                documento.setId(rs.getInt("id"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setCaminho(rs.getString("caminho"));
                documento.setAutor(rs.getString("nome_autor"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTemporalidade(rs.getInt("temporalidade"));
                documento.setDataInclusao(rs.getTimestamp("data_inclusao").toLocalDateTime());
                documento.setVersao(rs.getInt("versao"));
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));

                documentos.add(documento);
            }
            return documentos;
        } finally {
            connection.close();
        }
    }

    public static void abrirDocumento(String caminho) throws SQLException {
        File arquivo = new File(caminho);
        if (arquivo.exists()) {
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O documento solicitado não foi encontrado.", "Visualização de Documento",
                    JOptionPane.ERROR_MESSAGE, null);
        }
    }

    public static List<Documento> obterListaDocumentosPorUsername(String username, Usuario usuario) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT d.* " + "FROM db_leafless.tb_documentos d "
                    + "JOIN db_leafless.tb_usuarios u ON d.tb_usuarios_id_autor = u.id " + "WHERE u.username = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
                documento.setId(rs.getInt("id"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setCaminho(rs.getString("caminho"));
                documento.setAutor(rs.getString("nome_autor"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTemporalidade(rs.getInt("temporalidade"));
                documento.setDataInclusao(rs.getTimestamp("data_inclusao").toLocalDateTime());
                documento.setVersao(rs.getInt("versao"));
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));

                documentos.add(documento);
            }
            return documentos;
        } finally {
            connection.close();
        }
    }

    public static String obterCaminhoDocumentoPorId(int idDocumento) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM db_leafless.tb_documentos WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idDocumento);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("caminho");
            }
            return null;
        } finally {
            connection.close();
        }
    }

    public static List<Documento> obterListaDocumentosAutor(int idUsuario) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT * FROM tb_documentos WHERE tb_usuarios_id_autor = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idUsuario);

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
                documento.setId(rs.getInt("id"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setCaminho(rs.getString("caminho"));
                documento.setAutor(rs.getString("nome_autor"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTemporalidade(rs.getInt("temporalidade"));
                documento.setDataInclusao(rs.getTimestamp("data_inclusao").toLocalDateTime());
                documento.setVersao(rs.getInt("versao"));;
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));

                documentos.add(documento);
            }
            return documentos;
        } finally {
            connection.close();
        }
    }

    public static List<Documento> obterListaDocumentos(int idUsuario) throws SQLException {
        Connection connection = DatabaseManager.connectToDatabase();
        try {
            String sql = "SELECT DISTINCT d.* FROM tb_documentos d "
                    + "LEFT JOIN tb_grupos_mtm_documentos gd ON d.id = gd.tb_documentos_id "
                    + "LEFT JOIN tb_grupos_mtm_usuarios gu ON gd.tb_grupos_id = gu.tb_grupos_id "
                    + "WHERE gu.tb_usuarios_id = ? OR d.tb_usuarios_id_autor = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setInt(2, idUsuario);

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
                documento.setId(rs.getInt("id"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setCaminho(rs.getString("caminho"));
                documento.setAutor(rs.getString("nome_autor"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTemporalidade(rs.getInt("temporalidade"));
                documento.setDataInclusao(rs.getTimestamp("data_inclusao").toLocalDateTime());
                documento.setVersao(rs.getInt("versao"));;
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));

                documentos.add(documento);
            }
            return documentos;
        } finally {
            connection.close();
        }
    }

    public Documento() {
        // TODO Auto-generated constructor stub
    }

    public Documento(String titulo, String caminho, String autor, String extensao, int versao, int temporalidade,
            List<Grupo> permissoes, int idAutor) {
        super();
        this.titulo = titulo;
        this.caminho = caminho;
        this.autor = autor;
        this.extensao = extensao;
        this.versao = versao;
        this.temporalidade = temporalidade;
        this.permissoes = permissoes;
        this.dataInclusao = LocalDateTime.now();
        this.idAutor = idAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataVencimento() {
        this.dataVencimento = dataInclusao.plusYears(temporalidade);
        return dataVencimento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDateTime dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public int getTemporalidade() {
        return temporalidade;
    }

    public void setTemporalidade(int temporalidade) {
        this.temporalidade = temporalidade;
    }

    public List<Grupo> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Grupo> permissoes) {
        this.permissoes = permissoes;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
}
