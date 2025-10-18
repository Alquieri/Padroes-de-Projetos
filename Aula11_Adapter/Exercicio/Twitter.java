package Aula11_Adapter.Exercicio;

public class Twitter {

    private String texto;
    private String imagem;


    public void postTweet(String texto, String imagem){
        System.out.println("---Twitter---");
        

        System.out.println("Texto postado: " + texto + "  " + imagem );

    }

    
}
