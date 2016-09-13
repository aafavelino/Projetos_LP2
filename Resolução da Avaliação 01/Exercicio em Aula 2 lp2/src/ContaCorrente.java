
public class ContaCorrente extends ContaBancaria{

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSaldo() {
		return this.getSaldo() - this.getSaldo() * 10/100;
	}


}
