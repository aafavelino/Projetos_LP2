public class Aluno
{
	public Prova prova1 = new Prova();
	public Prova prova2 = new Prova();

	public double calcularMedia()
	{
		return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal());
	}

}