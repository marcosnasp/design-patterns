package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

import java.io.Console;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:15
 */
public class ConsoleLog {

    private Console console;

    public ConsoleLog(Console console) {
        if(console != null) {
            this.console = console;
        } else {
            this.console = System.console();
        }

    }

    public ConsoleLog() {
        console = System.console();
    }

    public Console getConsole() {
        return console;
    }

}
