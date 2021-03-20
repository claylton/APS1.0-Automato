package nfa;

import main.Estado;
import main.Transicao;

public class NDFA {
	public static boolean processar(String palavra, Estado inicial) {
		// Transformar String em letras
		char[] letras = palavra.toCharArray();
		return rProcessar(inicial, letras, 0);
	}
	
	private static boolean rProcessar(Estado estado, char[] letras, int posicao) {
		// Se j� chegou ao final da palavra
		if (posicao == letras.length) {
			// Retornar estado final
			return estado.isEstadoFinal();
		// Se n�o
		} else {
			// Para cada transi��o
			for (Transicao transicao : estado.getTransicoes()) {
				// Se for a letra atual
				if (transicao.getCaractere() == letras[posicao]) {
					// Checar pr�xima recursivamente o resto da palavra
					boolean finalizou = rProcessar(
						transicao.getProximo(),
						letras, posicao+1
					);
					// Se j� encontrou um final v�lido
					if (finalizou) {
						// Retornar v�lido
						return true;
					}
					
					// Se n�o continuar procurando
				}
			}
			
			// Se n�o encontrar nenhuma transi��o v�lida, retornar falso
			return false;
		}		
	}
}
