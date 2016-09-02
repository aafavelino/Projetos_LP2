
public class FiguraComplexa extends Figura {
	private Figura[] figuras;

	public FiguraComplexa(Figura[] figuras) {

		this.figuras = figuras;
	}

	public double calculaArea() {
		double total = 0.0;
		for (Figura figura : figuras) {
			total += figura.calcularArea();
		}
		return total;
	}

}
