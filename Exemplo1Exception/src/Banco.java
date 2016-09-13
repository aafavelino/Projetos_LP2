
public class Banco {
	public void realizarOperacao() throws Exception{
		ContaBancaria c = new ContaBancaria(1000);

			c.sacar(100);
			System.out.println("Ocorreu um erro!");
	
	}
}
