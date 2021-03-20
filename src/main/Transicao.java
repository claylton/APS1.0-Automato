package main;

public class Transicao {
	private final char caractere;
	private final Estado proximo;
	
	
	public Transicao(char caractere, Estado proximo) {
		this.caractere = caractere;
		this.proximo = proximo;
	}
	
	public Estado getProximo() {
		return proximo;
	}

	public char getCaractere() {
		return caractere;
	}
}
