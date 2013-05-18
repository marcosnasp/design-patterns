package edu.fa7.posgrad.reuso.patterns.strategy;

import edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;
import edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoTrabalho;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 17:44
 */
public class Funcionario {

    private ModoRegistroPonto modoRegistroPonto;
    private ModoTrabalho modoTrabalho;

    private double salario;
    private boolean ferias;

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

}