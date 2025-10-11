package Avaliacao.Exercicio4;
import java.util.List;


public class Relatorio implements IRelatorio {
    private List<Pedido> pedidos;

    public Relatorio(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String gerar() {
        String listaDePedidos = "";
        
        for (Pedido p : pedidos) {
            listaDePedidos += String.format("  - Pedido ID: %d, Valor: R$%.2f\n", p.getId(), p.getValor());
        }

        return "--- Relatório de Vendas Básico ---\n" + listaDePedidos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}