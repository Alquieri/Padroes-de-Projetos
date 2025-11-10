package AvaliacaoPratica2.Exercicio4;

public class ValidadorCertificadoDigital extends BaseValidador {

    public ValidadorCertificadoDigital() {
        super(false); 
    }

    @Override
    protected String getNome() {
        return "Validador Certificado Digital";
    }

    @Override
    protected void executarValidacao(DocumentoFiscal doc) throws Exception {
        if (doc.getConteudoXml().contains("CERTIFICADO_VENCIDO")) {
            throw new Exception("Certificado Digital está vencido");
        }
        System.out.println("... (Certificado Digital OK)");
    }
}