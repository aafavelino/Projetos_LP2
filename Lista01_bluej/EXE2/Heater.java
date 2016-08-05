public class Heater
{
	public int temperature;
	public int min;
	public int max;
	public int increment;

	Heater(int min,  int max)
	{
		temperature = 15;
		increment = 5;
		this.min = min;
		this.max = max;
	}
	Heater()
	{
		temperature = 15;
		increment = 5;
	}
	public void Warmer()
	{
		if(temperature < max)
		{
			this.temperature += increment;
		}
		else
		{
			System.out.println(">>> Temperatura elevada!");
		}

	}

	public void Cooler()
	{
		if(temperature > min)
		{
			this.temperature -= increment;
		}
		else
		{
			System.out.println(">>> Temperatura baixa!");
		}
	}

	public int getTemp()
	{
		return temperature;
	}

	public void setIncrement(int inc)
	{
		if(inc > 0)
		{
			this.increment = inc;
		}
		else
		{
			System.out.println(">>> Valor inválido!");
		}
	}
}