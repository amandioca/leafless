package leafless;

import java.time.LocalDateTime;
import java.util.List;

public class Documento {

	private String titulo;
	private LocalDateTime dataInclusao;
	private String caminho;
	private Usuario autor;
	private String extensao;
	private int versao;
	private int temporalidade;
	private List<Grupo> permissoes;

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
