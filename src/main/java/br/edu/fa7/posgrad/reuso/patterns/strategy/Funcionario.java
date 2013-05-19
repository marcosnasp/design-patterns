package br.edu.fa7.posgrad.reuso.patterns.strategy;

import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;
import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoTrabalho;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 17:44
 */
public class Funcionario {

    private ModoRegistroPonto modoRegistroPonto;

    private ModoTrabalho modoTrabalho;

    private String nome;
    private double salario;
    private boolean ferias;

    public Funcionario(ModoRegistroPonto modoRegistroPonto, ModoTrabalho modoTrabalho, String nome, double salario, boolean ferias) {
        this.modoRegistroPonto = modoRegistroPonto;
        this.modoTrabalho = modoTrabalho;
        this.nome = nome;
        this.salario = salario;
        this.ferias = ferias;
    }

    public Funcionario() {
    }

    public void setModoTrabalho(ModoTrabalho modoTrabalho) {
        this.modoTrabalho = modoTrabalho;
    }

    public void setModoRegistroPonto(ModoRegistroPonto modoRegistroPonto) {
        this.modoRegistroPonto = modoRegistroPonto;
    }

    public void trabalhar() {
        modoTrabalho.trabalhar();
    }

    public void registrarPonto() {
        modoRegistroPonto.registrarPonto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

}