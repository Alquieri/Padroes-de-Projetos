package Avaliacao.Exercicio2;

public class PagamentoCartao implements IProcessadorPagamento {

    public String Numero;
    
    public PagamentoCartao(String Numero){
        this.Numero = Numero;

    }


    public String processarPagamento(Double valor){


        return "Cartão pago com valor de " + valor;
    }
}
