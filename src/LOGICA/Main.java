package LOGICA;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        int opcao;
        int id_usuario;
        String nome_usuario;
        String nome_video;
        String comentario;
        int id_video;
        Map<Integer,User> usuarios = new HashMap<>();
        Map<Integer,Video> videos = new HashMap<>();
        User usuario;
        Video video;
        do {
            System.out.println("------------- TIK TOK ---------------\nOque deseja realizar ?");
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Postar vídeo");
            System.out.println("3 - Adicionar comentário");
            System.out.println("4 - Adicionar Curtida");
            System.out.println("5 - Ver vídeos");
            System.out.println("6 - listar todos os usuários");
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao)
            {
                case 1:
                    System.out.println("Insira o nome do usuário");
                    nome_usuario = scan.nextLine();

                    usuario = new User (nome_usuario);
                        usuarios.put(usuario.getId(),usuario);
                        System.out.println("Usuário criado com sucesso");
                    break;
                case 2:
                    System.out.println("Insira o nome do título do vídeo");
                    nome_video=scan.nextLine();
                    System.out.println("Insira o id do dono do vídeo");
                    id_usuario = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Insira o id do vídeo");
                    id_video=scan.nextInt();
                    usuario = usuarios.get(id_usuario);
                    video = new Video(id_video,nome_video,usuario);
                    videos.put(video.getId(),video);
                    System.out.println("Vídeo postado com sucesso");
                    break;
                case 3:
                    System.out.println("Insira a id do vídeo que deseja comentar");
                    id_video=scan.nextInt();
                    System.out.println("Insira o id do usuário que irá comentar");
                    id_usuario = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Insira o comentário");
                    comentario = scan.nextLine();
                    usuario=usuarios.get(id_usuario);
                    video = videos.get(id_video);
                    Comentarios comment = new Comentarios(video,usuario,comentario);
                    video.adicionarComentario(comment);
                    System.out.println("Comentário adicionado com sucesso");
                    break;
                case 4:
                    System.out.println("Insira a id do vídeo que deseja curtir");
                    id_video= scan.nextInt();
                    System.out.println("Insira o id do usuário que irá curtir");
                    id_usuario = scan.nextInt();
                    usuario=usuarios.get(id_usuario);
                    video = videos.get(id_video);
                    video.adicionarCurtida(usuario);
                    System.out.println("Vídeo curtido com sucesso");
                    break;
                case 5:
                    FeedService feed = new FeedService();
                    feed.mostraFeed(videos);
                    break;
                case 6:
                    System.out.println("TOTAL DE USUÁRIOS: "+usuarios.size());
                    System.out.println("---------------------");
                    for (User u: usuarios.values())
                {

                    System.out.println("Nome: "+u.getNome()+" id: "+u.getId());
                }

                    


                    

            }


        } while (opcao != 0);


    }
}
