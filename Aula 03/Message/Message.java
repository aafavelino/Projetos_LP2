public class Message
{
    private String texto;

    public Message(String texto)
    {
        this.texto = texto;
    } 

    public String getText()
    {
        return this.texto;
    }

    public void printTexto(String texto)
    {
        System.out.println(texto);
    }
}