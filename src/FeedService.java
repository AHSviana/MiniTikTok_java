import java.util.List;

public class FeedService {
    public void mostraFeed(List<Video> videos) {
        for (Video video : videos) {
            System.out.println("Vídeo: " + video.getTitulo() + " | Dono: " + video.getDono().getNome());
            System.out.println("Curtidas: " + video.getCurtidas().size());
            System.out.println("Comentários:");
            for (Comentarios comment : video.getComentarios()) {
                System.out.println(" - " + comment.getUser().getNome() + ": " + comment.getComentario());
            }
            System.out.println("---------------------------------");
        }
    }
}
