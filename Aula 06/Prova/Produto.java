import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.util.Random;

public class Produto
{
	private String codigoProduto;
	private String nomeProduto;
	private int quantidade;
	private int preco;
	private LocalTime hora;

	public Produto(String codigoProduto, String nomeProduto, int quantidade, int preco)
	{
		Random r = new Random();
		this.codigoProduto = "PROD" + codigoProduto + r.nextInt(999);
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.hora = LocalTime.now();
	}
	public Produto()
	{

	}

	public String getCodigo()
	{
		return this.codigoProduto;
	}

	public void setNomeProd(String nomeProduto)
	{
		this.nomeProduto = nomeProduto;
	}

	public String getNomeProd()
	{
		return this.nomeProduto;
	}	

	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}

	public int getQuantidade()
	{
		return this.quantidade;
	}
	public void setPreco(int preco)
	{
		this.preco = preco;
	}

	public int getPreco()
	{
		return this.preco;
	}

	public LocalTime getHora()
	{
		return this.hora;
	}


}