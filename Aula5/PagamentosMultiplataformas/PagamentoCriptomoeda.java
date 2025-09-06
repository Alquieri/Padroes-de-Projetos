package Aula5.PagamentosMultiplataformas;

public class PagamentoCriptomoeda implements iPagamento {

    private double saldoEmCarteira;

    public PagamentoCriptomoeda(double saldoEmCarteira) {
        this.saldoEmCarteira = saldoEmCarteira;
    }

    @Override
    public String processarPagamento(double valor) {
   
        if (this.saldoEmCarteira >= valor) {
            this.saldoEmCarteira -= valor; 
            return "Pagamento de " + valor + " em cripto aprovado! Saldo restante: " + this.saldoEmCarteira;
        } else {

            return "Saldo insuficiente para pagamento com criptomoedas. Saldo: " + this.saldoEmCarteira + ", Valor: " + valor;
        }
    }
}