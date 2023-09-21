package br.edu.fa7.posgrad.reuso.patterns;

import br.edu.fa7.posgrad.reuso.patterns.composite.PastaTest;
import br.edu.fa7.posgrad.reuso.patterns.strategy.FuncionarioTest;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 5/20/13
 * Time: 12:56 PM
 */
@SelectPackages({"br.edu.fa7.posgrad.reuso.patterns.composite.*"
        , "br.edu.fa7.posgrad.reuso.patterns.strategy.*"})

@IncludeTags("production")
@Suite
public class PatternsTestSuite {

}

