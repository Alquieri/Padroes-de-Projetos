package AvaliacaoPratica2.Exercicio2;

public class Main {

    public static void main(String[] args) {
        
        SistemaBancarioLegado sistemaLegado = new SistemaBancarioLegado();
        
        ProcessadorTransacoes processador = new AdaptadorLegado(sistemaLegado);

        
        System.out.println("--- Teste 1 (Sucesso BRL) ---");
        RespostaAutorizacao resp1 = processador.autorizar("1111-2222", 500.00, "BRL");
        
        System.out.println("Autorizada: " + resp1.isAutorizada());
        System.out.println("Código: " + resp1.getCodigoAutorizacao());

        
        System.out.println("\n--- Teste 2 (Falha USD) ---");
        RespostaAutorizacao resp2 = processador.autorizar("5555-6666", 150.00, "USD");
        
        System.out.println("Autorizada: " + resp2.isAutorizada());
        System.out.println("Erro: " + resp2.getErro());
    }
}
    

