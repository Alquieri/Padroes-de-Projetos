package Aula7_Singleton.Exercicio;

import java.util.HashMap;
import java.util.Map;


public class AccountManager {

    private static AccountManager instancia;

    private Map<String, Double> contas;

    private AccountManager() {
        contas = new HashMap<>();
        System.out.println("Instância de AccountManager criada. (Isso só deve aparecer uma vez!)");
    }

    public static AccountManager getInstance() {
        if (instancia == null) {
            instancia = new AccountManager();
        }
        return instancia;
    }


    public void depositar(String contaId, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            return;
        }
        double saldoAtual = contas.getOrDefault(contaId, 0.0);
        contas.put(contaId, saldoAtual + valor);
        System.out.printf("Depósito de R$ %.2f realizado na conta %s.\n", valor, contaId);
    }


    public void sacar(String contaId, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
            return;
        }
        
        double saldoAtual = contas.getOrDefault(contaId, 0.0);

        if (saldoAtual >= valor) {
            contas.put(contaId, saldoAtual - valor);
            System.out.printf("Saque de R$ %.2f realizado na conta %s.\n", valor, contaId);
        } else {
            System.out.printf("Saldo insuficiente na conta %s para sacar R$ %.2f. Saldo atual: R$ %.2f\n", contaId, valor, saldoAtual);
        }
    }


    public void verSaldo(String contaId) {
        double saldo = contas.getOrDefault(contaId, 0.0);
        System.out.printf("O saldo da conta %s é R$ %.2f\n", contaId, saldo);
    }

 
    public void listarContasAtivas() {
        System.out.println("\n--- Contas Ativas no Sistema ---");
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta ativa no momento.");
        } else {
            contas.forEach((contaId, saldo) -> 
                System.out.printf("Conta: %s, Saldo: R$ %.2f\n", contaId, saldo)
            );
        }
        System.out.println("--------------------------------\n");
    }
}