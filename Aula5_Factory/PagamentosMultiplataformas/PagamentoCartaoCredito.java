package Aula5_Factory.PagamentosMultiplataformas;

public class PagamentoCartaoCredito implements iPagamento {
    
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento(double valor) {

        if (numeroCartao != null && numeroCartao.length() == 16) {
     
            return "Pagamento de R$" + valor + " aprovado no cartão " + numeroCartao;
        } else {
 
            return "Erro: Número de cartão inválido.";
        }
    
    }
}
