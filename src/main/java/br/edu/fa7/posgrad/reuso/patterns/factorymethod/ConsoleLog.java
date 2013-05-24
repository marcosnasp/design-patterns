package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

import java.io.Console;
import java.io.PrintStream;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:15
 */
public class ConsoleLog extends Saida {

    private PrintStream console;

    public ConsoleLog(PrintStream console) {
        if(console != null) {
            this.console = console;
        } else {
            this.console = System.out;
        }

    }

    public ConsoleLog() {
        this.console = System.out;
    }

    public PrintStream getConsole() {
        return console;
    }

}
