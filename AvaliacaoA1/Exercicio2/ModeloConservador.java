package AvaliacaoA1.Exercicio2;

public class ModeloConservador implements ModeloCalculoRisco {

    @Override
    public PerfilRisco calcular(DadosCliente cliente) {
        System.out.println("Modelo conservador");

        if (cliente.getTotal() > 50000 && cliente.getIdade() > 50) {
            return PerfilRisco.CONSERVADOR;
        }

        return PerfilRisco.MODERADO;
    }
    
    
}
