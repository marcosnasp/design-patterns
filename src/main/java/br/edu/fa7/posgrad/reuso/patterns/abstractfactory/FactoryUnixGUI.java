package br.edu.fa7.posgrad.reuso.patterns.abstractfactory;

import br.edu.fa7.posgrad.reuso.patterns.abstractfactory.interfaces.AbstractFactoryGUI;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 21/05/13
 * Time: 21:37
 */
public class FactoryUnixGUI extends AbstractFactoryGUI {

    @Override
    public Botao criarBotao() {
        return new BotaoUnix();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaUnix();
    }
}
