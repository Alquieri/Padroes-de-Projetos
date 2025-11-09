package AvaliacaoPratica2.Exercicio3;

public class EstadoManutencao implements EstadoUsina {

    private EstadoUsina estadoAnterior;

    public EstadoManutencao(EstadoUsina estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    @Override
    public String getStatus() {
        return "MANUTENCAO (Anterior: " + estadoAnterior.getStatus() + ")";
    }

    @Override
    public void pararManutencao(UsinaNuclear usina) {
        System.out.println("Manutenção concluída. Retornando ao estado anterior.");
        usina.setEstado(this.estadoAnterior);
    }


    @Override
    public void verificarCondicoes(UsinaNuclear usina) {
        System.out.println("MANUTENCAO: Sensores temporariamente ignorados.");
    }

    @Override
    public void ligar(UsinaNuclear usina) {
        System.out.println("MANUTENCAO: Ação 'ligar' bloqueada.");
    }

    @Override
    public void desligar(UsinaNuclear usina) {
        System.out.println("MANUTENCAO: Ação 'desligar' bloqueada.");
    }

    @Override
    public void iniciarManutencao(UsinaNuclear usina) {
        System.out.println("MANUTENCAO: Já em manutenção.");
    }
}