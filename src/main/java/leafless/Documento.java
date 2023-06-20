package leafless;

import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Documento> obterListaDocumentosPorUsername(String username, Usuario usuario) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT d.* " + "FROM db_leafless.tb_documentos d "
                    + "JOIN db_leafless.tb_usuarios u ON d.tb_usuarios_id_autor = u.id " + "WHERE u.username = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
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

    public static List<Documento> obterListaDocumentos(int idUsuario) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT d.* "
                    + "FROM tb_documentos d "
                    + "JOIN tb_grupos_mtm_documentos gd ON d.id = gd.tb_documentos_id "
                    + "JOIN tb_grupos_mtm_usuarios gu ON gd.tb_grupos_id = gu.tb_grupos_id "
                    + "WHERE gu.tb_usuarios_id = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idUsuario);

            ResultSet rs = ps.executeQuery();

            List<Documento> documentos = new ArrayList<>();
            while (rs.next()) {
                Documento documento = new Documento();
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
            List<Grupo> permissoes) {
        super();
        this.titulo = titulo;
        this.caminho = caminho;
        this.autor = autor;
        this.extensao = extensao;
        this.versao = versao;
        this.temporalidade = temporalidade;
        this.permissoes = permissoes;
        this.dataInclusao = LocalDateTime.now();
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

}
