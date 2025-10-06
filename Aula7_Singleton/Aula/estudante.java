package Aula7_Singleton.Aula;

public class estudante {
    private static estudante instancia; //Persiste a instacia depois de concluida
    private String nome;
    private String disciplina;
    private double nota;


    private estudante(String nome, String disciplina, double nota){
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    };

    public static estudante getInstance(String nome, String disciplina, double nota){
        if(instancia == null){
            instancia = new estudante (nome, disciplina, nota);
        }
        return instancia;
    }


    public String getNome(){
        return this.nome;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public Double getNota(){
        return this.nota;
    }






}

