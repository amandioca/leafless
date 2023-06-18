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

    private String titulo;
    private String caminho;
    private Usuario autor;
    private String extensao;
    private LocalDateTime dataVencimento;
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
                documento.setAutor(usuario);
                documento.setCaminho(rs.getString("caminho"));
                documento.setExtensao(rs.getString("extensao"));
                documento.setTitulo(rs.getString("titulo"));
                documento.setPermissoes(Grupo.obterListaGrupoPorIdDocumento(rs.getInt("id")));
                documento.setVersao(rs.getInt("versao"));;
                documento.setTemporalidade(rs.getInt("temporalidade"));

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

    public Documento(String titulo, String caminho, Usuario autor, String extensao, int versao, int temporalidade,
            List<Grupo> permissoes) {
        super();
        this.titulo = titulo;
        this.caminho = caminho;
        this.autor = autor;
        this.extensao = extensao;
        this.versao = versao;
        this.temporalidade = temporalidade;
        this.permissoes = permissoes;
    }

    public LocalDateTime getDataVencimento(LocalDateTime dataInclusao, int temporalidade) {
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
        return LocalDateTime.now();
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
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
