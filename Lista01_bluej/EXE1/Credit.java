
/**
 * Exercício 01
 * 
 * @author Adelino
 * @version 02/08/2016
 */

public class Credit
{
    private int total;

    /**
     * Construtores para objetos da classe Credit
     */
    public Credit()
    {
        total = 1000;
    }
    
    public Credit(int creditos)
    {
        if(total < 0)
        {
            System.out.println(">>> Saldo negativo!!!");
            total = 0;
        }
        else
        {
            total = creditos;

        }
    }
    /**
     * Métodos solicidados no exercicio 01
     */

    public int getTotal()
    {
        return this.total;
    }
    
    public void setTotal(int creditos)
    {
        this.total = creditos;
    }

    public void topUp(int recarga)
    {
        this.total += recarga;
    }
    
    public void saque(int saque)
    {
        if(saque <= total)
        {
            this.total -= saque;
        }
        else
        {
            System.out.println(">>> Saldo insuficiente!!!");
        
        }
        
    }
}
