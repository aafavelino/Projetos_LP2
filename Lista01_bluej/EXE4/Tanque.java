public class Tanque
	{
		public int tamanho;
		public int litros_disp;

		Tanque()
		{
			tamanho = 50;
			litros_disp = 35;
		}

		public int getTamanho()
		{
			return tamanho;
		}

		public void setTamanho(int _tamanho)
		{
				this.tamanho = _tamanho;
		}

		public int getLitros()
		{
			return litros_disp;
		}

		public void setLitros(int _litros_disp)
		{
				this.litros_disp = _litros_disp;
		}

	}