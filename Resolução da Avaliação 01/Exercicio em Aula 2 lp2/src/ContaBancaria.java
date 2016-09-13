
public abstract class ContaBancaria {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}
	public void transferir(double valor, ContaBancaria conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	public abstract double calculaSaldo();
}
