import java.util.HashMap;

public class Suporte
{
    private HashMap <String, String> problema = new HashMap<String, String>();
   
    public Suporte()
    {
        this.problema.put("internet","Verifique o cabo rj45!");
        this.problema.put("liga","Verifique se o estabilizador está ligado!");
        this.problema.put("fogo","Desligue o disjuntor");
        this.problema.put("internet","Verifique o cabo rj45");
    }

    public String getResposta(String resposta)
    {
        for(String percorrer : this.problema)
    }
}