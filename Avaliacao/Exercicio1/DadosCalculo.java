package Avaliacao.Exercicio1;


public class DadosCalculo {
    private Double distancia;
    private Double peso;
    private Double quantidade;


    public DadosCalculo(Double distancia, Double peso, Double quantidade){
        this.distancia = distancia;
        this.peso = peso;
        this.quantidade = quantidade;
    }

    public Double getDistancia(){
        return this.distancia;

    }

    public Double getPeso(){
         return this.peso;

    }

    public Double getQuantidade(){
         return this.quantidade;

    }
}
