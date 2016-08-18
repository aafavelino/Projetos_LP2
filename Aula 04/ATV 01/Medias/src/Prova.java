public class Prova
{
	private double notaParte1;
	private double notaParte2;

	public void setNotaParte1(double notaParte1)
	{
		if(notaParte1 <= 10.0f)
			this.notaParte1 = notaParte1;
		else
			System.out.println(">>> Informe uma nota entre 0 e 10!");		
	}

	public void setNotaParte2(double notaParte2)
	{
		if(notaParte2 <= 10.0f)
			this.notaParte2 = notaParte2;
		else
			System.out.println(">>> Informe uma nota entre 0 e 10!");
	}

	public double calcularNotaTotal()
	{
		return ((this.notaParte1 * 0.5f + this.notaParte2 * 0.5f));
	}

}