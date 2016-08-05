public class Carro
{
	public int marcha;
	public String cor;
	public int velocidade;
	public int velocidade_max;
	public float autonomia;
	public int quilometragem;

	Carro()
	{
		marcha = 1;
		cor = "Preto";
		velocidade = 0;
		velocidade_max = 220;
		autonomia = 13.5f;
		quilometragem = 0;
	}

	public int getQuilometragem()
	{
		return quilometragem;
	}

	public void setQuilometragem(int km)
	{
		this.quilometragem = km;
	}

	public float autonomia()
	{
		return autonomia;
	}

	public void acelerar(int veloc)
	{
		if (velocidade <= velocidade_max) {
			this.velocidade += veloc;
		}
		
	}
	public void freiar(int veloc)
	{
		if (velocidade > 0) {
			this.velocidade -= veloc;	
		}
		
	}

	public int getVelocidade()
	{
		return velocidade;
	}

	public void abastecer(int quant)
	{
		Tanque obj = new Tanque();
		if ((obj.getLitros() + quant) <= obj.getTamanho()) {
			obj.setLitros(quant);
		}
		else
		{
			System.out.println("Tanque cheio!");
		}
	}


	public void painel()
	{
		Carro obj = new Carro();
		System.out.println("velocidade: " + obj.getVelocidade() + "Km/h");
		System.out.println("Km rodados: " + obj.getQuilometragem());
		System.out.println("Km/L: " + obj.autonomia());	
	}

	public void funcionar()
	{
		Tanque tanque = new Tanque();
		Portas portas = new Portas();
		Motor motor = new Motor();
		Rodas rodas = new Rodas();

		if((portas.getPorta()== false) && (tanque.getLitros() != 0) && (motor.getEstado() == false))
		{
			System.out.println(">>> Ligando Carro!");
			motor.setEstado(true);
		}
	}
}