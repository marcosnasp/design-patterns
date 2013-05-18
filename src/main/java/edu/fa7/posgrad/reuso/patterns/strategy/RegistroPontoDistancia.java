package edu.fa7.posgrad.reuso.patterns.strategy;

import edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 17:56
 */
public class RegistroPontoDistancia implements ModoRegistroPonto {

    private static final Logger LOGGER = Logger.getLogger(RegistroPontoDistancia.class.getName());

    @Override
    public void registrarPonto() {
        LOGGER.info("Registrar ponto com o modo de registro a distancia");
    }
}
