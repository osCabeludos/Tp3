package main;

import java.util.Date;

public class Livro extends Produto {
	private String autor;
	private String generoLiterario;
	
	
	public Livro(String autor, String generoLiterario, String titulo, Date dataDePublicacao, 
			float preco, String editora, int edicao) {
		this.autor = autor;
		this.generoLiterario = generoLiterario;
		super.titulo = titulo;
		super.dataDePublicacao = dataDePublicacao;
		super.preco = preco;
		super.editora = editora;
		super.edicao = edicao;
	}
	
	public String getAtributoComparacao() {
		return getTitulo();
	}
	public String toString() {
		return super.titulo + " -LIVRO de " + autor;
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGeneroLiterario() {
		return generoLiterario;
	}


	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	
	
	
}
