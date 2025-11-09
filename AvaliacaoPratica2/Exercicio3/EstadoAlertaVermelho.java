package AvaliacaoPratica2.Exercicio3;

public class EstadoAlertaVermelho implements EstadoUsina {

    @Override
    public String getStatus() {
        return "ALERTA_VERMELHO";
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        System.out.println("Usina já está ligada (ALERTA_VERMELHO).");
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        System.out.println("AVISO: Desligando usina a partir do ALERTA_VERMELHO.");
        usina.setEstado(new EstadoDesligada());
    }

    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
        if (usina.isSistemaResfriamentoFalhou()) {
            System.out.println("ALERTA_VERMELHO: SISTEMA DE RESFRIAMENTO FALHOU!");
            usina.setEstado(new EstadoEmergencia());
        } else {
            if (usina.getTemperatura() <= 400) {
                System.out.println("ALERTA_VERMELHO: Temp baixou, voltando para ALERTA_AMARELO.");
                usina.setEstado(new EstadoAlertaAmarelo());
            }
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