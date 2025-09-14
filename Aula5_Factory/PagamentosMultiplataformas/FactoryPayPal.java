package Aula5_Factory.PagamentosMultiplataformas;

public class FactoryPayPal extends PagamentoFactory {

    private String email;


    public FactoryPayPal(String email) {
        this.email = email;
    }

    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPayPal(this.email);
    }


    
}
