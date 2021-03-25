# Instruções para execução:

PASSO 1:

Inicialmente deve-se criar os estados da seguinte forma:
Estado q0 = new Estado("q0", false);		---------> Onde a String "q0" seria o nome estado, e o parametro false é para definir se o automato é o final ou nao.
Estado qf = new Estado("qf", true);			---------> Nessa situaçao temos que o estado qf, de nome "qf" e temos o parametro definito como true, logo esse automato é o estado final de aceitaçao.

PASSO 2:

Criaçao das transiçoes entre estados:
q0.transicao('a', q0);		-----------> No primeiro parametro 'a' dizemos que o caractere é uma aceitação para uma transição ja no segundo parametro q0, é o estado para qual devemos ir caso encontremos o caractere 'a'

Exemplo:
q0.transicao('b', q1);		-----------> Aqui dizemos que estamos em q0 e caso encontremos o caractere 'b', iremos fazer uma transiçao de q0 para q1.

OBS 1: So devem ser inseridos na funçao estados que foram previamente criados no passo 1.

PASSO 3:

Processamento do Algoritmo desejado:

Funçao de processamento para NDFA.
system.out.println((NDFA.processar("aaabb", q0));	--------------------> Para se processar e imprimir o resultado da palavra desejada, devemos começar com a funçao de impressao, posteriormente chamar a funçao processar referente ao algoritmo desejado, seguido da palavra no formato de string e posteriormente inserimos como parametro o estado inicial.

Funçao de processamento DFA.
system.out.println(DFA.processar("aaabb", q0));	--------------------> Para se processar e imprimir o resultado da palavra desejada, devemos começar com a funçao de impressao, posteriormente chamar a funçao processar referente ao algoritmo desejado, seguido da palavra no formato de string e posteriormente inserimos como parametro o estado inicial.

OBS 2: Todas essas funçoes devem exclusivamente serem usadas na classe App.java.
