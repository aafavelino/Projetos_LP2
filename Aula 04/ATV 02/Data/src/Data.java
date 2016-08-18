public class Data
{
	private int dia;
	private int mes;
	private int ano;
	private int hora; 
	private int minuto;
	private int segundo;
	public static final int FORMATO_12H = 12;
	public static final int FORMATO_24H = 24;
	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		if (hora < 24 && hora >= 0) 
			this.hora = hora;
		if(minuto < 60 && minuto >= 0)
			this.minuto = minuto;
		if(segundo < 60 && segundo >= 0)
		this.segundo = segundo;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	public void setHora(int hora)
	{
		this.hora = hora;
	}
	public void setMinuto(int minuto)
	{
		this.minuto = minuto;
	}
	public void setSegundo(int segundo)
	{
		this.segundo = segundo;
	}
	public int getDia()
	{
		return this.dia;
	}
	public int getMes()
	{
		return this.mes;
	}
	public int getAno()
	{
		return this.ano;
	}
	public int getHora()
	{
		return this.hora;
	}
	public int getMinuto()
	{
		return this.minuto;
	}
	public int getSegundo()
	{
		return this.segundo;
	}


	public void imprimir(int formato)
	{
		if(hora != 0)
		{
			if (formato == 12) 
			{
				System.out.println(getDia() + "/" + getMes() + "/" + getAno() + "\t" + getHora() + ":" + getMinuto() + ":" + getSegundo() + " " + ((getHora() > 12)? "PM" : "AM" ));
			}

			if (formato == 24) 
			{
				System.out.println(getDia() + "/" + getMes() + "/" + getAno() + "\t" + getHora() + ":" + getMinuto() + ":" + getSegundo());
			}
		}
		else
		{
				System.out.println(getDia() + "/" + getMes() + "/" + getAno());
		}		

	}
}