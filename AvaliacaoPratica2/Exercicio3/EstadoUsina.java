package AvaliacaoPratica2.Exercicio3;

public interface EstadoUsina {

    void verificarCondicoes(UsinaNuclear usina);
    void ligar(UsinaNuclear usina);
    void desligar(UsinaNuclear usina);
    void iniciarManutencao(UsinaNuclear usina);
    void pararManutencao(UsinaNuclear usina);

    String getStatus();
    
    
}
