package br.edu.fa7.posgrad.reuso.patterns.adapter;

import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IEstagiario;
import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IFuncionario;

import java.util.Date;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 08:25
 */
public class AdapterMain {

    public static void main(String[] args) {

        Estagiario estagiario = new Estagiario();
        estagiario.setNome("Joao");
        estagiario.setDataNascimento(new Date());
        estagiario.setMatricula("0000001122");
        estagiario.setSexo('M');

        IFuncionario iFuncionarioAdapter = new EstagiarioAdapter(estagiario);
        iFuncionarioAdapter.receberSalario();
        iFuncionarioAdapter.trabalhar();

    }

}
