package br.edu.fa7.posgrad.reuso.patterns.observer.interfaces;

/**
 * User: <a href="mailto:osmundo02@gmail.com">osmundo02@gmail.com</a>
 * Date: 20/05/13
 * Time: 07:34
 */
// TODO: desacoplar forma de visualização da interface observer.
public interface Observer {

	void atualizar(String listaCandidatos, String grafico, String votos);
}
