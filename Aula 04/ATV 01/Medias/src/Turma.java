public class Turma
{
	public Aluno aluno1  = new Aluno();
	public Aluno aluno2  = new Aluno();
	public Aluno aluno3  = new Aluno();


	public double calcularMedia()
	{
		return ((aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia())/3.0f);
	}

}