package Aula10_Strategy.Exercicio;

public class CajadoArcano implements IArma{
    public int dano = 8;
    public int custoMana = 25;

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
