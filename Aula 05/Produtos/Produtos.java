import java.util.Date;
import java.time.LocalDate;

public class Produtos
{
	private String nome;
	private double peso;
	private LocalDate data_val;

	public Produtos(String nome, double peso, LocalDate data_val)
	{
		this.nome = nome;
		this.peso = peso;
		this.data_val = data_val;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	public void setData(LocalDate data_val)
	{
		this.data_val = data_val;
	}
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public LocalDate getData()
    {
        return this.data_val;
    }
}