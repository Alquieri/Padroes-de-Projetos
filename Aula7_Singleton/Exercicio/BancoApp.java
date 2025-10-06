package Aula7_Singleton.Exercicio;

public class BancoApp {

    public static void main(String[] args) {
        System.out.println("Iniciando sistema bancário...");

        Cliente clienteA = new Cliente("12345-6", "João Silva");
        Cliente clienteB = new Cliente("98765-4", "Maria Souza");
        
        System.out.println("Clientes criados: " + clienteA.getNome() + " e " + clienteB.getNome());

        clienteA.realizarDeposito(1500.00);
        clienteA.consultarMeuSaldo();
        
        clienteB.realizarDeposito(3000.50);
        clienteB.realizarSaque(500.00);
        
        AccountManager manager = AccountManager.getInstance();
        manager.listarContasAtivas();

        clienteA.realizarSaque(200.00);
        clienteB.realizarSaque(3000.00);

        System.out.println("\n--- Verificando o estado final de todas as contas ---");
        manager.verSaldo(clienteA.getClienteId());
        manager.verSaldo(clienteB.getClienteId());
        
        AccountManager outraReferenciaManager = AccountManager.getInstance();
        System.out.println("\nListando contas a partir de uma segunda referência do Manager:");
        outraReferenciaManager.listarContasAtivas();
        
        System.out.println("Hash code da primeira referência: " + manager.hashCode());
        System.out.println("Hash code da segunda referência:  " + outraReferenciaManager.hashCode());
        System.out.println("Os hash codes são iguais? " + (manager.hashCode() == outraReferenciaManager.hashCode()));
    }
}