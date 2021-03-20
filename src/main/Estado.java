package main;

import java.util.ArrayList;

public class Estado {
	private final String nome;
	private final boolean estadoFinal;
	private final ArrayList<Transicao> transicoes;
	
	public Estado(String nome, boolean estadoFinal) {
		this.nome = nome;
		this.estadoFinal = estadoFinal;
		this.transicoes = new ArrayList<Transicao>();
	}

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Transicao> getTransicoes() {
		return transicoes;
	}
	
	public boolean isEstadoFinal() {
		return estadoFinal;
	}
	
	public void transicao(char letra, Estado para) {
		this.transicoes.add(new Transicao(letra, para));
	}
}
