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
		// Se já chegou ao final da palavra
		if (posicao == letras.length) {
			// Retornar estado final
			return estado.isEstadoFinal();
		// Se não
		} else {
			// Para cada transição
			for (Transicao transicao : estado.getTransicoes()) {
				// Se for a letra atual
				if (transicao.getCaractere() == letras[posicao]) {
					// Checar próxima recursivamente o resto da palavra
					boolean finalizou = rProcessar(
						transicao.getProximo(),
						letras, posicao+1
					);
					// Se já encontrou um final válido
					if (finalizou) {
						// Retornar válido
						return true;
					}
					
					// Se não continuar procurando
				}
			}
			
			// Se não encontrar nenhuma transição válida, retornar falso
			return false;
		}		
	}
}
