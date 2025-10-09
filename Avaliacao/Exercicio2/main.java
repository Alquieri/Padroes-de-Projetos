package Avaliacao.Exercicio2;

public class main {
    public static void main(String[] args) {
        PagamentoFactory fabrica = new PagamentoFactory();

        IProcessadorPagamento processador = fabrica.CriarPagamento("pix", "12345678");

        String pix = processador.processarPagamento(20.0);

        System.out.println(pix);


        
    }
}
