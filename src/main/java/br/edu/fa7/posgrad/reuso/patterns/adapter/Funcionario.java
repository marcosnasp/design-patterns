package br.edu.fa7.posgrad.reuso.patterns.adapter;

import br.edu.fa7.posgrad.reuso.patterns.adapter.interfaces.IFuncionario;

import java.util.Date;
import java.util.logging.Logger;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 22/05/13
 * Time: 07:45
 */
public class Funcionario implements IFuncionario {

    private static final Logger LOGGER = Logger.getLogger(Funcionario.class.getName());

    private String matricula;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private String cargo;
    private String funcao;

    public Funcionario(String matricula, String nome, char sexo, Date dataNascimento, String cargo, String funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public Funcionario() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void receberSalario() {
        LOGGER.info("Funcionario " + nome + "recebe salario" + "\n");
    }

    @Override
    public void registrarPonto() {
        LOGGER.info("Funcionario " + nome + "registra ponto." + "\n");
    }

    @Override
    public void trabalhar() {
        LOGGER.info("Funcionario " + nome + "trabalha." + "\n");
    }

}
