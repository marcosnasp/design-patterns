package br.edu.fa7.posgrad.reuso.patterns.templatemethod;

import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 5/23/13
 * Time: 1:05 PM
 */
public abstract class Login {

    private static final Logger LOGGER = Logger.getLogger(Login.class.getName());

    protected boolean autenticado;

    public abstract void autenticar();
    public abstract void avisoSucesso();

    public void avisoVisual() {
        LOGGER.info("Autenticando utilizando as informacoes do usuario");
    }

    public void prompt() {
        LOGGER.info("Apresentar o prompt de autenticacao");
    }

    public final void login() {
        prompt();
        autenticar();
        avisoVisual();
        avisoSucesso();
    }

}