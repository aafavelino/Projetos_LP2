
public class Ferrari implements Carro, ItemCaro{

	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virando à Esquerda...");
		
	}

	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virando à Direita...");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari acelerando...");
		
	}

	@Override
	public void abrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari abrindo a porta...");
		
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
