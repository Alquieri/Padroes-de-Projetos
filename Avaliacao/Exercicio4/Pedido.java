package Avaliacao.Exercicio4;


public class Pedido {
    private int id;
    private double valor;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }
}