
public class Circulo implements AreaCalculavel{
	private double raio;
	private double area;
	
	public void calculaArea() {
		area = Math.PI * raio * raio;
	}

	public void resultado() {
		System.out.printf("Area: %f ", area);
	}

}
