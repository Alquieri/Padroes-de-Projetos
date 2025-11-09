package AvaliacaoPratica2.Exercicio3;

public class EstadoDesligada implements EstadoUsina {

    @Override
    public String getStatus() {
        return "DESLIGADA";
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        usina.setEstado(new EstadoOperacaoNormal());
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        System.out.println("Usina já está DESLIGADA.");
    }

    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
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