
public class Ponto2D {
	protected double x;
	protected double y;
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String x, y;
		x = String.valueOf(this.x);
		y = String.valueOf(this.y);		
		return x+" "+ y;
	}
}
