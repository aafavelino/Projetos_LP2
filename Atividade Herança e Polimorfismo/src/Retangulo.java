
public class Retangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return altura * base;
	}
}
