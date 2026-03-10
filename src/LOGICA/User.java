package LOGICA;

public class User
{
    private static int nextid=1;
    private String nome;
    private int id ;


    public User(String nome)
    {
        this.nome = nome;
        this.id = nextid++;
    }

    public String getNome()
    {
        return nome;
    }

    public int getId()
    {
        return id;
    }


public void mostraDados()
{
    System.out.println(getNome());
    System.out.println(getId());
}



}
