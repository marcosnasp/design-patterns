package br.edu.fa7.posgrad.reuso.patterns.templatemethod;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 5/23/13
 * Time: 1:08 PM
 */
public class LoginERP extends Login {

    private static final Logger LOGGER = Logger.getLogger(LoginERP.class.getName());

    @Override
    public void autenticar() {
        LOGGER.info("Autenticar usuario com Login ERP" + "\n");
    }

    @Override
    public void avisoSucesso() {
        LOGGER.info("Usuario autenticado com sucesso. Apresentando aviso de sucesso com Login ERP." + "\n");
    }

}
