import java.util.Scanner;

public class Palavras
{
	public static void main(String[] args) {
		Scanner rw = new Scanner(System.in);
		String text;
		

		System.out.println(">>> Informe a String: ");
		text = rw.nextLine();

		


		Contador objeto = new Contador(text);

		objeto.quebra();
		objeto.conta();

		


		
	}
} 