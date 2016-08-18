public class Fracao
{
	private int numerador;
	private int denominador;
	private Fracao nova_fracao;

	public void recebeFracao(int numerador, int denominador)
	{
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador()
	{
		return this.numerador;
	}

	public void setNumerador(int numerador)
	{
		this.numerador = numerador;
	}
	public void setDenominador(int denominador)
	{
		this.denominador = denominador;
	}

	public int getDenominador()
	{
		return this.denominador;
	}

	public Fracao multiplicaFracao(Fracao outra_fracao)
	{
		nova_fracao = new Fracao();

		nova_fracao.setNumerador(this.numerador * outra_fracao.getNumerador());
		nova_fracao.setDenominador(this.denominador * outra_fracao.getDenominador());
		return nova_fracao;
	}

	public void resultado()
	{
		System.out.println(((float)nova_fracao.getNumerador()/nova_fracao.getDenominador()));
	}
}