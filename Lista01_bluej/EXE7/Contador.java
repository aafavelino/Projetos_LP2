import java.util.StringTokenizer;

public class Contador
{
	public String texto;
	public int size_str, i = 0;
	public String [] texto_quebrado;

	
	Contador(String frase) 
	{
		texto = frase;
		size_str = texto.length();
		texto_quebrado  = new String[size_str];
	}

	public void quebra()
	{
		StringTokenizer texto = new StringTokenizer(this.texto);

		while(texto.hasMoreTokens())
		{
			texto_quebrado [i] = texto.nextToken();

			i++;
		}

	}

	public void conta()
	{	
		int j, k, x = 1;
		for (j = 0; j < i ;j++ ) 
		{
			for (k = 0; k < i ;k++ ) 
			{
				
				if ((texto_quebrado[j].equals(texto_quebrado[k])) && j !=k) 
				{	
					x++;
				}


			}
			System.out.println(texto_quebrado[j] +": "+ x);
			x = 1;
			}
	}
}