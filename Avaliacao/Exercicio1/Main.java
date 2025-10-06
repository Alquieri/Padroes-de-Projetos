package Avaliacao.Exercicio1;

public class Main {
    public static void main(String[] args) {
        TransporteFactory fabrica = new TransporteFactory();

        DadosCalculo dadosParaCarro = new DadosCalculo(100.0, 0.0, 0.0);
        ITransporte meuCarro = fabrica.criarTransporte("TERRESTRE");

        Double tarifaCarro = meuCarro.calcularTarifa(dadosParaCarro);

        System.out.println("A tarifa do transporte terrestre é: " + tarifaCarro);
//////////////////////////////////////////////////
    
        DadosCalculo dadosParaAviao = new DadosCalculo(0.0, 70.0, 0.0);
        ITransporte meuAviao = fabrica.criarTransporte("AEREO");

        Double tarifaAviao = meuAviao.calcularTarifa(dadosParaAviao);

        System.out.println("A tarifa do transporte aereo é: " + tarifaAviao);

 ///////////////////////////////////////////////
        DadosCalculo dadosParaBarco = new DadosCalculo(0.0, 0.0, 90.0);
        ITransporte meuBarco = fabrica.criarTransporte("MARITIMO");

        Double tarifaBarco = meuBarco.calcularTarifa(dadosParaBarco);

        System.out.println("A tarifa do transporte maritimo é: " + tarifaBarco);
    
    }
}
