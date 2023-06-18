package leafless;

import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class Grupo {

    private int idGrupo;
    private String nomeGrupo;
    private List<String> listaUsuarios;

    public static boolean verificaGrupo(String nomeGrupo) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT * FROM tb_grupos WHERE LOWER(nome) = LOWER(?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nomeGrupo);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean excluirGrupoPorNome(String nomeGrupo) throws SQLException {
        int idGrupo = obterIdGrupoPorNome(nomeGrupo);
        Connection connection = Conexao.fazConexao();
        try {
            if (idGrupo == -1) {
                return false;
            }

            // Excluir associação
            String sqlDeleteRelacionados = "DELETE FROM tb_grupos_mtm_usuarios WHERE tb_grupos_id = ?";
            PreparedStatement psDeleteRelacionados = connection.prepareStatement(sqlDeleteRelacionados);
            psDeleteRelacionados.setInt(1, idGrupo);
            psDeleteRelacionados.executeUpdate();

            // Excluir grupos
            String sqlDeleteGrupo = "DELETE FROM tb_grupos WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sqlDeleteGrupo);
            ps.setInt(1, idGrupo);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }
            return false;
        } finally {
            connection.close();
        }
    }

    public static int contarUsuariosAssociadosAoGrupo(String nomeGrupo) throws SQLException {
        int idGrupo = obterIdGrupoPorNome(nomeGrupo);
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT COUNT(*) AS total FROM tb_grupos_mtm_usuarios WHERE tb_grupos_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idGrupo);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
            return -1;
        } finally {
            connection.close();
        }
    }

    private static int obterIdGrupoPorNome(String nomeGrupo) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT id FROM tb_grupos WHERE nome = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nomeGrupo);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
            return -1;
        } finally {
            connection.close();
        }
    }

    public static List<Grupo> obterListaGrupoPorIdDocumento(int id) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT g.* " + "FROM db_leafless.tb_grupos g "
                    + "JOIN db_leafless.tb_grupos_mtm_documentos gm ON g.id = gm.tb_grupos_id "
                    + "JOIN db_leafless.tb_documentos d ON gm.tb_documentos_id = d.id " + "WHERE d.id = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            List<Grupo> grupos = new ArrayList<>();
            while (rs.next()) {
                Grupo grupo = new Grupo();
                grupo.setIdGrupo(rs.getInt("id"));
                grupo.setNomeGrupo(rs.getString("nome"));

                grupos.add(grupo);
            }
            return grupos;
        } finally {
            connection.close();
        }
    }

    public static List<Grupo> obterListaGrupoPorUsername(String username) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT g.* " + "FROM db_leafless.tb_grupos g "
                    + "JOIN db_leafless.tb_grupos_mtm_usuarios gu ON g.id = gu.tb_grupos_id "
                    + "JOIN db_leafless.tb_usuarios u ON u.id = gu.tb_usuarios_id " + "WHERE u.username = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            List<Grupo> grupos = new ArrayList<>();
            while (rs.next()) {
                Grupo grupo = new Grupo();
                grupo.setIdGrupo(rs.getInt("id"));
                grupo.setNomeGrupo(rs.getString("nome"));

                grupos.add(grupo);
            }
            return grupos;
        } finally {
            connection.close();
        }
    }

    public static List<Grupo> getListaGrupo() throws SQLException {
        List<Grupo> listaGrupos = new ArrayList<>();
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT id, nome FROM tb_grupos";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idGrupo = rs.getInt("id");
                String nomeGrupo = rs.getString("nome");
                List<String> usuariosAssociados = obterListaUsuariosAssociadosAoGrupo(idGrupo);
                Grupo grupo = new Grupo(idGrupo, nomeGrupo, usuariosAssociados);
                listaGrupos.add(grupo);
            }
            return listaGrupos;
        } finally {
            connection.close();
        }
    }

    private static List<String> obterListaUsuariosAssociadosAoGrupo(int idGrupo) throws SQLException {
        List<String> listaUsuarios = new ArrayList<>();
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "SELECT u.nome AS nome_usuario "
                    + "FROM tb_grupos_mtm_usuarios gu "
                    + "JOIN tb_usuarios u ON gu.tb_usuarios_id = u.id "
                    + "WHERE gu.tb_grupos_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idGrupo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nomeUsuario = rs.getString("nome_usuario");
                listaUsuarios.add(nomeUsuario);
            }
            return listaUsuarios;
        } finally {
            connection.close();
        }
    }

    public static int criarGrupo(String nomeGrupo) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "INSERT INTO `db_leafless`.`tb_grupos` (`nome`) VALUES (?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, nomeGrupo);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return -1;
            }
        } finally {
            connection.close();
        }
    }

    public static boolean adicionarUsuarioAoGrupo(List<String> listaUsuarios, int idGrupo) throws SQLException {
        Connection connection = Conexao.fazConexao();
        try {
            String sql = "INSERT INTO `db_leafless`.`tb_grupos_mtm_usuarios` (`tb_grupos_id`, `tb_usuarios_id`) VALUES";

            for (String usuario : listaUsuarios) {
                int idUsuario = Usuario.obterIdUsuarioPorUsername(usuario);
                sql = sql.concat(String.format(" ('%d', '%d')", idGrupo, idUsuario));
            }

            PreparedStatement ps = connection.prepareStatement(sql);

            int rowsAffect = ps.executeUpdate();

            // Se usuário for associado
            if (rowsAffect > 0) {
                return true;
            }
            // Se der falha
            return false;
        } finally {
            connection.close();
        }
    }

    public Grupo() {
        super();
    }

    public Grupo(int idGrupo, String nomeGrupo, List<String> listaUsuarios) {
        super();
        this.idGrupo = idGrupo;
        this.nomeGrupo = nomeGrupo;
        this.listaUsuarios = listaUsuarios;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public List<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
