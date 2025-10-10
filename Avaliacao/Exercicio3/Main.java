package Avaliacao.Exercicio3;

public class Main {
    public static void main(String[] args) {
        TopicoNoticia esportes = new TopicoNoticia("Esportes");

        Leitor leitor1 = new Leitor("João");
        Leitor leitor2 = new Leitor("Maria");
        Leitor leitor3 = new Leitor("Pedro");

        esportes.attach(leitor1);
        esportes.attach(leitor2);
        esportes.attach(leitor3);

        esportes.publicarNovaNoticia("Brasil vence a Copa!");

        esportes.detach(leitor2);

        esportes.publicarNovaNoticia("Novo recorde nas olimpíadas!");
    }
}

