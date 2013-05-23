package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

import java.io.File;
import java.io.IOException;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:15
 */
public class ArquivoLog extends Saida {

    private File arquivoLog;

    public ArquivoLog(File arquivoLog) {
        if(arquivoLog != null) {
            this.arquivoLog = arquivoLog;
        } else {
            arquivoLog = criarTemporario();
        }
    }

    public ArquivoLog() {
        arquivoLog = criarTemporario();
    }

    private File criarTemporario() {
        try {
            arquivoLog = File.createTempFile("temp-file-name", ".tmp");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arquivoLog;
    }

    public File getArquivoLog() {
        return arquivoLog;
    }

    public void setArquivoLog(File arquivoLog) {
        this.arquivoLog = arquivoLog;
    }

}