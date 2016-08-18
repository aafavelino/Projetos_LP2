public class Quadrado
{
	private double lado;

	public Quadrado(double lado)
	{
		this.lado = lado;
	}

	public Quadrado()
	{
		
	}

	public void setLado(double lado)
	{
		this.lado = lado;
	}

	public double getLado()
	{
		return lado;
	}
	
	public double calcularArea()
	{
		return (lado*lado);
	}
}