import java.text.DecimalFormat;

public class Driver
{
	public static void main(String[] args) {
		Turma turma_de_lp2 = new Turma();
		
		System.out.println(">>> Cadastrando nota do aluno 01...");
			turma_de_lp2.aluno1.prova1.setNotaParte1(4.0f);
			turma_de_lp2.aluno1.prova1.setNotaParte2(2.5f);
			turma_de_lp2.aluno1.prova2.setNotaParte1(1.0f);
			turma_de_lp2.aluno1.prova2.setNotaParte2(7.0f);
		System.out.println(">>> Media do aluno 01: " + turma_de_lp2.aluno1.calcularMedia());


		System.out.println(">>> Cadastrando nota do aluno 02...");
			turma_de_lp2.aluno2.prova1.setNotaParte1(6.5f);
			turma_de_lp2.aluno2.prova1.setNotaParte2(3.5f);
			turma_de_lp2.aluno2.prova2.setNotaParte1(0.0f);
			turma_de_lp2.aluno2.prova2.setNotaParte2(3.0f);
		System.out.println(">>> Media do aluno 02: " + turma_de_lp2.aluno2.calcularMedia());

		System.out.println(">>> Cadastrando nota do aluno 03...");
			turma_de_lp2.aluno3.prova1.setNotaParte1(5.0f);
			turma_de_lp2.aluno3.prova1.setNotaParte2(4.0f);
			turma_de_lp2.aluno3.prova2.setNotaParte1(6.0f);
			turma_de_lp2.aluno3.prova2.setNotaParte2(1.5f);
		System.out.println(">>> Media do aluno 03: " + turma_de_lp2.aluno3.calcularMedia());


		System.out.println(turma_de_lp2.calcularMedia());

	}
}