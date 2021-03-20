package dfa;

import java.util.ArrayList;

import main.Estado;
import main.Transicao;

public class DFA {
	public static boolean processar(String palavra, Estado inicial) {
		// Transformar String em letras
		char[] letras = palavra.toCharArray();
		int posicao = 0;
		Estado atual = inicial;
		
		// Enquanto existir letras
		while (posicao < letras.length) {
			ArrayList<Transicao> transicoes = atual.getTransicoes();
			boolean encontrado = false;
			
			// Se existir transi��o
			for (Transicao transicao: transicoes) {
				// Ir para a pr�xima posi��o e estado
				if (letras[posicao] == transicao.getCaractere()) {
					posicao++;
					atual = transicao.getProximo();
					encontrado = true;
					break;
				}
			}
			
			// N�o existe estado para o caractere atual
			if (!encontrado) {
				return false;
			}
		}
		
		// Retornar se � estado final
		return atual.isEstadoFinal();
	}
}
