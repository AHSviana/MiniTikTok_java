package LOGICA;

import java.util.List;
import java.util.Map;

public class FeedService {
    public void mostraFeed(Map<Integer, Video> videos) {
        for (Video v : videos.values())
        {
            System.out.println("Vídeo: " + v.getTitulo() + " | Dono: " + v.getDono().getNome());
            System.out.println("Curtidas: " + v.getCurtidas().size());
            System.out.println("Comentários:");
            for (Comentarios c : v.getComentarios()) {
                System.out.println(" - " + c.getUser().getNome() + ": " + c.getComentario());
            }
            System.out.println("---------------------------------");
        }
    }
}
