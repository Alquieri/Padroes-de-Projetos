package AvaliacaoPratica2.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class DocumentoFiscal {
    
    private String conteudoXml;
    private List<String> falhas;
    private boolean dbInsertSucesso = false; 

    public DocumentoFiscal(String conteudoXml) {
        this.conteudoXml = conteudoXml;
        this.falhas = new ArrayList<>();
    }

    public String getConteudoXml() {
        return conteudoXml;
    }

    public void addFalha(String erro) {
        this.falhas.add(erro);
    }
    
    public int getContagemFalhas() {
        return this.falhas.size();
    }
    
    public boolean isAprovadoAteAgora() {
        return this.falhas.isEmpty();
    }

    public boolean isDbInsertSucesso() {
        return dbInsertSucesso;
    }

    public void setDbInsertSucesso(boolean dbInsertSucesso) {
        this.dbInsertSucesso = dbInsertSucesso;
    }
}