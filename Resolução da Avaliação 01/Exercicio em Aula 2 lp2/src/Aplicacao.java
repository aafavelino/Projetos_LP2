
public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(200);
		ContaInvestimento ci = new ContaInvestimento(300);
		
		cc.depositar(100);
		cc.sacar(10);
		System.out.println(cc.calculaSaldo());

		ci.depositar(10);
		ci.sacar(10);
		System.out.println(ci.calculaSaldo());
	}

}
