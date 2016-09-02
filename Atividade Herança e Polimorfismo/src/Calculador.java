
public class Calculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado1 = new Quadrado(3.0,3.0);
		Quadrado quadrado2 = new Quadrado(10.0,10.0);
		Retangulo retangulo1 = new Retangulo(2.0, 7.0);
		Retangulo retangulo2 = new Retangulo(5.0, 3.0);
		Figura [] figuras = new Figura[4];
		figuras[0] = quadrado1;
		figuras[1] = quadrado2;
		figuras[2] = retangulo1;
		figuras[3] = retangulo2;
		FiguraComplexa figura_complexa = new FiguraComplexa(figuras);
		System.out.println(figura_complexa.calculaArea());
	}

}
