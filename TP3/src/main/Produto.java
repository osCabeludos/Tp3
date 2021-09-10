package main;

import java.util.Date;

public abstract class Produto {
	
	protected String titulo;
	protected Date dataDePublicacao;
	protected float preco;
	protected String editora;
	protected int edicao;
	
	public boolean comparaProduto(Produto product, String a) {
		return product.getAtributoComparacao().equals(a);
	}
	
	protected abstract Object getAtributoComparacao();

	public static void mostraProduto(Produto product) {
		System.out.println(product.toString());
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataDePublicacao() {
		return dataDePublicacao;
	}
	public void setDataDePublicacao(Date dataDePublicação) {
		this.dataDePublicacao = dataDePublicação;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

}
