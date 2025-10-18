package Aula11_Adapter.Exercicio;

public class InstragramAdapter implements GerenciadorMidiaSocial{
    private Instagram instagram;

    public InstragramAdapter(Instagram instagram){
        this.instagram = instagram;

    }

    @Override
    public void publicar(Publicaçao conteudo) {

        instagram.PostStory(conteudo.getImagem(), conteudo.getVideo());

    }

    
}
