package edu.fa7.posgrad.reuso.patterns.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 19:08
 */
public class PastaTest {

    @Test
    public void testImprimir() throws Exception {
        Component component = mock(Component.class);

        List<Component> pastas = new ArrayList<Component>();
        pastas.add(component);
        pastas.add(component);

        Pasta pasta = new Pasta("nomePasta", pastas);
        pasta.imprimir();

        verify(component, times(2)).imprimir();
    }
}
