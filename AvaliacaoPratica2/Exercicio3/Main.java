package AvaliacaoPratica2.Exercicio3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        UsinaNuclear usina = new UsinaNuclear();
        System.out.println("Status Inicial: " + usina.getStatus());

        usina.ligar();
        usina.checarSensores();

        System.out.println("\n--- Simulando aquecimento (350°C) ---");
        usina.setTemperatura(350);
        usina.checarSensores();

        System.out.println("\n--- Simulando superaquecimento (410°C) ---");
        usina.setTemperatura(410);
        usina.checarSensores();
        
        System.out.println("...aguardando 1 segundo (não deve mudar)...");
        Thread.sleep(1000);
        usina.checarSensores();

        System.out.println("...aguardando mais 1 segundo (deve mudar)...");
        Thread.sleep(1000);
        usina.checarSensores();

        System.out.println("\n--- Simulando falha de resfriamento ---");
        usina.setSistemaResfriamentoFalhou(true);
        usina.checarSensores();
        usina.checarSensores();

        System.out.println("\n--- Testando Manutenção ---");
        UsinaNuclear usina2 = new UsinaNuclear();
        usina2.ligar();
        System.out.println("Status atual: " + usina2.getStatus());
        
        usina2.iniciarManutencao();
        System.out.println("Status atual: " + usina2.getStatus());

        usina2.setTemperatura(350);
        usina2.checarSensores(); 
        
        usina2.pararManutencao();
        System.out.println("Status atual: " + usina2.getStatus());
        
        usina2.checarSensores();
    }
    
}
