package AvaliacaoA1.Exercicio2;

public class AnalisadorDeRisco {

    private ModeloCalculoRisco modeloAtual;

    public void setModeloCalculo(ModeloCalculoRisco novoModelo) {
        System.out.println("\nTrocando a estratégia");
        this.modeloAtual = novoModelo;
    }

    public PerfilRisco analisarCliente(DadosCliente cliente) {
        if (modeloAtual == null) {
            System.out.println("Erro");
        }
        
        System.out.println("Iniciando análise...");
        
        PerfilRisco perfil = this.modeloAtual.calcular(cliente);
        
        System.out.println("Análise concluída. Perfil: " + perfil);
        return perfil;
    }
    
}
