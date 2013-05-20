package br.edu.fa7.posgrad.reuso.patterns.observer;

import br.edu.fa7.posgrad.reuso.patterns.observer.interfaces.ExibirElemento;
import br.edu.fa7.posgrad.reuso.patterns.observer.interfaces.Observer;

/**
 * User: <a href="mailto:osmundo02@gmail.com">osmundo02@gmail.com</a>
 * Date: 20/05/13
 * Time: 07:34
 */
public class TelaGrafico implements Observer, ExibirElemento {

	public String listaCandidatos;
	public String grafico;
	public String votos;
	
	public DadosEleicoes dadosEleicoes;
	
	public TelaGrafico(DadosEleicoes dadosEleicoes) {
		this.dadosEleicoes = dadosEleicoes;
		this.dadosEleicoes.registrarObservador(this);
	}
	
	@Override
	public void atualizar(String listaCandidatos, String grafico, String votos) {
		this.listaCandidatos = listaCandidatos;
		this.grafico = grafico;
		this.votos = votos;
		
		exibirElemento();
	}
	
	@Override
	public void exibirElemento() {
		System.out.println("\n======== TELA GRAFICO =========");
		System.out.println("O grafico e: "+grafico);
	}

}