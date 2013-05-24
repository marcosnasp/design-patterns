package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:06
 */
public class FerramentaLogConsole extends FerramentaLog {

    private ConsoleLog consoleLog;

    public FerramentaLogConsole(ConsoleLog consoleLog) {
        if(consoleLog != null) {
            this.consoleLog = consoleLog;
        } else {
            consoleLog = new ConsoleLog();
        }

    }

    public FerramentaLogConsole() {
        this.consoleLog = new ConsoleLog();
    }

    @Override
    public void escreverLog(String saida) {
        this.consoleLog.getConsole().println(saida);
    }
}
