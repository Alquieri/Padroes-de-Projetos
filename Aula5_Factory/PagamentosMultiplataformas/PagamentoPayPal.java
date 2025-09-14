package Aula5_Factory.PagamentosMultiplataformas;

public class PagamentoPayPal implements iPagamento {

    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    @Override

    public String processarPagamento(double valor) {
        if (email != null && email.contains("@")) {
            return "Pagamento de R$" + valor + " aprovado para o email " + email;
        } else {
            return "Erro: E-mail inválido para pagamento com PayPal.";
        }
    }
}