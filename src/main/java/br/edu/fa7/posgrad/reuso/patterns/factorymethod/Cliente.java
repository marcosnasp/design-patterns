package br.edu.fa7.posgrad.reuso.patterns.factorymethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 23/05/13
 * Time: 08:19
 */
public class Cliente {

    private FerramentaLog ferramentaLog;

    public Cliente(FerramentaLog ferramentaLog) {
        this.ferramentaLog = ferramentaLog;
    }

    public void contar() {
        int i = 0;

        while (i < 10) {
            ferramentaLog.escreverLog("Saida: " + i);
            i++;
        }
    }
}
