package AvaliacaoPratica2.Exercicio4;

public class ValidadorRegrasFiscais extends BaseValidador {

    public ValidadorRegrasFiscais() {
        super(true); // executarApenasSeAprovado = true
    }

    @Override
    protected String getNome() {
        return "Validador Regras Fiscais (Impostos)";
    }

    @Override
    protected void executarValidacao(DocumentoFiscal doc) throws Exception {
        if (doc.getConteudoXml().contains("IMPOSTO_ERRADO")) {
            throw new Exception("Cálculo de impostos (ICMS) não confere");
        }
        System.out.println("... (Impostos OK)");
    }
}