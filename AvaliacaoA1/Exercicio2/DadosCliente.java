package AvaliacaoA1.Exercicio2;

public class DadosCliente {
    private int idade;
    private double salario;
    private double total;

    public DadosCliente() {
    }

    public DadosCliente(int idade, double salario, double total) {
        this.idade = idade;
        this.salario = salario;
        this.total = total;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public double getTotal() {
        return total;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
