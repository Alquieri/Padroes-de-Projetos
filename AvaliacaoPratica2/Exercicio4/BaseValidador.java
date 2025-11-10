package AvaliacaoPratica2.Exercicio4;

public abstract class BaseValidador implements IValidador {

    protected IValidador proximo;
    
    private boolean executarApenasSeAprovado;

    public BaseValidador(boolean executarApenasSeAprovado) {
        this.executarApenasSeAprovado = executarApenasSeAprovado;
    }

    @Override
    public void setProximo(IValidador proximo) {
        this.proximo = proximo;
    }

    @Override
    public final void processar(DocumentoFiscal doc) {
        
        if (doc.getContagemFalhas() >= 3) {
            System.out.println("!!! CIRCUIT BREAKER: 3+ falhas. Cadeia interrompida. " + 
                                getNome() + " não será executado.");
            return; 
        }

        if (this.executarApenasSeAprovado && !doc.isAprovadoAteAgora()) {
            System.out.println("... CONDICIONAL: " + getNome() + 
                                " pulado (requer aprovação anterior).");
            
            chamarProximo(doc);
            return;
        }

        System.out.println("--- Executando: " + getNome() + " ---");
        try {
            executarValidacao(doc); 
            
        } catch (Exception e) {
            System.out.println("### FALHA em " + getNome() + ": " + e.getMessage());
            doc.addFalha(getNome() + ": " + e.getMessage());
        }

        chamarProximo(doc);
    }

    private void chamarProximo(DocumentoFiscal doc) {
        if (proximo != null) {
            proximo.processar(doc);
        }
    }

  @Override
    public void rollback(DocumentoFiscal doc) {
        
        if (proximo != null) {
            proximo.rollback(doc);
        }
    }

    protected abstract void executarValidacao(DocumentoFiscal doc) throws Exception;
    
    protected abstract String getNome();
}