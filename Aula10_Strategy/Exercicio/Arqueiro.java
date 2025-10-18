package Aula10_Strategy.Exercicio;

public class Arqueiro extends Personagem{

     public Arqueiro(){
        super(90, 80);
    }

    @Override
    public void receberDano(int dano) {
        if (Math.random() < 0.25){
            System.out.println("Esquiva");
        }   
        else{
            super.receberDano(dano);

        }     
    }
    
}
