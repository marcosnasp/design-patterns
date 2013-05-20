package br.edu.fa7.posgrad.reuso.patterns.observer;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 20/05/13
 * Time: 07:38
 */

// TODO: Incluir a classe candidato no padrão observer.
public class Candidato {

    private String nome;
    private Integer numeroVotos;
    private Double percentual;

    public Candidato(String nome, Integer numeroVotos, Double percentual) {
        this.nome = nome;
        this.numeroVotos = numeroVotos;
        this.percentual = percentual;
    }

    public Candidato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(Integer numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

}