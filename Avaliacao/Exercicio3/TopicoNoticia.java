package Avaliacao.Exercicio3;

import java.util.ArrayList;

public class TopicoNoticia implements ISubjectNoticia {

    private String categoria;
    ArrayList<IObserverLeitores> leitores = new ArrayList();
  
    public TopicoNoticia(String categoria){
        this.categoria = categoria;
        this.leitores = new ArrayList<>();;
    }

    public void publicarNovaNoticia(String titulo) {
    System.out.println("Nova notícia em '" + this.categoria + "': " + titulo);
    this.notifyObservers(); 
}

    
    public void attach(IObserverLeitores leitor){
        this.leitores.add(leitor);

    }
    public void detach(IObserverLeitores leitor){
        this.leitores.remove(leitor);
    }
    public void notifyObservers(){
        for (IObserverLeitores leitor : this.leitores) {
            leitor.update();
            
        }


    }


}
