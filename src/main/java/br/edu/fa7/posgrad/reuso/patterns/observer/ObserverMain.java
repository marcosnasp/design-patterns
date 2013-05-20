package br.edu.fa7.posgrad.reuso.patterns.observer;

/**
 * Users: <a href="mailto:osmundo02@gmail.com">osmundo02@gmail.com</a>
 *        <a href="mailto:marcos.nas.p@gmail.com">marcos.nas.p@gmail.com</a>
 * Date: 20/05/13
 * Time: 07:34
 */
public class ObserverMain {

	public static void main(String[] args) {
		
		DadosEleicoes dadosEleicoes = new DadosEleicoes();
		
		TelaCandidatosMaisVotados candidatosMaisVotados = new TelaCandidatosMaisVotados(dadosEleicoes);
		
		TelaGrafico grafico = new TelaGrafico(dadosEleicoes);
		
		TelaVoto telaVoto = new TelaVoto(dadosEleicoes);
		
		dadosEleicoes.setDadosEleicoes("Cand 1. Cand 2. Cand 3.", "Grafico em Pizza", "Cand 1 - 350. Cand 2 - 450. Cand 3 - 500");
		dadosEleicoes.setDadosEleicoes("Cand 4. Cand 5. Cand 6.", "Grafico em Barras", "Cand 4 - 250. Cand 5 - 100. Cand 6 - 0");
		dadosEleicoes.setDadosEleicoes("Cand 7. Cand 8. Cand 9.", "Grafico em Colunas", "Cand 7 - 0. Cand 8 - 10. Cand 9 - 15");

        candidatosMaisVotados.exibirElemento();
        grafico.exibirElemento();
        telaVoto.exibirElemento();

        candidatosMaisVotados.atualizar("Cand 1. Cand 2. Cand 3.", "Grafico em Colunas", "Cand 1 - 450. Cand 2 - 460. Cand 3 - 510");
        grafico.atualizar("Cand 4. Cand 5. Cand 6.", "Grafico em Barras", "Cand 4 - 280. Cand 5 - 170. Cand 6 - 80");
        telaVoto.atualizar("Cand 7. Cand 8. Cand 9.", "Grafico em Colunas", "Cand 7 - 10. Cand 8 - 100. Cand 9 - 150");

        candidatosMaisVotados.exibirElemento();
        grafico.exibirElemento();
        telaVoto.exibirElemento();

	}

}
