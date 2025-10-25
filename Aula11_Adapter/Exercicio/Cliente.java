package Aula11_Adapter.Exercicio;

public class Cliente {

    public static void main(String[] args) {

        Publicaçao minhaPublicacao = new Publicaçao("Meu post de teste!", "imagem-legal.png", "video-show.mp4", "2025-10-24");

        RedeSocialFactory minhaFabrica = new RedeSocialFactory();

        GerenciadorMidiaSocial gerenciadorTwitter = minhaFabrica.Criar("Twitter");
        GerenciadorMidiaSocial gerenciadorInstagram = minhaFabrica.Criar("Instagram");

        RespostaPublicacao respostaTwitter = gerenciadorTwitter.publicar(minhaPublicacao);

        if (respostaTwitter.isSucesso()) {
            System.out.println("   SUCESSO! Postado em: " + respostaTwitter.getUrlPost());
        } else {
            System.out.println("   FALHA: " + respostaTwitter.getMensagemErro());
        }

        RespostaPublicacao respostaInstagram = gerenciadorInstagram.publicar(minhaPublicacao);

        if (respostaInstagram.isSucesso()) {
            System.out.println("   SUCESSO! Postado em: " + respostaInstagram.getUrlPost());
        } else {
            System.out.println("   FALHA: " + respostaInstagram.getMensagemErro());
        }

        System.out.println("\n--- Testando um post inválido (sem texto) no Twitter ---");
        Publicaçao postRuim = new Publicaçao(null, "imagem.png", null, "2025-10-24");
        RespostaPublicacao respostaFalha = gerenciadorTwitter.publicar(postRuim);

        if (!respostaFalha.isSucesso()) {
            System.out.println("   FALHA (esperada): " + respostaFalha.getMensagemErro());
        }
    }
}