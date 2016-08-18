public class Pessoa
{
    private String nome;
    private String idade;
    
    //Construtor
    public Pessoa (String nome)
    {
        this.nome = nome;
    } 
    public Pessoa ()
    {
       
    }      

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getIdade()
    {
        return this.idade;
    }
    
    public void printf(String texto)
    {
        System.out.println(texto);
    }
}