package br.edu.fa7.posgrad.reuso.patterns.abstractfactory;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 21/05/13
 * Time: 21:40
 */
public class JanelaMacOS extends Janela {

    private static final Logger LOGGER = Logger.getLogger(JanelaMacOS.class.getName());

    @Override
    public void executarAcao() {
        LOGGER.info("Acao na Janela MacOS foi executada." + "\n");
    }
}
