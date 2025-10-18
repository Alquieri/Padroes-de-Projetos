package Aula10_Strategy.Exercicio;

public class Mago extends Personagem{

    public Mago(){
        super(70, 150);
    }
    
    @Override
    public void receberDano(int dano) {
        
        this.mana = this.mana + 10;
        System.out.println("Renegeração de mana! Nova mana: "  + this.mana );

        super.receberDano(dano);
    }

}
