package br.edu.fa7.posgrad.reuso.patterns.templatemethod;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 5/23/13
 * Time: 1:20 PM
 */
public class TemplateMethodMain {

    public  static void main(String[] args) {
        Login loginDecisionSupportSystem = new LoginDecisionSupportSystem();
        loginDecisionSupportSystem.login();

        Login loginERP = new LoginERP();
        loginERP.login();

    }

}
