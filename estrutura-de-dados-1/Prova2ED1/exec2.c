/***** Exerc�cio 2)
Uma solu��o que eu implementaria seria criar as duas filas, a FilaA e FilaB.
A FilaA conteria os elementos, enquanto a FilaB "simularia" a Pilha.
Contudo, utilizando a fun��o desenfileira na FIlaA, eu retiraria um elemento dela
e colocaria na FIlaB, utilizando a fun��o enfileira. Ap�s utilizado esta fun��o na FilaB,
Eu usaria outra fun��o na FilaB chamado reverte_fila, para inverter a posicao do elemento da fila.
Desta forma, a cada elemento inserido na FilaB, utilizando esta fun��o reverte_fila, ele
mudaria a posi��o do elemento inserido, simulando uma Pilha.
Depois de mudar os elementos, eu mandaria imprimir a FilaB com a fun��o imprime.

**/
