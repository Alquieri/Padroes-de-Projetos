package AvaliacaoA1.Exercicio2;

public class Main {
    public static void main(String[] args) {
        
        ModeloCalculoRisco modConservador = new ModeloConservador();
        ModeloCalculoRisco modModerado = new ModeloModerado();
        ModeloCalculoRisco modAgressivo = new ModeloAgressivo();
        
        AnalisadorDeRisco analisador = new AnalisadorDeRisco();
        
        DadosCliente cliente = new DadosCliente(30, 9000.0, 75000.0);

        analisador.setModeloCalculo(modModerado);
        
        PerfilRisco perfil1 = analisador.analisarCliente(cliente);
        

        analisador.setModeloCalculo(modAgressivo);
        
        PerfilRisco perfil2 = analisador.analisarCliente(cliente);

        
        analisador.setModeloCalculo(modConservador);
        
        PerfilRisco perfil3 = analisador.analisarCliente(cliente);
    }
    
}
