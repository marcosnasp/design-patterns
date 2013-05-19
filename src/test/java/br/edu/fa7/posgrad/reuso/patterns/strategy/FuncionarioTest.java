package br.edu.fa7.posgrad.reuso.patterns.strategy;

import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoRegistroPonto;
import br.edu.fa7.posgrad.reuso.patterns.strategy.interfaces.ModoTrabalho;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 18/05/13
 * Time: 18:31
 */
public class FuncionarioTest {

    private Funcionario funcionario = new Funcionario();

    @Test
    public void testTrabalhar() throws Exception {
       ModoTrabalho modoTrabalho = mock(ModoTrabalho.class);
       funcionario.setModoTrabalho(modoTrabalho);

       funcionario.trabalhar();

       verify(modoTrabalho, times(1)).trabalhar();
    }

    @Test
    public void testRegistrarPonto() throws Exception {
        ModoRegistroPonto modoRegistroPonto = mock(ModoRegistroPonto.class);
        funcionario.setModoRegistroPonto(modoRegistroPonto);

        funcionario.registrarPonto();

        verify(modoRegistroPonto, times(1)).registrarPonto();
    }

}