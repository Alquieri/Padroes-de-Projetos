package AvaliacaoPratica2.Exercicio1;

public class ExpectedShortfallStrategy implements RiskAnalysisStrategy{

        @Override
        public String analisar(FinancialContext context) {
            double es = context.getValorPortfolio() * context.getVolatilidade() * 2.1; 
            return "RISCO (ES): Perda média nos piores cenários é de " + String.format("%.2f", es);
        }
    
    }
    
