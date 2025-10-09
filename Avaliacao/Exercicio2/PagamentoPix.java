package Avaliacao.Exercicio2;

public class PagamentoPix implements IProcessadorPagamento {

    public String chave;

    public PagamentoPix(String chave){

        this.chave = chave;
        
    }

    public String processarPagamento(Double valor){

        return "Feito um PIX com valor de " + valor;
    }
    
}
