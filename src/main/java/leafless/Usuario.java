package leafless;

import java.time.LocalDateTime;
import java.util.List;

public class Usuario {

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

}
