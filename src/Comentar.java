public class Comentar implements CommentService {
    public void comentar(Video video, User user, String texto)
    {
        video.adicionarComentario(new Comentarios(user,texto));
    }
}
