package main;
import java.util.ArrayList;
import java.util.List;

public class Cliente 
{
	private String nome;
	private RG rg;
	private Endereco endereco;
	private Celular celular;
	private List<Livro> livrosComprados;
	private List<Revista> revistasCompradas;
	private List<Cliente> listaClientes;
	
	public Cliente(String nome, RG rg,Endereco endereco, Celular celular)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.livrosComprados = null;
		this.revistasCompradas = null;
		this.listaClientes = null;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return this.nome;
	}
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}
	public Endereco getEndereco() 
	{
		return this.endereco;
	}
	public void setCelular(Celular celular) 
	{
		this.celular = celular;
	}
	public Celular getCelular() 
	{
		return this.celular;
	}
	public void setRG(RG rg) 
	{
		this.rg = rg;
	}
	public RG getRG() 
	{
		return this.rg;
	}
	public void setLivrosComprados(Livro livro) // Adiciona um livro comprado â coleçao
	{
		this.livrosComprados.add(livro);
	}
	public List<Livro> getLivrosComprados() 
	{
		return this.livrosComprados;
	}
	public List<Revista> getRevistaComprados() 
	{
		return this.revistasCompradas;
	}
	public void setRevistasCompradas(Revista revista)
	{
		this.revistasCompradas.add(revista);
	}
	public List<Cliente> getListaClientes()
	{
		return this.listaClientes;
	}
	public void registrarCliente(Cliente cliente) 
	{
		List<Cliente> lista = this.getListaClientes();
		lista.add(cliente);
	}
	public Cliente getCliente() 
	{
		return new Cliente(this.getNome(),this.getRG(),this.getEndereco(),this.getCelular());
	}
	public Cliente pesquisarCliente(String nome) 
	{
		for(int a = 0; a < this.getListaClientes().size();a++) 
		{
			if(this.getListaClientes().get(a).getNome().equalsIgnoreCase(nome)) 
			{
				return this.getListaClientes().get(a); 
			}
		}
		return null;
	}
	public boolean editarCliente(String nome, RG rg,Endereco endereco, Celular celular) 
	{
		Cliente c = this.pesquisarCliente(nome);
		if(c != null ) 
		{
			c.setNome(nome);
			c.setRG(rg);
			c.setCelular(celular);
			c.setEndereco(endereco);
			return true;
		}
		return false;
	}
	public boolean deletarCliente(String nome) 
	{
		for(int a = 0; a < this.getListaClientes().size();a++) 
		{
			if(this.getListaClientes().get(a).getNome().equalsIgnoreCase(nome)) 
			{
				this.getListaClientes().remove(a);
				return true;
			}
		}
		return false;
	}
}
