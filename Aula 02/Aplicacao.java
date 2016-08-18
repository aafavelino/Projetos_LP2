import java.util.*;

public class Aplicacao
{
    public static void main (String  [] args)
    {
		//Lista de alunos
		ArrayList<Student> estudantes = new ArrayList<Student>();
	
		//Alunos
        Student estudante_01 = new Student(01, "Ana");
        Student estudante_02 = new Student(02, "Biana");
        Student estudante_03 = new Student(03, "Triana");
        Student estudante_04 = new Student(04, "Poliana");
        Student estudante_05 = new Student(05, "Mariana");
	
		estudantes.add(estudante_01);
		estudantes.add(estudante_02);
		estudantes.add(estudante_03);
		estudantes.add(estudante_04);
		estudantes.add(estudante_05);

		Iterator<Student> it = estudantes.iterator();
		while (it.hasNext()) 
		{
			Student estudante = it.next();

		}
		for (Student nome : estudantes) 
		{
			System.out.println(">>> Nome: " + nome.getNome());
		}

	
    }
}
