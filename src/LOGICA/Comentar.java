package LOGICA;

import INTERFACES.CommentService;

public class Comentar implements CommentService {
    public void comentar(Video video, User user, String texto)
    {
        video.adicionarComentario(new Comentarios(video,user,texto));
    }
}
