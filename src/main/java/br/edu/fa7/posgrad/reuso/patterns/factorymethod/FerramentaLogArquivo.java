package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:07
 */
public class FerramentaLogArquivo extends FerramentaLog {

    private static final Logger LOG = Logger.getLogger(FerramentaLogArquivo.class.getName());

    private ArquivoLog arquivoLog;

    public FerramentaLogArquivo(ArquivoLog arquivoLog) {
        if(arquivoLog != null) {
            this.arquivoLog = arquivoLog;
        } else {
            this.arquivoLog = new ArquivoLog();
        }
    }

    public FerramentaLogArquivo() {
        arquivoLog = new ArquivoLog();
    }

    @Override
    public void escreverLog(String saida) {
        File arquivo = arquivoLog.getArquivoLog();
        OutputStream out = null;

        try {
            out = new FileOutputStream(arquivo);
            out.write(saida.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            LOG.info(e.getMessage());
        } catch (IOException e) {
            LOG.info(e.getMessage());
        }  
    }
}