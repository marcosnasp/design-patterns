package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:10
 */
public class FactoryMethodMain {

    public static void main(String[] args) {

        EscrevedorLog escrevedorLog = new EscrevedorLogConsole();
        EscrevedorLog escrevedorLogArquivo = new EscrevedorLogArquivo();

        FerramentaLog ferramentaLogArquivo = new FerramentaLogArquivo();
        FerramentaLog ferramentaLogConsole = new FerramentaLogConsole();

        Cliente clienteArquivo = new Cliente(ferramentaLogArquivo);
        Cliente clienteConsole = new Cliente(ferramentaLogConsole);

        clienteArquivo.contar();
        clienteConsole.contar();

    }

}
