package br.edu.fa7.posgrad.reuso.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import br.edu.fa7.posgrad.reuso.patterns.observer.interfaces.Observer;
import br.edu.fa7.posgrad.reuso.patterns.observer.interfaces.Subject;

/**
 * User: <a href="mailto:osmundo02@gmail.com">osmundo02@gmail.com</a>
 * Date: 20/05/13
 * Time: 07:34
 */
public class DadosEleicoes implements Subject {

	public List<Observer> observadores;
	
	public String listaCandidatos;

	public String grafico;
	
	public String votos;
	
	public DadosEleicoes() {
		observadores = new ArrayList<>();
	}
	
	@Override
	public void registrarObservador(Observer o) {
		observadores.add(o);
	}

    @Override
	public void removerObservador(Observer o) {
		int i = observadores.indexOf(o);
		if(i >= 0){
			observadores.remove(i);
		}
	}

	@Override
	public void notificarObservadores() {
		for(Observer observer: observadores){
			observer.atualizar(listaCandidatos, grafico, votos);
		}
	}

	public void dadosEleicoesAlterados(){
		notificarObservadores();
	}
	
	public void setDadosEleicoes(String listaCandidatos, String grafico, String votos){
		this.listaCandidatos = listaCandidatos;
		this.grafico = grafico;
		this.votos = votos;
		
		dadosEleicoesAlterados();
	}

}