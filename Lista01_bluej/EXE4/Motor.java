	public class Motor
	{
		public String combustivel;
		public float cilindradas;
		public boolean estado;

		Motor()
		{
			estado = false;
			cilindradas = 1.3f;
			combustivel = "Flex";
		}

		public boolean getEstado()
		{
			return estado;
		}

		public void setEstado(boolean _estado)
		{
				this.estado = _estado;
		}

		public float getCilindradas()
		{
			return cilindradas;
		}

		public void setCilindradas(float _cilindradas)
		{
				this.cilindradas = _cilindradas;
		}

		public String getCombustivel()
		{
			return combustivel;
		}

		public void setCombustivel(String _combustivel)
		{
				this.combustivel = _combustivel;
		}
	}	