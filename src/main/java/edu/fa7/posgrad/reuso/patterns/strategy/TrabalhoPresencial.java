package edu.fa7.posgrad.reuso.patterns.strategy;

import edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoTrabalho;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:06
 */
public class TrabalhoPresencial implements ModoTrabalho {

    private static final Logger LOGGER = Logger.getLogger(TrabalhoPresencial.class.getName());

    @Override
    public void trabalhar() {
        LOGGER.info("trabalhando com o modo de trabalho presencial");
    }
}
