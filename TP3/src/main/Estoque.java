package main;

//import java.util.*;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class Estoque {

	private List<Produto> estoqueGeral = new ArrayList<>();
	//private int qtdCadastrosEstoque = 0;
	
	public Estoque(List<Produto> estoqueGeral) {
		this.estoqueGeral = estoqueGeral;
		//this.qtdCadastrosEstoque = qtdCadastrosEstoque;
	}
	
	public void mostrarEstoque() {
		for(int i = 0; i < estoqueGeral.size(); i++) {
			
			System.out.print((i+1) + " - "); Produto.mostraProduto(estoqueGeral.get(i));
		}
	}
	
	public Produto getProduto(int k) {
		return estoqueGeral.get(k);
	}
	
	public void pesquisaRevista(String nomeDaRevista) {
		boolean revistaNaoEncontrada = true;
		List<Produto> estoqueRevistas = new ArrayList<>();
		
		for(int i = 0; i < estoqueGeral.size(); i++) {

			if(estoqueGeral.get(i) instanceof Revista) {
				estoqueRevistas.add(estoqueGeral.get(i));}}
			
		for(int j = 0; j < estoqueRevistas.size(); j++) {
			
			if(estoqueRevistas.get(j).comparaProduto(estoqueRevistas.get(j), nomeDaRevista)) {
				System.out.println("ok");
				System.out.println(estoqueRevistas.get(j).toString());
				revistaNaoEncontrada = false;}}
		
		if(revistaNaoEncontrada) {
			System.out.println("Revista não encontrada!");}
				
			}
			
	public void pesquisaLivro(String tituloDoLivro) {
		boolean livroNaoEncontrado = true;
		List<Produto> estoqueLivros = new ArrayList<>();
		
		for(int i = 0; i < estoqueGeral.size(); i++) {

			if(estoqueGeral.get(i) instanceof Livro) {
				estoqueLivros.add(estoqueGeral.get(i));}}
			
		for(int j = 0; j < estoqueLivros.size(); j++) {
			
			if(estoqueLivros.get(j).comparaProduto(estoqueLivros.get(j), tituloDoLivro)) {
				System.out.println("ok");
				System.out.println(estoqueLivros.get(j).toString());
				livroNaoEncontrado = false;}}
		
		if(livroNaoEncontrado) {
			System.out.println("Livro não encontrado!");}
				
			}
	
	
	public List<Produto> getEstoqueGeral() {
		return estoqueGeral;
	}
	public void setArrayEstoqueGeral(List<Produto> estoqueGeral) {
		this.estoqueGeral = estoqueGeral;
	}
	//public int getQtdCadastrosEstoque() {
	//	return qtdCadastrosEstoque;
	//}
	//public void setQtdCadastrosEstoque(int qtdEmEstoque) {
	//	this.qtdCadastrosEstoque = qtdEmEstoque;
	//}

	
	
}
