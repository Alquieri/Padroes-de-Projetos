package Aula5.PagamentosMultiplataformas;

public class FactoryCriptomoeda extends PagamentoFactory {

    private double saldoEmCarteira;

    public FactoryCriptomoeda(double saldoEmCarteira) {
        this.saldoEmCarteira = saldoEmCarteira;
    }

    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCriptomoeda(this.saldoEmCarteira);
    }
}