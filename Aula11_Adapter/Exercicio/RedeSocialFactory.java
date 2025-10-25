package Aula11_Adapter.Exercicio;

public class RedeSocialFactory {


    public GerenciadorMidiaSocial Criar(String tipo){
        if(tipo.equals("Instagram")){
            return new InstragramAdapter(new Instagram());
        }else if (tipo.equals("Twitter")) {
            return new TwitterAdapter(new Twitter());
        }
        return null ;


    }
}
