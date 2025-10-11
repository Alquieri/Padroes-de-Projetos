package Aula10_Strategy;

public class multiplicação implements IEstrategia {
    @Override
    
    public double calcular(double a, double b) {
        return a * b;
    }
}
