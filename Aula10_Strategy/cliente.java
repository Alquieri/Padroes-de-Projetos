package Aula10_Strategy;

public class cliente {
    public static void main(String[] args) {
        //Cenario: o programador de borda utiliza as estratégias disponiveis
        calculadora_contexto calculadora = new calculadora_contexto(new soma());
        calculadora_contexto calculadora1 = new calculadora_contexto(new multiplicação());

        System.out.println(calculadora.executar(10, 5)); 
        System.out.println(calculadora1.executar(10, 5));
    
    }
}
