package AvaliacaoPratica2.Exercicio2;

public class RespostaAutorizacao {
    private boolean autorizada;
    private String codigoAutorizacao;
    private String erro;


    private RespostaAutorizacao(boolean autorizada, String codigo, String erro) {
        this.autorizada = autorizada;
        this.codigoAutorizacao = codigo;
        this.erro = erro;
    }

    public static RespostaAutorizacao comSucesso(String codigoAutorizacao) {
        return new RespostaAutorizacao(true, codigoAutorizacao, null);
    }


    public static RespostaAutorizacao comErro(String erro) {
        return new RespostaAutorizacao(false, null, erro);
    }
    
    // Getters
    public boolean isAutorizada() { return autorizada; }
    public String getCodigoAutorizacao() { return codigoAutorizacao; }
    public String getErro() { return erro; }
}