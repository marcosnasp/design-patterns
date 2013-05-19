package br.edu.fa7.posgrad.reuso.patterns.strategy;

import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoTrabalho;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:10
 */
public class TrabalhoDistancia implements ModoTrabalho {
    private static final Logger LOGGER = Logger.getLogger(TrabalhoDistancia.class.getName());

    @Override
    public void trabalhar() {
        LOGGER.info("Trabalhando com o modo de trabalho a distancia");
    }
}
