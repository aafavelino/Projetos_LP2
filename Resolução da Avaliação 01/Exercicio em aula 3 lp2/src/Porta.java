
public class Porta implements Cloneable{
	
	private double altura;
	private double largura;
	private boolean aberta;
	
	
	
	public Porta(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public void altura(double altura) {
		this.altura = altura;
	}
	public void largura(double largura) {
		this.largura = largura;
	}
	public void aberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Porta portinha = new Porta(altura, largura);
		return super.clone();
	}
}
