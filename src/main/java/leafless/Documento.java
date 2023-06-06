package leafless;

import java.time.LocalDateTime;
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
