package Avaliacao.Exercicio2;

public class PagamentoBoleto implements IProcessadorPagamento {
    public String codigo;

    public PagamentoBoleto(String codigo){
        this.codigo = codigo;
    }

    public String processarPagamento(Double valor){

        return "Boleto pago com valor de " + valor;

    }
    
}
