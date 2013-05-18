package edu.fa7.posgrad.reuso.patterns.strategy;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:12
 */
public class StrategyMain {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setModoRegistroPonto(new RegistroPontoDistancia());
        funcionario.setModoTrabalho(new TrabalhoDistancia());

        funcionario.trabalhar();
        funcionario.registrarPonto();

        funcionario.setModoRegistroPonto(new RegistroPontoPresencial());

        funcionario.registrarPonto();

    }

}
