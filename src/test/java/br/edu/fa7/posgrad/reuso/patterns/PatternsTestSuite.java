package br.edu.fa7.posgrad.reuso.patterns;

import br.edu.fa7.posgrad.reuso.patterns.composite.PastaTest;
import br.edu.fa7.posgrad.reuso.patterns.strategy.FuncionarioTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 5/20/13
 * Time: 12:56 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        PastaTest.class,
        FuncionarioTest.class
})
public class PatternsTestSuite {

}