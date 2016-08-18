public class Student
{
    private int matricula;
    private String nome;

    public Student(int matricula, String nome)
    {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Student()
    {
        
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}