public class Processar
{
	public static String processar(String string)
	{
		if (string == null) 
		{
			return null;	
		}
		string = string.toUpperCase();

		if (string.length() >= 3) 
		{
			return "" + string.charAt(2) + string.charAt(1) + string.charAt(0) + string.substring(3);
		}
		return string;
	}

	public static void main(String[] args) 
	{
        System.out.println(processar(null));
        System.out.println(processar("ab"));
        System.out.println(processar("abcdefg"));			
	}	
}