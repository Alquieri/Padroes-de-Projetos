package Aula11_Adapter.Exercicio;

public class TwitterAdapter implements GerenciadorMidiaSocial{
    private Twitter twitter;

    public TwitterAdapter(Twitter twitter){
        this.twitter = twitter;
    }

    public void publicar(Publicaçao conteudo){

        

        twitter.postTweet(conteudo.getTexto(), conteudo.getImagem());


    }
    
}
