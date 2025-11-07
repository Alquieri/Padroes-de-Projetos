package AvaliacaoPratica2.Exercicio1;

public class RiskProcessor {

    private RiskAnalysisStrategy estrategiaAtual;

    public RiskProcessor(RiskAnalysisStrategy estrategiaInicial) {
        this.estrategiaAtual = estrategiaInicial;
    }

    public void setEstrategia(RiskAnalysisStrategy novaEstrategia) {
        System.out.println("\n--- Trocando algoritmo de risco ---");
        this.estrategiaAtual = novaEstrategia;
    }

    public String processarRisco(FinancialContext context) {
        if (estrategiaAtual == null) {
            return "ERRO: Nenhuma estratégia de análise definida.";
        }
        
        return estrategiaAtual.analisar(context);
    }
}