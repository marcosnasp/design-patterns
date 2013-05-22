package br.edu.fa7.posgrad.reuso.patterns.abstractfactory;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 21/05/13
 * Time: 21:42
 */
public class BotaoUnix extends Botao {

    private static final Logger LOGGER = Logger.getLogger(BotaoUnix.class.getName());

    @Override
    public void executarAcao() {
       LOGGER.info("O Botao Unix foi clicado, executando ação. " + "\n");
    }

}
