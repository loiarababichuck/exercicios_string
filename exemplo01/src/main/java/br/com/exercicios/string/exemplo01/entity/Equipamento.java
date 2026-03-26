package br.com.exercicios.string.exemplo01.entity;

public class Equipamento {
    private String nome;
    private String descricao;
    private int patrimonio;

    public Equipamento(){
    }

    public Equipamento(String nome, String descricao, int patrimonio) {
        this.nome = nome;
        this.descricao = descricao;
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }
}
