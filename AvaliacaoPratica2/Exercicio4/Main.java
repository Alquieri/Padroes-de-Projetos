package AvaliacaoPratica2.Exercicio4;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("========= TESTE 1: SUCESSO =========");
        PipelineValidacao pipeline = new PipelineValidacao();
        DocumentoFiscal doc1 = new DocumentoFiscal("<NFe>Conteúdo OK</NFe>");
        pipeline.executar(doc1);


        System.out.println("\n========= TESTE 2: FALHA NO CERTIFICADO =========");
        PipelineValidacao pipeline2 = new PipelineValidacao();
        DocumentoFiscal doc2 = new DocumentoFiscal("<NFe>CERTIFICADO_VENCIDO</NFe>");
        pipeline2.executar(doc2);


        System.out.println("\n========= TESTE 3: CIRCUIT BREAKER =========");
        PipelineValidacao pipeline3 = new PipelineValidacao();
        DocumentoFiscal doc3 = new DocumentoFiscal(
            "<NFe>CERTIFICADO_VENCIDO, IMPOSTO_ERRADO, DUPLICADA</NFe>");
        
        IValidador v1 = new ValidadorSchemaXML() {
            protected void executarValidacao(DocumentoFiscal d) throws Exception {
                throw new Exception("Falha Forçada 1");
            }
        };
        IValidador v2 = new ValidadorSchemaXML() {
            protected void executarValidacao(DocumentoFiscal d) throws Exception {
                throw new Exception("Falha Forçada 2");
            }
        };
        IValidador v3 = new ValidadorSchemaXML() {
            protected void executarValidacao(DocumentoFiscal d) throws Exception {
                throw new Exception("Falha Forçada 3");
            }
        };
        IValidador v4 = new ValidadorRegrasFiscais(); 
        
        v1.setProximo(v2);
        v2.setProximo(v3);
        v3.setProximo(v4);
        
        v1.processar(doc3);


        System.out.println("\n========= TESTE 4: ROLLBACK =========");
        PipelineValidacao pipeline4 = new PipelineValidacao();
        DocumentoFiscal doc4 = new DocumentoFiscal("<NFe>SEFAZ_OFFLINE</NFe>");
        pipeline4.executar(doc4);
    }
    
}
