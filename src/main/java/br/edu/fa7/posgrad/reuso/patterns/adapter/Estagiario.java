package br.edu.fa7.posgrad.reuso.patterns.adapter;

import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IEstagiario;

import java.util.Date;
import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 07:45
 */
public class Estagiario implements IEstagiario {

    private static final Logger LOGGER = Logger.getLogger(Estagiario.class.getName());

    private String nome;
    private String matricula;
    private char sexo;
    private Date dataNascimento;

    public Estagiario(String nome, String matricula, char sexo, Date dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Estagiario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void receberBolsa() {
        LOGGER.info("Estagiario " + nome + "recebe a bolsa" + "\n");
    }

    @Override
    public void registrarEntrada() {
        LOGGER.info("Estagiario " + nome + "registra a entrada" + "\n");
    }


    @Override
    public void registrarSaida() {
        LOGGER.info("Estagiario " + nome + "registra a saida." + "\n");
    }

    @Override
    public void estagiar() {
        LOGGER.info("Estagiario " + nome + "faz estagio." + "\n");
    }

}
