package Avaliacao.Exercicio4;

public abstract class RelatorioDecorator implements IRelatorio {
    protected IRelatorio relatorioDecorado;

    public RelatorioDecorator(IRelatorio relatorio) {
        this.relatorioDecorado = relatorio; 
    }

    @Override
    public String gerar() {
        return relatorioDecorado.gerar();
    }
}