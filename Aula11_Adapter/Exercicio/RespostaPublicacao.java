package Aula11_Adapter.Exercicio;

public class RespostaPublicacao {

    private final boolean sucesso;
    private final String urlPost;
    private final String mensagemErro;

   
    private RespostaPublicacao(boolean sucesso, String urlPost, String mensagemErro) {
        this.sucesso = sucesso;
        this.urlPost = urlPost;
        this.mensagemErro = mensagemErro;
    }

    public static RespostaPublicacao sucesso(String urlPost) {
        return new RespostaPublicacao(true, urlPost, null);
    }

    public static RespostaPublicacao falha(String mensagemErro) {
        return new RespostaPublicacao(false, null, mensagemErro);
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public String getUrlPost() {
        return urlPost;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
}