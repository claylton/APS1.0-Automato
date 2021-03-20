package main;

import nfa.NDFA;

public class App {

	public static void main(String[] args) {
		Estado q0 = new Estado("q0", false);
		Estado q1 = new Estado("q1", false);
		Estado q2 = new Estado("q2", false);
		Estado qf = new Estado("qf", true);
		
		q0.transicao('a', q0);
		q0.transicao('b', q0);
		q0.transicao('b', q1);
		
		q1.transicao('a', q2);
		q1.transicao('b', q2);
		
		q2.transicao('a', qf);
		q2.transicao('b', qf);
		
		System.out.println(NDFA.processar("aaabb", q0));
	}
}
