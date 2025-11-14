package AvaliacaoA1.Exercicio2;

public class ModeloAgressivo implements ModeloCalculoRisco {

    @Override
    public PerfilRisco calcular(DadosCliente cliente) {
        System.out.println("Modelo agressivo");

        if (cliente.getSalario() > 8000 && cliente.getIdade() < 35) {
            return PerfilRisco.AGRESSIVO;
        }
        
        return PerfilRisco.MODERADO;
    }
    
}
