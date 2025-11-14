package AvaliacaoA1.Exercicio1;

public class Main {
    public static void main(String[] args) {
        FabricaRelatorios fabricaDiaria = new FabricaRelatorioDiario();
        
        ServicoRelatorio servico = new ServicoRelatorio(fabricaDiaria);
        
        servico.gerarRelatorioDoDia();
        
        FabricaRelatorios fabricaSemanal = new FabricaRelatorioSemanal();
        
        servico = new ServicoRelatorio(fabricaSemanal);
        
        servico.gerarRelatorioDoDia();
    }
}
