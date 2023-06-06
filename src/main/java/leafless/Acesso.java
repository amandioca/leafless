package leafless;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

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

	private static String sql;
	private static Usuario usuario;
	private static PreparedStatement ps;

	public static boolean cadastrarUsuario(Usuario usuario) throws SQLException {
		Connection connection = Conexao.fazConexao();
		try {
			sql = "INSERT INTO tb_usuarios(`nome_completo`, `nome_apresentacao`, `data_cadastro`, `cpf`, `email`, `empresa`, `cargo`, "
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
			ps.setString(10, usuario.getPassword());
	
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
		Connection connection = Conexao.fazConexao();
		try {
			sql = "SELECT * FROM tb_usuarios WHERE username = ? AND password = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
	
			ResultSet rs = ps.executeQuery();
	
			if (rs.next()) {
				usuario = new Usuario(rs.getInt("id"), rs.getString("nome_completo"), rs.getString("nome_apresentacao"),
						rs.getString("cpf"), rs.getString("email"), rs.getString("cargo"),
						rs.getString("telefone_comercial"), rs.getString("username"), rs.getString("password"));
				usuario.setGrupos(obterListaGrupoPorUsername(usuario.getUsername()));
				usuario.setDocCriadas(obterListaDocumentosPorUsername(usuario.getUsername()));
	
				UsuarioHolder.setUsuario(usuario);
	
				return true;
			}
			return false;
		} finally {
			connection.close();
		}
	}

	private static List<Documento> obterListaDocumentosPorUsername(String username) throws SQLException {
		Connection connection = Conexao.fazConexao();
		try {
			sql = "SELECT d.* " + "FROM db_leafless.tb_documentos d "
					+ "JOIN db_leafless.tb_usuarios u ON d.tb_usuarios_id_autor = u.id " + "WHERE u.username = ?;";
			ps = connection.prepareStatement(sql);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();

			List<Documento> documentos = new ArrayList<>();
			while (rs.next()) {
				Documento documento = new Documento();
				documento.setAutor(usuario);
				documento.setCaminho(rs.getString("caminho"));
				documento.setExtensao(rs.getString("extensao"));
				documento.setTitulo(rs.getString("titulo"));
				documento.setPermissoes(obterListaGrupoPorIdDocumento(rs.getInt("id")));
				documento.setVersao(rs.getInt("versao"));;
				documento.setTemporalidade(rs.getInt("temporalidade"));
 
				documentos.add(documento);
			}
			return documentos;
		} finally {
			connection.close();
		}
	}

	private static List<Grupo> obterListaGrupoPorIdDocumento(int id) throws SQLException {
		Connection connection = Conexao.fazConexao();
		try {
			sql = "SELECT g.* " + "FROM db_leafless.tb_grupos g "
					+ "JOIN db_leafless.tb_grupos_mtm_documentos gm ON g.id = gm.tb_grupos_id "
					+ "JOIN db_leafless.tb_documentos d ON gm.tb_documentos_id = d.id " + "WHERE d.id = ?;";
			ps = connection.prepareStatement(sql);
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

	private static List<Grupo> obterListaGrupoPorUsername(String username) throws SQLException {
		Connection connection = Conexao.fazConexao();
		try {
			sql = "SELECT g.* " + "FROM db_leafless.tb_grupos g "
					+ "JOIN db_leafless.tb_grupos_mtm_usuarios gu ON g.id = gu.tb_grupos_id "
					+ "JOIN db_leafless.tb_usuarios u ON u.id = gu.tb_usuarios_id " + "WHERE u.username = ?;";
			ps = connection.prepareStatement(sql);
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

	public static boolean alterarSenha(String username, String password) throws SQLException {
		Connection connection = Conexao.fazConexao();
		try {
			sql = "UPDATE tb_usuarios SET password = ? WHERE username = ?;";
			PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, password);
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
