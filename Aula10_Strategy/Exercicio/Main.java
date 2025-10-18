package Aula10_Strategy.Exercicio;

public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Guerreiro();
        Personagem monstro = new Mago();
        IArma EspadaLonga = new EspadaLonga(); 
        IArma ArcoElfico = new ArcoElfico();
        IArma CajadoArcano = new CajadoArcano();


        heroi.equiparArma(EspadaLonga);
        heroi.atacar(monstro, heroi);
        heroi.equiparArma(ArcoElfico);
        heroi.atacar(monstro, heroi);
        heroi.equiparArma(CajadoArcano);
        heroi.atacar(heroi,monstro);


        



        

    }
    
}
