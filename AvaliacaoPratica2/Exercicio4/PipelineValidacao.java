package AvaliacaoPratica2.Exercicio4;

public class PipelineValidacao {

    private IValidador cadeia;

    public PipelineValidacao() {
        IValidador v1 = new ValidadorSchemaXML();
        IValidador v2 = new ValidadorCertificadoDigital();
        IValidador v3 = new ValidadorRegrasFiscais();
        IValidador v4 = new ValidadorBancoDados();
        IValidador v5 = new ValidadorServicoSEFAZ();

        v1.setProximo(v2);
        v2.setProximo(v3);
        v3.setProximo(v4);
        v4.setProximo(v5);

        this.cadeia = v1; 
    }

    public void executar(DocumentoFiscal doc) {
        this.cadeia.processar(doc);

        if (!doc.isAprovadoAteAgora()) {
            System.out.println("\n--- VALIDAÇÃO FALHOU ---");
            System.out.println("Falhas: " + doc.getContagemFalhas());
            
            System.out.println("Iniciando Rollback...");
            this.cadeia.rollback(doc);
            
        } else {
            System.out.println("\n--- DOCUMENTO APROVADO ---");
        }
    }
}