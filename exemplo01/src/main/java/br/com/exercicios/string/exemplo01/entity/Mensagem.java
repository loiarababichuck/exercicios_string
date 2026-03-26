package br.com.exercicios.string.exemplo01.entity;

public class Mensagem {
    private String remetente;
    private String destinario;
    private String conteudo;

    public Mensagem(){
    }

    public Mensagem(String remetente, String destinario, String conteudo) {
        this.remetente = remetente;
        this.destinario = destinario;
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
