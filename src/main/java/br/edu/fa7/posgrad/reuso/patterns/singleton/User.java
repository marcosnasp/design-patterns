package br.edu.fa7.posgrad.reuso.patterns.singleton;

/**
 * User: <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 24/05/13
 * Time: 07:40
 */
public class User {

    private String nome;
    private String matricula;

    public User(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public User() {}

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

}
