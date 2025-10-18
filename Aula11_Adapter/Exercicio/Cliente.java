package Aula11_Adapter.Exercicio;

public class Cliente {

    public static void main(String[] args) {
        
        Publicaçao minhaPublicacao = new Publicaçao("11", "22", "33", "12/08/2002");


        GerenciadorMidiaSocial gerenciador1 = new TwitterAdapter(new Twitter());
        GerenciadorMidiaSocial gerenciador2 = new InstragramAdapter(new Instagram());
        gerenciador1.publicar(minhaPublicacao); 
        gerenciador2.publicar(minhaPublicacao); 
   
    }
    
    
}
