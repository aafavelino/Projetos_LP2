public class Driver
{
	public static void main(String[] args) 
	{
		Fracao fracao_01 = new Fracao();
		Fracao fracao_02 = new Fracao();

		fracao_01.recebeFracao(2,4);
		fracao_02.recebeFracao(3,8);

		fracao_01.multiplicaFracao(fracao_02);
		fracao_01.resultado();

	}
}