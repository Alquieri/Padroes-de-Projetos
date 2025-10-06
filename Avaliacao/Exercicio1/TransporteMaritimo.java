package Avaliacao.Exercicio1;

public class TransporteMaritimo implements ITransporte {

    @Override
    public Double calcularTarifa(DadosCalculo dados) {
        Double quantidade = dados.getQuantidade();
        Double tarifa = quantidade * 0.5; 

        return tarifa;
    }
    
}
