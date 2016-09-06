
public class Carro extends Veiculo{
	private boolean quatroPortas;
	private int chassi;
	
	public Carro(String marca) {
		super(marca);
		System.out.println("Carro()");
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("4 Portas: " + this.quatroPortas);
	}
	
	@Override
	public String toString() {
		return this.marca;
	}

}
