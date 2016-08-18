public class Relogio
{
	private Ponteiro ponteiroHora;
	private Ponteiro ponteiroMinuto;
	private Ponteiro ponteiroSegundo;

	public void acertarRelogio(int hora, int minuto, int segundo)
	{
		this.ponteiroHora.posicao(hora);
		this.ponteiroMinuto.posicao(minuto);
		this.ponteiroSegundo.posicao(segundo);
	}

	public int lerHora()
	{
		return this.ponteiroHora;
	}

	public int lerMinuto()
	{
		return this.ponteiroMinuto;
	}

	public int lerSegundo()
	{
		return this.ponteiroSegundo;
	}
}