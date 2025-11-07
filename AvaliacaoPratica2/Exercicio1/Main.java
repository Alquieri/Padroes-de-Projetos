package AvaliacaoPratica2.Exercicio1;

public class Main {
    public static void main(String[] args) {

        FinancialContext context = new FinancialContext(1000000.0, 0.15, 30);

        RiskProcessor processor = new RiskProcessor(new ValueAtRiskStrategy());

        System.out.println("--- Primeira Análise ---");
        String resultado1 = processor.processarRisco(context);
        System.out.println(resultado1);

        processor.setEstrategia(new StressTestingStrategy());

        System.out.println("\n--- Segunda Análise (Pós-Troca) ---");
        String resultado2 = processor.processarRisco(context);
        System.out.println(resultado2);
        
        processor.setEstrategia(new ExpectedShortfallStrategy());
        System.out.println("\n--- Terceira Análise (Pós-Troca) ---");
        String resultado3 = processor.processarRisco(context);
        System.out.println(resultado3);
    }
}
