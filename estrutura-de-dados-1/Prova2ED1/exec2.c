/***** Exercício 2)
Uma solução que eu implementaria seria criar as duas filas, a FilaA e FilaB.
A FilaA conteria os elementos, enquanto a FilaB "simularia" a Pilha.
Contudo, utilizando a função desenfileira na FIlaA, eu retiraria um elemento dela
e colocaria na FIlaB, utilizando a função enfileira. Após utilizado esta função na FilaB,
Eu usaria outra função na FilaB chamado reverte_fila, para inverter a posicao do elemento da fila.
Desta forma, a cada elemento inserido na FilaB, utilizando esta função reverte_fila, ele
mudaria a posição do elemento inserido, simulando uma Pilha.
Depois de mudar os elementos, eu mandaria imprimir a FilaB com a função imprime.

**/
