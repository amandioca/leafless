package leafless;

import db.Conexao;
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

public class Acesso {

	private static final String ALGORITHM = "AES";
	private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
	private static final String KEY = "Leaƒl€sS@2O23";

	public static boolean cadastrarUsuario(Usuario usuario) throws SQLException {
		Connection connection = Conexao.fazConexao();

		String select = "SELECT * FROM tb_usuarios WHERE username = ?";
		PreparedStatement ps = connection.prepareStatement(select);
		ps.setString(1, usuario.getUsername());
		ResultSet rs = ps.executeQuery();

//		if (!rs.next()) {
			String insert = "INSERT INTO tb_usuarios(`nome_completo`, `nome_apresentacao`, `data_cadastro`, `cpf`, `email`, `empresa`, `cargo`, "
					+ "`telefone_comercial`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			ps = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

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
			rs = ps.getGeneratedKeys();

			if (rs.next()) {
				return true;
			}
//		} else {
//			throw new SQLException("1062");
//		}
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
