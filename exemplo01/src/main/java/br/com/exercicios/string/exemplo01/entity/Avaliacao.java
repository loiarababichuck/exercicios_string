package br.com.exercicios.string.exemplo01.entity;

public class Avaliacao {
    private String disciplina;
    private double nota;
    private String aluno;

    public Avaliacao() {

    }

    public Avaliacao(String disciplina, double nota, String aluno) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
}