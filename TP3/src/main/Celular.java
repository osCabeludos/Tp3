package main;

public class Celular
{
	private int ddd;
	private int numero;
	private Celular celular;
	
	public Celular(int ddd,int numero) 
	{
		this.ddd = ddd;
		this.numero = numero;
		this.celular = null;
	}
	public void setDDD(int ddd) 
	{
		this.ddd = ddd;
	}
	public int getDDD() 
	{
		return this.ddd;
	}
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	public int getNumero() 
	{
		return this.numero;
	}
	public void registrarCelular()
	{
		this.celular = new Celular(this.getDDD(),this.getNumero());
	}
	public void editarCelular(int ddd, int numero)
	{
		this.setDDD(ddd);
		this.setNumero(numero);
	}
	
}
