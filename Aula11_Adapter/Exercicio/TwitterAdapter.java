package Aula11_Adapter.Exercicio;

public class TwitterAdapter implements GerenciadorMidiaSocial {

    private Twitter twitter;

    public TwitterAdapter(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public RespostaPublicacao publicar(Publicaçao conteudo) {
        try {
            String texto = conteudo.getTexto();
            String imagem = conteudo.getImagem();

            if (texto == null || texto.isEmpty()) {
                throw new IllegalArgumentException("O Twitter não permite posts sem texto.");
            }

            twitter.postTweet(texto, imagem);

            String urlSimulada = "http://twitter.com/post/" + texto.hashCode();
            return RespostaPublicacao.sucesso(urlSimulada);

        } catch (Exception e) {
            return RespostaPublicacao.falha("Erro ao postar no Twitter: " + e.getMessage());
        }
    }
}