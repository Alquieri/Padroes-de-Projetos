package AvaliacaoPratica2.Exercicio1;

public class ValueAtRiskStrategy implements RiskAnalysisStrategy {

    public String analisar(FinancialContext context){
        
        double var = context.getValorPortfolio() * context.getVolatilidade() * 1.65; 

        return "RISCO (VaR): Perda potencial é de " + String.format("%.2f", var);
    
    }
    
}
