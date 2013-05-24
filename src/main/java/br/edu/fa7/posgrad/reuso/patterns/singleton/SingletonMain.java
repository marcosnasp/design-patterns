package br.edu.fa7.posgrad.reuso.patterns.singleton;

import java.util.Calendar;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 24/05/13
 * Time: 07:51
 */
public class SingletonMain {

    public static void main(String[] args) {

        User user = new User();
        user.setNome("Jose");
        user.setMatricula("000112032");

        Operation op = new Operation("Copiar dados");

        Logger logger = Logger.getInstance();
        logger.log(Calendar.getInstance().getTime(), user, op);
    }

}
