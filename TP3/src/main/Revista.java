package main;

import java.util.Date;

public class Revista extends Produto {
	
	private String nome;
	private String tipoDeRevista;
	
	public Revista(String nome, String tipoDeRevista, String titulo, Date dataDePublicacao, 
			float preco, String editora, int edicao) {
		this.nome = nome;
		this.tipoDeRevista = tipoDeRevista;
		super.titulo = titulo;
		super.dataDePublicacao = dataDePublicacao;
		super.preco = preco;
		super.editora = editora;
		super.edicao = edicao;
	}
	
	
	public String getAtributoComparacao() {
		return getNome();
	}
	
	public String toString() {
		return nome + " " + super.titulo +  " REVISTA da data: " + super.dataDePublicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDeRevista() {
		return tipoDeRevista;
	}

	public void setTipoDeRevista(String tipoDeRevista) {
		this.tipoDeRevista = tipoDeRevista;
	}


}
