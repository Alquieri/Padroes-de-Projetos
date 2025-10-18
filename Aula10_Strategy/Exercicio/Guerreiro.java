package Aula10_Strategy.Exercicio;

public class Guerreiro extends Personagem{

    public Guerreiro(){
        super(120, 50);
    }

    @Override
    public void receberDano(int dano) {
        int danoReduzido = (int) (dano * 0.80);
        
        System.out.println("Pele Dura! Dano reduzido");
        
        super.receberDano(danoReduzido);
    }
    
}
