package Avaliacao.Exercicio1;

public class TransporteAereo implements ITransporte{


    @Override
    public Double calcularTarifa(DadosCalculo dados){
        Double peso = dados.getPeso();
        Double tarifa = peso * 2;

        return tarifa;
    }
    
}
