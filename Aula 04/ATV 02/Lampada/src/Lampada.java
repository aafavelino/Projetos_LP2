public class Lampada
{
	private boolean estado;

	public Lampada(boolean estado)
	{
		this.estado = estado;
	}

	public void ligar()
	{
		this.estado = true;
	}

	public void desligar()
	{
		this.estado = false;
	}

	public void imprimir()
	{
		if (this.estado == true) 
			System.out.println("Lampada ligada");
		else
			System.out.println("Lampada desligada");

	}
}