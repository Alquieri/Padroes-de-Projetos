package AvaliacaoA1.Exercicio1;

public class FabricaRelatorioDiario implements FabricaRelatorios 
{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();

    }
    
}
