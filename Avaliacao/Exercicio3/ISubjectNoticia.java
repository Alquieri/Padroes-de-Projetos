package Avaliacao.Exercicio3;

public interface ISubjectNoticia{

    public void attach(IObserverLeitores Leitor);
    public void detach(IObserverLeitores Leitor);
    public void notifyObservers();
    
}
