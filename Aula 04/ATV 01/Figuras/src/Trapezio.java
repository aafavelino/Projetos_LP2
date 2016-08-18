public class Trapezio
{
	private double base_maior;
	private double base_menor;
	private double altura;

	public Trapezio(double base_menor, double base_maior, double altura)
	{
		this.base_menor = base_menor;
		this.base_maior = base_maior;
		this.altura = altura;
	}

	public Trapezio()
	{
		
	}

	public void setBase_menor(double base_menor)
	{
		this.base_menor = base_menor;
	}
	public void setBase_maior(double base_maior)
	{
		this.base_maior = base_maior;
	}
	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public double getBase_menor()
	{
		return base_menor;
	}

	public double getBase_maior()
	{
		return base_maior;
	}

	public double getAltura()
	{
		return altura;
	}
	
	public double calcularArea()
	{
		return (((base_menor + base_maior)/2)*altura);
	}
	
}