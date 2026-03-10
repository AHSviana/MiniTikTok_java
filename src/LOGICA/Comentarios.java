package LOGICA;

public class Comentarios  {
    private String comentario;
    private User user;
    private Video video;
    public Comentarios(Video video,User user, String comentario)
    {   this.video=video;
        this.comentario=comentario;
        this.user=user;
    }

    public Video getVideo()
    {
        return video;
    }
    public void setVideo(Video video)
    {
        this.video=video;
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
