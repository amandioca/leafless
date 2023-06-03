package db;

import testeTelas.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuarios WHERE username = ? AND password = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
}
