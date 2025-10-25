package Aula11_Adapter.Exercicio;

public class InstragramAdapter implements GerenciadorMidiaSocial {

    private Instagram instagram;

    public InstragramAdapter(Instagram instagram) {
        this.instagram = instagram;
    }

    @Override
    public RespostaPublicacao publicar(Publicaçao conteudo) {
        try {
            String imagem = conteudo.getImagem();
            String video = conteudo.getVideo();

            if ((imagem == null || imagem.isEmpty()) && (video == null || video.isEmpty())) {
                throw new IllegalArgumentException("Instagram exige uma imagem ou vídeo para postar.");
            }

            instagram.PostStory(imagem, video);

            String idSimulado = "http://instagram.com/story/" + (imagem != null ? imagem.hashCode() : video.hashCode());
            return RespostaPublicacao.sucesso(idSimulado);

        } catch (Exception e) {
            return RespostaPublicacao.falha("Erro ao postar no Instagram: " + e.getMessage());
        }
    }
}