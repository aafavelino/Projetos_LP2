
public class Principal {
	public static void main(String[] args) {
		/*	ContaBancaria c = new ContaBancaria(1000);
		try {
			c.sacar(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro! " + e.getMessage());
		}
		}*/
		/*Banco c = new Banco();
		
		try {
			c.realizarOperacao();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}*/
		Banco c = new Banco();
		
		try {
			c.realizarOperacao();
		} catch (SaldoInsuficienteException e) {
			// TODO: handle exception
			System.out.println("Você tentou sacar: " + e.getValor() + " mas só tem de saldo: " + e.getSaldo());
		} catch (ValorNegativoException e) {
			// TODO: handle exception
			System.out.println("Você tentou realizar um saque " + "com valor negativo de: " + e.getValor());
		}
		
	}
}
