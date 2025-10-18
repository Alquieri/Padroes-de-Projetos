package Aula11_Adapter.Exercicio;

public class Instagram {
    private String selfie;
    private String video;
    
    public void PostStory(String selfie, String video){
        System.out.println("---Instagram---");
        if (selfie != null) {
            System.out.println("Imagem postada: " + selfie);
        }
        if (video != null) {
            System.out.println("Vídeo postado: " + video);
        }
        System.out.println("---------------------------");
    }



}
