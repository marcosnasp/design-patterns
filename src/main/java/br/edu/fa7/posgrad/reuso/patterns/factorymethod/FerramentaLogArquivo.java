package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

import java.io.*;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:07
 */
public class FerramentaLogArquivo extends FerramentaLog {

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
            out.write(saida.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}