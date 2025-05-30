import java.util.ArrayList;
import java.util.List;
public class Video {
    private String titulo;
    private int id;
    private User dono;
    private List<User> listacurtidas = new ArrayList<>();
    private List<Comentarios> comentarios = new ArrayList<>();

    public Video(int id,String titulo,User dono)
    {
        this.id=id;
        this.titulo=titulo;
        this.dono=dono;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public User getDono()
    {
        return dono;
    }
    public List<User> getCurtidas()
    {
        return listacurtidas;
    }
    public List<Comentarios> getComentarios()
    {
        return comentarios;
    }

    public void adicionarCurtida(User user)
    {
        listacurtidas.add(user);
    }
    public void adicionarComentario(Comentarios novocomentario)
    {
        comentarios.add(novocomentario);
    }




}