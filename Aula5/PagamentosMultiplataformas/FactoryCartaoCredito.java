package Aula5.PagamentosMultiplataformas;


public class FactoryCartaoCredito extends PagamentoFactory {

    private String numeroCartao;


    public FactoryCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCartaoCredito(this.numeroCartao);
    }
}