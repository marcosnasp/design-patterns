package br.edu.fa7.posgrad.reuso.patterns.adapter;

import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IEstagiario;
import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IFuncionario;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 07:48
 */
public class EstagiarioAdapter implements IFuncionario {

    private IEstagiario estagiario;

    public EstagiarioAdapter(IEstagiario estagiario) {
        this.estagiario = estagiario;
    }

    public void setEstagiario(IEstagiario estagiario) {
        this.estagiario = estagiario;
    }

    @Override
    public void receberSalario() {
        estagiario.receberBolsa();
    }

    @Override
    public void registrarPonto() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trabalhar() {
        estagiario.estagiar();
    }

}
