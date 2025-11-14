package AvaliacaoA1.Exercicio1;

public class FabricaRelatorioSemanal implements FabricaRelatorios {

    @Override
    public Relatorio criarRelatorio() {
       return  new RelatorioSemanal();
    }
    
}
