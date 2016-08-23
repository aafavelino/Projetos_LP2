import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;


public class Calculos
{
	public static void main(String[] args) 
	{
		LocalDate idade_gosling = LocalDate.of(1955, 5, 19);
		Period periodo = Period.between(idade_gosling, LocalDate.now());
		System.out.printf("%s anos, %s mês e %s dias\n", periodo.getYears() , periodo.getMonths(), periodo.getDays());

        Duration duracao = Duration.between(LocalTime.parse("03:00:00"), LocalTime.now());
        System.out.println(duracao.getSeconds());
	}
}