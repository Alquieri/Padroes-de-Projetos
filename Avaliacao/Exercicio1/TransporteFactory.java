package Avaliacao.Exercicio1;

public class TransporteFactory {

    public ITransporte criarTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("TERRESTRE")) {
            return new TransporteTerrestre();
        }
        else if (tipo.equalsIgnoreCase("AEREO")) {
            return new TransporteAereo();
        }
        else if (tipo.equalsIgnoreCase("MARITIMO")) {
            return new TransporteMaritimo();
        }
        else {
            return null;
        }
    }
}
    

    

