package br.edu.fa7.posgrad.reuso.patterns.strategy;

import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:00
 */
public class RegistroPontoQuinzenal implements ModoRegistroPonto {

    private static final Logger LOGGER = Logger.getLogger(RegistroPontoQuinzenal.class.getName());

    @Override
    public void registrarPonto() {
        LOGGER.info("Registrar ponto como o modo de registro quinzenal");
    }
}
