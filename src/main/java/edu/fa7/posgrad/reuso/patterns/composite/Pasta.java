package edu.fa7.posgrad.reuso.patterns.composite;

import java.util.List;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:53
 */
public class Pasta extends Component {

    private List<Component> pastas;

    public Pasta(String nome, List<Component> pastas) {
        super.nome = nome;
        this.pastas = pastas;
    }

    public void setPastas(List<Component> pastas) {
        this.pastas = pastas;
    }

    @Override
    public void imprimir() {
        for(Component component : pastas) {
            component.imprimir();
        }
    }
}
