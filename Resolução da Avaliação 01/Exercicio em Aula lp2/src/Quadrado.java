
public class Quadrado implements AreaCalculavel{
	private double lado;
	private double area;
	
	public void calculaArea() {
		area = lado * lado;
	}
	
	public void resultado() {
		System.out.printf("Area: %f ", area);
	}

}
