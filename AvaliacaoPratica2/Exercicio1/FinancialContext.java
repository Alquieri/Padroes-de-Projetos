package AvaliacaoPratica2.Exercicio1;

public class FinancialContext {
    private double valorPortfolio;
    private double volatilidade;
    private int prazoEmDias;

    public FinancialContext(double valorPortfolio, double volatilidade, int prazoEmDias) {
        this.valorPortfolio = valorPortfolio;
        this.volatilidade = volatilidade;
        this.prazoEmDias = prazoEmDias;
    }

    public double getValorPortfolio() { return valorPortfolio; }
    public double getVolatilidade() { return volatilidade; }
    public int getPrazoEmDias() { return prazoEmDias; }
}