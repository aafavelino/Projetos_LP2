
public class Automovel {
	private static final int VELOCIDADE_MAXIMA = 150;
	private int velocidadeAtual;
	
	public void acelerar (int velocidade) throws AcimaDaVelocidadePermitidaException {
		if (velocidadeAtual+velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaDaVelocidadePermitidaException("Excedeu a velocidade maxima!");
		}
		this.velocidadeAtual += velocidade;
	}
	
}
