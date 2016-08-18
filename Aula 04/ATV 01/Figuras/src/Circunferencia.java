public class Circunferencia
{
	private double raio;
	public static final double pi = 3.14159265f;

	public Circunferencia(double raio)
	{
		this.raio = raio;
	}
	public Circunferencia()
	{
		
	}

	public void setRaio(double raio)
	{
		this.raio = raio;
	}

	public double getRaio()
	{
		return raio;
	}

	public double calcularArea()
	{
		return (this.raio * this.raio * pi);
	}
}