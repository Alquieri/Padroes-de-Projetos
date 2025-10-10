package Avaliacao.Exercicio3;

public class Leitor implements IObserverLeitores {

    private String name;

    public Leitor(String name){
        this.name = name;

    }


    @Override
    public void update() {

        System.out.println("O leitor '" + this.name + "' foi notificado!");
    }



}