
public class Curtir implements LikeService{


public void curtirpost(Video video,User user)
    {
        video.adicionarCurtida(user);

    }
}
