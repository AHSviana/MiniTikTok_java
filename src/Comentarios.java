public class Comentarios  {
    private String comentario;
    private User user;
    public Comentarios(User user,String comentario)
    {
        this.comentario=comentario;
        this.user=user;
    }

    public User getUser()
    {
        return user;
    }

    public String getComentario()
    {
        return comentario;
    }

}
