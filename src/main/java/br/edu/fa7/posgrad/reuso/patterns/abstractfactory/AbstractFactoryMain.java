package br.edu.fa7.posgrad.reuso.patterns.abstractfactory;

import br.edu.fa7.posgrad.reuso.patterns.abstractfactory.interfaces.AbstractFactoryGUI;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 06:45
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

        AbstractFactoryGUI fabricaUnix = new FactoryUnixGUI();
        AbstractFactoryGUI fabricaWindows = new FactoryWindowsGUI();
        AbstractFactoryGUI fabricaMacOS = new FactoryMacOSGUI();

        Janela janelaWindows = fabricaWindows.criarJanela();
        Botao botaoWindows = fabricaWindows.criarBotao();

        Janela janelaUnix = fabricaUnix.criarJanela();
        Botao botaoUnix = fabricaUnix.criarBotao();

        Janela janelaMacOS = fabricaMacOS.criarJanela();
        Botao botaoMacOS = fabricaMacOS.criarBotao();

        botaoWindows.executarAcao();
        botaoUnix.executarAcao();
        botaoMacOS.executarAcao();

        janelaWindows.executarAcao();
        janelaUnix.executarAcao();
        janelaMacOS.executarAcao();

    }

}
