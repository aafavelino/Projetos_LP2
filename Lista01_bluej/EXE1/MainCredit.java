public class MainCredit{
	public static void main(String[] args) {
		Credit saldo = new Credit();
		System.out.println(">>> Saldo Inicial: R$ " + saldo.getTotal() );	

		saldo.setTotal(500);

		System.out.println(">>> Saldo Modificado: R$ " + saldo.getTotal() );

		saldo.topUp(-500);	
		System.out.println(">>> Saldo topUp: R$ " + saldo.getTotal() );	
		saldo.saque(540);
		System.out.println(">>> Saldo depois do saque: R$ " + saldo.getTotal() );
	}
}