package AvaliacaoPratica2.Exercicio3;

public class UsinaNuclear {
    private EstadoUsina estadoAtual;

    private double temperatura;
    private boolean sistemaResfriamentoFalhou;

    public UsinaNuclear() {
        this.estadoAtual = new EstadoDesligada();
        this.temperatura = 20.0;
        this.sistemaResfriamentoFalhou = false;
    }

  
    public void checarSensores() {
        this.estadoAtual.verificarCondicoes(this);
    }

 
    public void setEstado(EstadoUsina novoEstado) {
        this.estadoAtual = novoEstado;
        System.out.println("NOVO ESTADO DA USINA: " + novoEstado.getStatus());
    }


    public double getTemperatura() {
        return temperatura;
    }

    public boolean isSistemaResfriamentoFalhou() {
        return sistemaResfriamentoFalhou;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        System.out.println("TEMPERATURA ATUAL: " + temperatura + "°C");
    }

    public void setSistemaResfriamentoFalhou(boolean falhou) {
        this.sistemaResfriamentoFalhou = falhou;
        System.out.println("SISTEMA DE RESFRIAMENTO FALHOU: " + falhou);
    }

    public void ligar() {
        System.out.println("--- Tentando Ligar Usina ---");
        this.estadoAtual.ligar(this);
    }

    public void desligar() {
        System.out.println("--- Tentando Desligar Usina ---");
        this.estadoAtual.desligar(this);
    }

    public void iniciarManutencao() {
        System.out.println("--- Tentando Iniciar Manutenção ---");
        this.estadoAtual.iniciarManutencao(this);
    }

    public void pararManutencao() {
        System.out.println("--- Tentando Parar Manutenção ---");
        this.estadoAtual.pararManutencao(this);
    }
    
    public String getStatus() {
        return this.estadoAtual.getStatus();
    }
}

    

