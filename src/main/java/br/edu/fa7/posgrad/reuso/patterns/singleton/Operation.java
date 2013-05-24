package br.edu.fa7.posgrad.reuso.patterns.singleton;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 24/05/13
 * Time: 07:41
 */
public class Operation {

    private String tipoOperacao;

    public Operation(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

}
