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
		Estoque estoqueLivraria = new Estoque(list);
		//int n = 0;
		String revistaNome ="VOGUE";
		String tipoDeRevista = "Moda";
		String tituloRevista = "Ivete";
		Date dataDePublicacao = hoje;
		float preco = 10;
		String editora = "Vogue Brasil";
		int edicaoRevista = 500;
		
		
		Revista revista1 = new Revista(revistaNome, tipoDeRevista, tituloRevista, dataDePublicacao, preco, editora, edicaoRevista);
		
		Livro livro1 = new Livro(autorLivro, generoLivro, titulo, hoje, precoLivro, editoraLivro, edicao);
		//n = n+1;
		list.add(livro1);
		list.add(revista1);
	    estoqueLivraria.mostrarEstoque();
	    estoqueLivraria.pesquisaRevista("VOGUE");
	    estoqueLivraria.pesquisaLivro("O susto");
	    estoqueLivraria.pesquisaRevista("PLAYBOY");
	    estoqueLivraria.pesquisaLivro("Manifesto comunista");
	    
	}

}
