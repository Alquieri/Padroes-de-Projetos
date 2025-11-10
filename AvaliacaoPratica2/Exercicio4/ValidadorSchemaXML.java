package AvaliacaoPratica2.Exercicio4;

public class ValidadorSchemaXML extends BaseValidador {

    public ValidadorSchemaXML() {
        super(false);
    }

    @Override
    protected String getNome() {
        return "Validador Schema XML";
    }

    @Override
    protected void executarValidacao(DocumentoFiscal doc) throws Exception {
        if (doc.getConteudoXml() == null || !doc.getConteudoXml().contains("<NFe>")) {
            throw new Exception("XML mal formado ou não contém a tag <NFe>");
        }
        System.out.println("... (Schema XML validado com sucesso)");
    }
}
