package edu.fa7.posgrad.reuso.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 19:01
 */
public class CompositeMain {

    public static void main(String[] args) {

        Component arquivo = new Arquivo("NomeArquivo.java", 1.2);
        List<Component> arquivos = new ArrayList<Component>();
        arquivos.add(arquivo);

        Component pasta = new Pasta("NomePasta", arquivos);

        pasta.imprimir();

    }

}
