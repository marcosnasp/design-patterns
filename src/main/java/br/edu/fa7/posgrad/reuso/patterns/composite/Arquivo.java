package br.edu.fa7.posgrad.reuso.patterns.composite;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:52
 */
public class Arquivo extends Component {
    private static final Logger LOGGER = Logger.getLogger(Arquivo.class.getName());

    private double tamanhoArquivo;

    public Arquivo(String nome, double tamanhoArquivo) {
        super.nome = nome;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void imprimir() {
        LOGGER.info("Imprimindo o arquivo: " + toString());
    }

    @Override
    public String toString() {
        return "nome Arquivo: " + nome + " tamanho arquivo: " + tamanhoArquivo;
    }
}
