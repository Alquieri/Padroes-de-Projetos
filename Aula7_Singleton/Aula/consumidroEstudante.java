package Aula7_Singleton.Aula;

public class consumidroEstudante {

    public static void main(String[] args) {
        estudante aluno = estudante.getInstance("Angelina", "Modelagem Matematica", 10.0);

        System.out.println(aluno.getNome() + " " + aluno.getDisciplina() + " " + aluno.getNota());
    

    estudante aluno2 = estudante.getInstance("Gui", "bd", 10);
    
    System.out.println(aluno2.getNome() + " " + aluno2.getDisciplina() + " " + aluno2.getNota());

}
}