import javax.swing.JOptionPane;

public class Usuario
{
	private String nome;
	private String cpf;

	public Usuario(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}

	public Usuario()
	{

	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getCpf()
	{
		return this.cpf;
	}
}