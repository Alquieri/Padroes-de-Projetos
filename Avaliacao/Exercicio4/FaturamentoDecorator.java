package Avaliacao.Exercicio4;

public class FaturamentoDecorator extends RelatorioDecorator {

    public FaturamentoDecorator(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudoOriginal = super.gerar();
        
        String novaInformacao = "\n--- Seção de Faturamento ---";
        
        return conteudoOriginal + novaInformacao;
    }
}