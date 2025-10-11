package Avaliacao.Exercicio4;

public class ExportacaoDecorator extends RelatorioDecorator {

    private String formato;

    public ExportacaoDecorator(IRelatorio relatorio, String formato) {
        super(relatorio);
        this.formato = formato;
    }

    @Override
    public String gerar() {
        return super.gerar() + "\n--- [Exportado para " + this.formato + "] ---";
    }
}