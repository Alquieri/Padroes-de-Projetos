package Avaliacao.Exercicio1;



public class TransporteTerrestre implements ITransporte {

    @Override
    public Double calcularTarifa(DadosCalculo dados){
        Double distancia = dados.getDistancia();
        Double tarifa = distancia * 3;

        return tarifa;
    }
    
}
