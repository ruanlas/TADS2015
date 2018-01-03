/*
Relatório de Execução
---------------------
Primeiro é verificado se existe a tabela 'DeadlockTest' e o procedimento 'sp_simulatedeadlock'. Caso não existam, é executado
um comando sql para a criação destes dois objetos. 
O procedimento 'sp_simulatedeadlock' é criado para se tornar uma vítima de deadlock em uma situação onde exista uma transação sendo executada
e este procedimento é chamado para ser executado. Isso é possível pois ele é setado com baixa prioridade de execução. Basicamente, este
procedimento faz alteração na tabela 'DeadlockTest'

Quando é iniciado uma transação na tabela 'DeadlockTeste', é setado como sendo alta prioridade de execução, e quando qualquer outra
transação ou procedimento é iniciado ao mesmo tempo, a primeira transação, por ser setada como alta prioridade, força as outras
transações ou procedimentos a serem vítimas de deadlock. Desta forma, como o procedimento 'sp_simulatedeadlock' tem baixa prioridade de execução,
ao ser chamado depois de iniciar uma transação com alta prioridade de execução, este procedimento se torna uma vítima de deadlock.

Basicamente o deadlock vai interromper um processo ou uma transação caso exista algum processo ou transação sendo executada na tabela. Contudo,
por si próprio, o deadlock pode escolher uma transação aleatória para ser interrompida. Por isso, ao identificar uma situação de deadlock,
o programador pode identificar sua transação como sendo de alta ou baixa prioridade de execução, e isso forçará uma vítima de deadlock,
podendo ser a própria transação ou uma outra transação que está sendo iniciada em outra instância.


*/