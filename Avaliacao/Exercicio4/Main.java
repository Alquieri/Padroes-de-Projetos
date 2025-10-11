package Avaliacao.Exercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Pedido> pedidos = Arrays.asList(
            new Pedido(101, 250.00),
            new Pedido(102, 80.00),
            new Pedido(103, 1200.00)
        );

        IRelatorio relatorio = new Relatorio(pedidos);

        relatorio = new FaturamentoDecorator(relatorio);
        
        relatorio = new ExportacaoDecorator(relatorio, "PDF");

        System.out.println(relatorio.gerar());
    }
}