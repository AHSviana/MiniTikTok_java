import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        User user1 = new User("Ana",1);
        User user2 = new User("Pedro",2);


        Video video1 = new Video(1, "Dancinha", user1);
        Video video2 = new Video(2, "Tutorial de Java", user2);


        Curtir curtir = new Curtir();
        Comentar comentar = new Comentar();
        FeedService feedService = new FeedService();


        curtir.curtirpost(video1, user2);
        curtir.curtirpost(video1, user2);
        
        comentar.comentar(video1, user2, "Muito bom!");

        curtir.curtirpost(video2, user1);
        comentar.comentar(video2, user1, "Gostei bastante !!!");


        List<Video> feed = new ArrayList<>();
        feed.add(video1);
        feed.add(video2);

        feedService.mostraFeed(feed);
    }
}
