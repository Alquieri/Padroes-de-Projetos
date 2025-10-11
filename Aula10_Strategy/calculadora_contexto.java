package Aula10_Strategy;

public class calculadora_contexto {
    private IEstrategia Estrategia;

    calculadora_contexto(IEstrategia Estrategia){
        this.setEstrategia(Estrategia);
    }
    
    //Metodo para alterr as estratégia 
    public void setEstrategia(IEstrategia Estrategia){
        this.Estrategia = Estrategia;
    }

    //Invoca a execução da estratégia
    public double executar(double a, double b){
       return this.Estrategia.calcular(a, b);
    }

}
