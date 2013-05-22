package br.edu.fa7.posgrad.reuso.patterns.adapter;

import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IEstagiario;
import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IFuncionario;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 08:25
 */
public class AdapterMain {

    public static void main(String[] args) {

        IFuncionario funcionario = new Funcionario();
        IEstagiario estagiario = new Estagiario();

        IFuncionario iFuncionarioAdapter = new EstagiarioAdapter(estagiario);
        iFuncionarioAdapter.receberSalario();
        iFuncionarioAdapter.trabalhar();

    }

}
