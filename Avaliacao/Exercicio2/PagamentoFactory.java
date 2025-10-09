package Avaliacao.Exercicio2;


public class PagamentoFactory {


    public IProcessadorPagamento CriarPagamento(String tipo, String dados){
        IProcessadorPagamento pagamento;

        if (tipo.equals("boleto")){
            pagamento = new PagamentoBoleto(dados);
        }

        else if (tipo.equals("pix")){
            pagamento = new PagamentoPix(dados);
        }

        else if (tipo.equals("cartao")){
            pagamento = new PagamentoCartao(dados);
        }
        else {
            pagamento = null;

        }
            
        return pagamento; 


    }


    
}
