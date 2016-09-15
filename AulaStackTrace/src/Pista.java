
public class Pista {
	
	public void iniciar() throws PistaException{
		// TODO Auto-generated method stub
		Automovel a = new Automovel();
		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaDaVelocidadePermitidaException e) {
			// TODO Auto-generated catch block
			throw new PistaException("Problema na pista", e);
		}
	}
}
