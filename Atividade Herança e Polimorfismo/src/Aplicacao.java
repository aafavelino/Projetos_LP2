
public class Aplicacao {
	public static void main(String [] args) {
		Automovel automovel = new Automovel();
		Motocicleta motocicleta = new Motocicleta();
		Onibus onibus = new Onibus();
		
		automovel.ligar();
		System.out.println(automovel.isLigado());
		motocicleta.ligar();
		motocicleta.desligar();
		System.out.println(motocicleta.isLigado());
		onibus.ligar();
		System.out.println(onibus.isLigado());
	}
}
