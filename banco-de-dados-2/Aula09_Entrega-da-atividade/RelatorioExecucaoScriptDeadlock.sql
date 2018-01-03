/*
Relat�rio de Execu��o
---------------------
Primeiro � verificado se existe a tabela 'DeadlockTest' e o procedimento 'sp_simulatedeadlock'. Caso n�o existam, � executado
um comando sql para a cria��o destes dois objetos. 
O procedimento 'sp_simulatedeadlock' � criado para se tornar uma v�tima de deadlock em uma situa��o onde exista uma transa��o sendo executada
e este procedimento � chamado para ser executado. Isso � poss�vel pois ele � setado com baixa prioridade de execu��o. Basicamente, este
procedimento faz altera��o na tabela 'DeadlockTest'

Quando � iniciado uma transa��o na tabela 'DeadlockTeste', � setado como sendo alta prioridade de execu��o, e quando qualquer outra
transa��o ou procedimento � iniciado ao mesmo tempo, a primeira transa��o, por ser setada como alta prioridade, for�a as outras
transa��es ou procedimentos a serem v�timas de deadlock. Desta forma, como o procedimento 'sp_simulatedeadlock' tem baixa prioridade de execu��o,
ao ser chamado depois de iniciar uma transa��o com alta prioridade de execu��o, este procedimento se torna uma v�tima de deadlock.

Basicamente o deadlock vai interromper um processo ou uma transa��o caso exista algum processo ou transa��o sendo executada na tabela. Contudo,
por si pr�prio, o deadlock pode escolher uma transa��o aleat�ria para ser interrompida. Por isso, ao identificar uma situa��o de deadlock,
o programador pode identificar sua transa��o como sendo de alta ou baixa prioridade de execu��o, e isso for�ar� uma v�tima de deadlock,
podendo ser a pr�pria transa��o ou uma outra transa��o que est� sendo iniciada em outra inst�ncia.


*/