package leafless;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import db.Conexao;

public class Acesso {

	private static final String ALGORITHM = "AES";
	private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
	private static final String KEY = "Leaƒl€sS@2O23";

	static Usuario usuario;

	public static boolean login(String username, String password) throws SQLException {
		Connection con = Conexao.fazConexao();
		String sql = "SELECT * FROM tb_usuarios WHERE username = ? AND password = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			usuario = new Usuario(rs.getString("nome_completo"), rs.getString("nome_apresentacao"), rs.getString("cpf"),
					rs.getString("email"), rs.getString("cargo"), rs.getString("telefone_comercial"),
					rs.getString("username"), rs.getString("password"));
			return true;
		}
		return false;
	}

	public static boolean alterarSenha(String username, String password) throws SQLException {
		Connection connection = Conexao.fazConexao();

		String update = "UPDATE tb_usuarios SET password = ? WHERE username = ?;";
		PreparedStatement ps = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, password);
		ps.setString(2, username);

		int rowsAffected = ps.executeUpdate();

		if (rowsAffected > 0) {
			return true;
		}
		return false;
	}

	public static boolean cadastrarUsuario(Usuario usuario) throws SQLException {
		Connection connection = Conexao.fazConexao();
		String insert = "INSERT INTO tb_usuarios(`nome_completo`, `nome_apresentacao`, `data_cadastro`, `cpf`, `email`, `empresa`, `cargo`, "
				+ "`telefone_comercial`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement ps = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, usuario.getNomeCompleto());
		ps.setString(2, usuario.getNomeApresentacao());
		ps.setString(3, usuario.getDataCadastro().toString());
		ps.setString(4, usuario.getCpf());
		ps.setString(5, usuario.getEmail());
		ps.setString(6, usuario.getEmpresa());
		ps.setString(7, usuario.getCargo());
		ps.setString(8, usuario.getTelComercial());
		ps.setString(9, usuario.getUsername());
		ps.setString(10, usuario.getPassword());

		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();

		if (rs.next()) {
			return true;
		}
		return false;
	}

	public static String encriptar(String param) {

		try {
			SecretKeySpec sks = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
			Cipher cipher = Cipher.getInstance(TRANSFORMATION);
			cipher.init(Cipher.ENCRYPT_MODE, sks);

			byte[] encryptedBytes = cipher.doFinal(param.getBytes(StandardCharsets.UTF_8));

			return Base64.getEncoder().encodeToString(encryptedBytes);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
				| BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String decriptar(String param) {
		try {
			SecretKeySpec sks = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
			Cipher cipher = Cipher.getInstance(TRANSFORMATION);
			cipher.init(Cipher.DECRYPT_MODE, sks);

			byte[] decodedBytes = Base64.getDecoder().decode(param);
			byte[] decryptedBytes = cipher.doFinal(decodedBytes);

			return new String(decryptedBytes, StandardCharsets.UTF_8);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
				| BadPaddingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
