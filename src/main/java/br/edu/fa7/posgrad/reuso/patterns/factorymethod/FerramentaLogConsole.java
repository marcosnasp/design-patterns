package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:06
 */
public class FerramentaLogConsole extends FerramentaLog {

    private ConsoleLog consoleLog;

    public FerramentaLogConsole(ConsoleLog consoleLog) {
        this.consoleLog = consoleLog;
    }

    @Override
    public void escreverLog(String saida) {
        consoleLog.getConsole().writer().println(saida);
    }
}
