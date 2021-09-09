package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String autorLivro = "Maria";
		String generoLivro = "Terror";
		String titulo = "O susto";
		Date hoje = new Date();
		float precoLivro = 10;
		String editoraLivro = "Mises Brasil";
		int edicao = 8;
		//Produto estoque[] = new Produto[99];
		List<Produto> list = new ArrayList<>();
		int n = 0;
		
		
		Livro livro1 = new Livro(autorLivro, generoLivro, titulo, hoje, precoLivro, editoraLivro, edicao);
		n = n+1;
		list.add(livro1);
	    Estoque estoqueLivraria = new Estoque(list, n);
	    estoqueLivraria.mostrarEstoque();

	}

}
