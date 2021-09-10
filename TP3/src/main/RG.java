package main;

public class RG
{
	private String nome,sexo,dataNascimento,dataValidade,ID;
	
	public RG(String nome,String sexo,String dataNascimento,String dataValidade,String ID) 
	{
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.sexo = sexo;
		this.dataValidade = dataValidade;
		this.ID = ID;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return this.nome;
	}
	public void setSexo(String s) 
	{
		this.sexo = s;
	}
	public String getSexo() 
	{
		return this.sexo;
	}
	public void setDataNascimento(String dn) 
	{
		this.dataNascimento = dn;
	}
	public String getDataNascimento() 
	{
		return this.dataNascimento;
	}
	public void setDataValidade(String dv) 
	{
		this.dataValidade = dv;
	}
	public String getDataValidade() 
	{
		return this.dataValidade;
	}
	public void setID(String ID) 
	{
		this.ID = ID;
	}
	public String getID() 
	{
		return this.ID;
	}
	public void editarRG( String nome,String sexo,String dataNascimento,String dataValidade,String ID)
	{
		this.setNome(nome);
		this.setSexo(sexo);
		this.setDataNascimento(dataNascimento);
		this.setDataValidade(dataValidade);
		this.setID(ID);
	}
	
}
