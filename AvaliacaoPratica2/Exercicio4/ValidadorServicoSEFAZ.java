package AvaliacaoPratica2.Exercicio4;

public class ValidadorServicoSEFAZ extends BaseValidador {

    public ValidadorServicoSEFAZ() {
        super(true);
    }

    @Override
    protected String getNome() {
        return "Validador Serviço SEFAZ (Online)";
    }

    @Override
    protected void executarValidacao(DocumentoFiscal doc) throws Exception {
        if (doc.getConteudoXml().contains("SEFAZ_OFFLINE")) {
            throw new Exception("SEFAZ indisponível ou rejeitou a nota");
        }
        System.out.println("... (SEFAZ OK)");
    }
}
