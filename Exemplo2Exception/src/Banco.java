
public class Banco {
	public void realizarOperacao() throws SaldoInsuficienteException, ValorNegativoException{
		ContaBancaria c = new ContaBancaria(1000);

			c.sacar(100);
			System.out.println("Sucesso!");
	
	}
}
