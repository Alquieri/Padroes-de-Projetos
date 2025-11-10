package AvaliacaoPratica2.Exercicio4;

public class ValidadorBancoDados extends BaseValidador {

    public ValidadorBancoDados() {
        super(true);
    }

    @Override
    protected String getNome() {
        return "Validador Banco de Dados (Duplicidade)";
    }

    @Override
    protected void executarValidacao(DocumentoFiscal doc) throws Exception {
        if (doc.getConteudoXml().contains("DUPLICADA")) {
            throw new Exception("NF-e já existe no banco (Duplicada)");
        }
        
        System.out.println("... (OK, não é duplicada. Inserindo no DB...)");
        doc.setDbInsertSucesso(true);
    }

 @Override
    public void rollback(DocumentoFiscal doc) {
        if (doc.isDbInsertSucesso()) {
            System.out.println("### ROLLBACK (Banco de Dados): Deletando registro inserido...");
            doc.setDbInsertSucesso(false);
        }
        
        super.rollback(doc); 
    }
}
