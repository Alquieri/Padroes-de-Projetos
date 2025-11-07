package AvaliacaoPratica2.Exercicio1;

public class StressTestingStrategy implements RiskAnalysisStrategy {
    
        @Override
        public String analisar(FinancialContext context){
        
        double perda = context.getValorPortfolio() * 0.30; 
        return "RISCO (Stress): Perda em cenário extremo é de " + String.format("%.2f", perda);
        
    }
    
}
