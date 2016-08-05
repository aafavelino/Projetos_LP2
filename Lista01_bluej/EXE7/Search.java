import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

	public static void main(String[] args) {

		Search sr = new Search();

		// Texto
		String texto = "lucasTestelucastesteLucastesteucastestelucas";

		// Mostra
		System.out.println("Total:" + sr.countIndexOf(texto, "teste"));
		System.out.println("Total:" + sr.countExpressao(texto, "teste"));
	}

	// Contagem usando Expressao regular
	private int countExpressao(String texto, String valor) {
		int count = 0;

		if (texto != null) {
			// Onde registramos a expressão regular
			Pattern pattern = Pattern.compile(valor);

			// Onde registramos o comparador
			Matcher matcher = pattern.matcher(texto);

			// Loop para verificar o que foi encontrado
			while (matcher.find()) {
				count++;
			}
		}
		
		return count;

	}

	// Contagem usando INDEX OF
	private int countIndexOf(String texto, String valor) {
		int pos = 0;
		int count = 0;

		if (texto != null) {
			// Procura a proxima ocorrencia da palavra
			pos = texto.indexOf(valor);

			// Enquanto encontrar outras ocorrencias, ele soma contador
			while (pos >= 0) {
				++count;

				// Procura a proxima ocorrencia a partir do ultimo ponto
				pos = texto.indexOf(valor, pos + 1);
			}

		}

		return count;
	}
}