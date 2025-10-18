package Aula11_Adapter.Exercicio;
import java.sql.Date;

public class Publicaçao {
    private String texto;
    private String imagem;
    private String video;
    private String dataDePublicaçao;
 
    public Publicaçao(String texto ,String imagem, String video, String dataDePublicação){
        this.texto = texto;
        this.imagem = imagem;
        this.video = video;
        this.dataDePublicaçao = dataDePublicação;
    }

    public String getTexto() {
        return texto;
    }
    public String getImagem() {
        return imagem;
    }
    public String getVideo() {
        return video;
    }
    public String  getDataDePublicaçao() {
        return dataDePublicaçao;
    }


}
