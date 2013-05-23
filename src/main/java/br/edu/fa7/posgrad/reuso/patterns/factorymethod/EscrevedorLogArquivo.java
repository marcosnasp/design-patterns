package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:07
 */
public class EscrevedorLogArquivo extends EscrevedorLog {
    @Override
    public EscrevedorLog criarFerramentaLog() {
        return new EscrevedorLogArquivo();
    }
}
