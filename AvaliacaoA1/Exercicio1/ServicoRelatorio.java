package AvaliacaoA1.Exercicio1;

public class ServicoRelatorio {

    private final FabricaRelatorios fabrica;

    public ServicoRelatorio(FabricaRelatorios fabrica){
        this.fabrica = fabrica;
    }

    public void gerarRelatorioDoDia(){
        System.out.println("Gerando relatório..");
        Relatorio relatorio = fabrica.criarRelatorio();
        relatorio.gerarRelatorio();
        System.out.println("show de bola");
    }

   
    
}