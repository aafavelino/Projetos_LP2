
public class Retangulo implements AreaCalculavel{
	private double base;
	private double altura;
	private double area;
	
	public void calculaArea() {
		area = base * altura;
	}

	public void resultado() {
		System.out.printf("Area: %f ", area);
	}

}
