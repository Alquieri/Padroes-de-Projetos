package AvaliacaoPratica2.Exercicio3;

public class EstadoAlertaAmarelo implements EstadoUsina {

    private long inicioAlertaVermelhoTimestamp = 0;

    @Override
    public String getStatus() {
        return "ALERTA_AMARELO";
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        System.out.println("Usina já está ligada (ALERTA_AMARELO).");
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        System.out.println("AVISO: Desligando usina a partir do ALERTA_AMARELO.");
        usina.setEstado(new EstadoDesligada());
    }

    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
        double temp = usina.getTemperatura();

        if (temp > 400) {
            if (this.inicioAlertaVermelhoTimestamp == 0) {
                this.inicioAlertaVermelhoTimestamp = System.currentTimeMillis();
                System.out.println("ALERTA_AMARELO: Temp > 400°C. Iniciando contagem de 30s...");
            } else {
                long tempoEmAlerta = System.currentTimeMillis() - this.inicioAlertaVermelhoTimestamp;
                if (tempoEmAlerta > 30000) {
                    System.out.println("ALERTA_AMARELO: Temp > 400°C por mais de 30s!");
                    usina.setEstado(new EstadoAlertaVermelho());
                }
            }
        } else if (temp <= 300) {
            System.out.println("ALERTA_AMARELO: Temperatura estabilizada.");
            usina.setEstado(new EstadoOperacaoNormal());
        } else {
            this.inicioAlertaVermelhoTimestamp = 0;
            System.out.println("ALERTA_AMARELO: Temperatura elevada (" + temp + "°C), mas estável.");
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