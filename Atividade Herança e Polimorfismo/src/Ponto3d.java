
public class Ponto3d extends Ponto2D{
	private double z;
	
	public Ponto3d(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		String z;
		z = String.valueOf(this.z);
		return super.toString() + " " + z;
	}
	
	
}
