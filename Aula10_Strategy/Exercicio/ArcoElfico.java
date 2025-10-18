package Aula10_Strategy.Exercicio;

public class ArcoElfico implements IArma {

    private int dano = 12;
    private int custoMana = 15;


    public void usar(Personagem alvo, Personagem atacante){
        if (atacante.mana > custoMana){
            alvo.receberDano(dano);
            atacante.mana = atacante.mana - custoMana;
            System.out.println("Sua mana agr é: " + atacante.mana);
        }
        else{
            System.out.println("Vc não tem mana o suficiente: " + atacante.mana);
        }
        
    }   
    
}
