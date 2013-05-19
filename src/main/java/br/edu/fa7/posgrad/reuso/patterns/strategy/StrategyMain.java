package br.edu.fa7.posgrad.reuso.patterns.strategy;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:12
 */
public class StrategyMain {

    private static final Logger LOGGER = Logger.getLogger(StrategyMain.class.getName());

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setModoRegistroPonto(new RegistroPontoDistancia());
        funcionario.setModoTrabalho(new TrabalhoDistancia());

        funcionario.trabalhar();
        funcionario.registrarPonto();

        funcionario.setModoRegistroPonto(new RegistroPontoQuinzenal());
        funcionario.setModoTrabalho(new TrabalhoQuinzenal());

        funcionario.trabalhar();
        funcionario.registrarPonto();

        funcionario.setModoRegistroPonto(new RegistroPontoPresencial());
        funcionario.setModoTrabalho(new TrabalhoPresencial());

        funcionario.trabalhar();
        funcionario.registrarPonto();

        Funcionario funcionario2 = new Funcionario(new RegistroPontoPresencial(), new TrabalhoPresencial(), "FuncionarioNome", 4000.00, Boolean.FALSE);
        funcionario2.trabalhar();
        funcionario2.registrarPonto();

        funcionario2.setNome("FuncionarioNome2");
        funcionario2.setSalario(4500.00);
        funcionario2.setFerias(Boolean.TRUE);

        LOGGER.info("Salario do " + funcionario2.getNome() + " é: " + funcionario2.getSalario());
        LOGGER.info("Funcionario " + funcionario2.getNome() + " esta de ferias? " + funcionario2.isFerias());

    }

}
