package Aula10_Strategy.Aula;

public class soma implements IEstrategia{

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
