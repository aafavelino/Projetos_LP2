public class DriveHeater
{
	public static void main(String[] args) {
		Heater temperatura = new Heater(0, 50);
		System.out.println(temperatura.getTemp());

		temperatura.setIncrement(8);
		temperatura.Warmer();
		System.out.println("Warmer teste: " + temperatura.getTemp());
		temperatura.Cooler();
		System.out.println("Cooler teste: " + temperatura.getTemp());

	}
}