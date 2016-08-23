import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args) 
	{
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        
		LocalDate data_f = LocalDate.of(2020,10,04);
		produtos.add(new Produtos("Feijao", 2.5, data_f));
		LocalDate data_c = LocalDate.of(2022,01,01);
		produtos.add(new Produtos("Cafe", 1.0, data_c));
		LocalDate data_b = LocalDate.of(2017,11,12);
		produtos.add(new Produtos("Beterraba", 0.9, data_b));

        int i = 1;
        for (Produtos it : produtos) {
            System.out.printf("%d) %12s %09.2f %s\n", i, it.getNome(), it.getPeso(), it.getData());
            i++;
        }
	}
}