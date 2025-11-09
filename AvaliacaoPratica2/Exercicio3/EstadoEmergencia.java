package AvaliacaoPratica2.Exercicio3;

public class EstadoEmergencia implements EstadoUsina {

    @Override
    public String getStatus() {
        return "EMERGENCIA";
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        System.out.println("EMERGENCIA: Não pode ser ligada.");
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        System.out.println("EMERGENCIA: Usina em lockdown. Desligamento manual necessário.");
    }

    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
        System.out.println("CORRE!");
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