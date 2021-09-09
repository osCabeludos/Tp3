package main;

//import java.util.*;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class Estoque {

	private List<Produto> estoqueGeral = new ArrayList<>();
	private int qtdCadastrosEstoque = 0;
	
	public Estoque(List<Produto> estoqueGeral, int qtdCadastrosEstoque) {
		this.estoqueGeral = estoqueGeral;
		this.qtdCadastrosEstoque = qtdCadastrosEstoque;
	}
	public List<Produto> getEstoqueGeral() {
		return estoqueGeral;
	}
	public void setArrayEstoqueGeral(List<Produto> estoqueGeral) {
		this.estoqueGeral = estoqueGeral;
	}
	public int getQtdCadastrosEstoque() {
		return qtdCadastrosEstoque;
	}
	public void setQtdCadastrosEstoque(int qtdEmEstoque) {
		this.qtdCadastrosEstoque = qtdEmEstoque;
	}

	public void mostrarEstoque() {
		for(int i = 0; i < qtdCadastrosEstoque; i++) {
			
			System.out.print((i+1) + "- "); Produto.mostraProduto(estoqueGeral.get(i));
		}
	}
	
}
