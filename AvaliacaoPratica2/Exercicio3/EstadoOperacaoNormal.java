// NOVO ARQUIVO: EstadoOperacaoNormal.java
package AvaliacaoPratica2.Exercicio3;

public class EstadoOperacaoNormal implements EstadoUsina {

    @Override
    public String getStatus() {
        return "OPERACAO_NORMAL";
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        System.out.println("Usina já está em OPERACAO_NORMAL.");
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        usina.setEstado(new EstadoDesligada());
    }

    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
        
        if (usina.getTemperatura() > 300) {
            usina.setEstado(new EstadoAlertaAmarelo()); 
        } else {
            System.out.println("Condições normais. Temperatura: " + usina.getTemperatura() + "°C");
        }
    }

     @Override
    public void iniciarManutencao(UsinaNuclear usina) {
        System.out.println("Iniciando manutenção. Estado atual salvo: " + getStatus());
        usina.setEstado(new EstadoManutencao(this));
    }

    @Override
    public void pararManutencao(UsinaNuclear usina) {
        System.out.println("Usina não está em manutenção.");
    }

    
}