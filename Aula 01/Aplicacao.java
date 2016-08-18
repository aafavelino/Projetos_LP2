public class Aplicacao
{
    public static void main(String [] args)
    {
        System.out.println("Olá Mundo!");
        Pessoa p = new Pessoa();
    
        Pessoa p1;
        p1 = new Pessoa();

        p.setNome("Juquinha");
        p.setIdade("20");

        p1.setNome("Paulo Cintura");
        p1.setIdade("21");

        
        System.out.println("p.nome: " + p.getNome());      
        System.out.println("p1.nome: " + p1.getNome());
        
        printf("OIOIOI");
    }
}