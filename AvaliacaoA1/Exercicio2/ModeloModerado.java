package AvaliacaoA1.Exercicio2;

public class ModeloModerado implements ModeloCalculoRisco {

    @Override
    public PerfilRisco calcular(DadosCliente cliente) {
       System.out.println("Modelo moderado");

        if (cliente.getSalario() > 5000 && cliente.getIdade() < 45) {
            return PerfilRisco.MODERADO;
        }
        
        return PerfilRisco.CONSERVADOR; 
    }
    
}
