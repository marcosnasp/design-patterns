package br.edu.fa7.posgrad.reuso.patterns.singleton;

import java.util.Date;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 24/05/13
 * Time: 07:39
 */
public class Logger {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());

    private static Logger logger;

    private Logger() {}

    public void log(Date dt, User user, Operation operation) {
        LOGGER.info("Operacao: " + operation.getTipoOperacao() +
                " realizada pelo usuario " + user.getMatricula() + " na Data: " +
                dt.getTime());
    }

    public Log query(Integer id) {
        throw new UnsupportedOperationException("Operacao de query ainda nao suportada");
    }

    public void report(Date dt) {
        throw new UnsupportedOperationException("Operacao de report ainda nao suportada");
    }

    public static synchronized Logger getInstance() {
        if(logger != null) {
            return logger;
        } else {
            return new Logger();
        }
    }

}
