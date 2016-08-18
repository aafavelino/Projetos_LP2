import java.util.*;
public class Turma
{
	ArrayList<Student> turma = new ArrayList<Student>();

	public void addAluno(Student aluno)
	{
		turma.add(aluno);
	}

	public void addAluno(Student aluno)
	{
		turma.remove(aluno);
	}

	public Student listarAlunos(int matricula)
	{
		for (int j = 0; j < turma.size() ; j++) 
		{
			if(turma.getMatricula().get().equals(matricula))
			{
				System.out.println(turma.get().getNome());
			}
		}
	}
		

}
// Adicionar alunos
// Listar alunos
// Remover passando o aluno
// Listar aluno