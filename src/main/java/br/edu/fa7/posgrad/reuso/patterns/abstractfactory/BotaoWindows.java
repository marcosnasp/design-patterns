package br.edu.fa7.posgrad.reuso.patterns.abstractfactory;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 21/05/13
 * Time: 21:41
 */
public class BotaoWindows extends Botao {

    private static final Logger LOGGER = Logger.getLogger(BotaoWindows.class.getName());

    @Override
    public void executarAcao() {
        LOGGER.info("Botao Windows está sendo executado. " + "\n");
    }
}
