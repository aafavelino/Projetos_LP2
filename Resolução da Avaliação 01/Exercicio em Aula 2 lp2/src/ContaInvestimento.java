
public class ContaInvestimento extends ContaBancaria {

	public ContaInvestimento(double saldo) {
		this.saldo = saldo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSaldo() {
		return this.getSaldo() + this.getSaldo() * 5/100;
	}

}
