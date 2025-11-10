// NOVO ARQUIVO: IValidador.java
package AvaliacaoPratica2.Exercicio4;

public interface IValidador {

    void setProximo(IValidador proximo);
    void processar(DocumentoFiscal doc);
    void rollback(DocumentoFiscal doc);
}