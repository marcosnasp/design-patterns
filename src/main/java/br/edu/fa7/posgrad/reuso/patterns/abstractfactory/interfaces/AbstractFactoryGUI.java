package br.edu.fa7.posgrad.reuso.patterns.abstractfactory.interfaces;

import br.edu.fa7.posgrad.reuso.patterns.abstractfactory.Botao;
import br.edu.fa7.posgrad.reuso.patterns.abstractfactory.Janela;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 21/05/13
 * Time: 21:35
 */
public abstract class AbstractFactoryGUI {

    public abstract Botao criarBotao();

    public abstract Janela criarJanela();

}
