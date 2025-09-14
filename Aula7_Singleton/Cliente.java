package Aula7_Singleton;

public class Cliente {
    private String clienteId;
    private String nome;

    public Cliente(String clienteId, String nome) {
        this.clienteId = clienteId;
        this.nome = nome;
    }

    public void realizarDeposito(double valor) {
        System.out.printf("\nCliente '%s' tentando depositar R$ %.2f...\n", this.nome, valor);
        AccountManager.getInstance().depositar(this.clienteId, valor);
    }

    public void realizarSaque(double valor) {
        System.out.printf("\nCliente '%s' tentando sacar R$ %.2f...\n", this.nome, valor);
        AccountManager.getInstance().sacar(this.clienteId, valor);
    }

    public void consultarMeuSaldo() {
        System.out.printf("\nCliente '%s' consultando saldo...\n", this.nome);
        AccountManager.getInstance().verSaldo(this.clienteId);
    }
    
    public String getClienteId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }
}