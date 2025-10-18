package Aula10_Strategy.Exercicio;

public class EspadaLonga implements IArma {

    private int dano = 15;
    

    public void usar(Personagem alvo, Personagem atacante){
    
        alvo.receberDano(dano);

    }
    

}
