package Aula10_Strategy.Exercicio;

public abstract class Personagem {
    
    public int vida;
    public int mana;


    private IArma arma;

    public Personagem(int vida, int mana){
        this.vida = vida;
        this.mana = mana;
    }
    

    public void receberDano(int dano){
        vida = vida - dano;

        System.out.println("Vc deu um dano de: "+ dano +"  deixando com a vida :" + vida);
    }


    public void atacar(Personagem alvo, Personagem atacante){
        arma.usar(alvo, atacante);
 
    }

    public void equiparArma(IArma arma) {
        this.arma = arma;
        System.out.println("Personagem equipou uma nova arma: " + arma.getClass().getSimpleName());
    }


}
