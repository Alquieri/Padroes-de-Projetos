package Aula5_Factory.PagamentosMultiplataformas;

public class PagamentoService {


    public void realizarPagamento(PagamentoFactory factory, double valor) {

        iPagamento metodoPagamento = factory.criarPagamento();


        String resultado = metodoPagamento.processarPagamento(valor);

        System.out.println("----------------------------------------");
        System.out.println("Status da Transação: " + resultado);
        System.out.println("----------------------------------------\n");
    }

    public static void main(String[] args) {
        PagamentoService meuServicoDePagamento = new PagamentoService();
        // Testes feitos por IA

        // --- Simulação 1: Cliente escolheu pagar com Cartão de Crédito Válido ---
        System.out.println("Iniciando pagamento com Cartão de Crédito...");
        PagamentoFactory factoryCartaoValido = new FactoryCartaoCredito("1234567890123456");
        meuServicoDePagamento.realizarPagamento(factoryCartaoValido, 150.75);

        // --- Simulação 2: Cliente escolheu pagar com Cartão de Crédito Inválido ---
        System.out.println("Iniciando pagamento com Cartão de Crédito Inválido...");
        PagamentoFactory factoryCartaoInvalido = new FactoryCartaoCredito("1234");
        meuServicoDePagamento.realizarPagamento(factoryCartaoInvalido, 99.99);

        // --- Simulação 3: Cliente escolheu pagar com PayPal ---
        System.out.println("Iniciando pagamento com PayPal...");
        PagamentoFactory factoryPayPal = new FactoryPayPal("cliente@email.com");
        meuServicoDePagamento.realizarPagamento(factoryPayPal, 250.00);

        // --- Simulação 4: Cliente escolheu pagar com Criptomoedas (Saldo Suficiente) ---
        System.out.println("Iniciando pagamento com Criptomoedas (Saldo OK)...");
        PagamentoFactory factoryCriptoOk = new FactoryCriptomoeda(1.5); // Saldo de 1.5
        meuServicoDePagamento.realizarPagamento(factoryCriptoOk, 1.2);    // Valor da compra

        // --- Simulação 5: Cliente escolheu pagar com Criptomoedas (Saldo Insuficiente) ---
        System.out.println("Iniciando pagamento com Criptomoedas (Saldo Insuficiente)...");
        PagamentoFactory factoryCriptoFail = new FactoryCriptomoeda(0.8); // Saldo de 0.8
        meuServicoDePagamento.realizarPagamento(factoryCriptoFail, 1.0);   // Valor da compra
    }
}