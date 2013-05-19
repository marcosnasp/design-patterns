package br.edu.fa7.posgrad.reuso.patterns.strategy;

import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 17:49
 */
public class RegistroPontoPresencial implements ModoRegistroPonto {

    private static final Logger LOGGER = Logger.getLogger(RegistroPontoPresencial.class.getName());

    @Override
    public void registrarPonto() {
        LOGGER.info("Registrando ponto com modo de registro presencial");
    }

}
