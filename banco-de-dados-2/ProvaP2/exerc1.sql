/*
Exercício 1)
a) Deadlock é o nome dado ao evento que ocorre quando duas transações desejam alterar
um dado na mesma tabela ao mesmo tempo. Neste caso, o banco escolhe uma das transações
para ser a vítima do deadlock, ou seja, ele escolhe uma transação para ser forçada a
parar
b) Um deadlock pode ocorrer quando existe duas transações querendo alterar um determinado
dado em uma mesma tabela ao mesmo tempo. Neste caso, o próprio banco de dados escolhe de forma automática
qual será a transação que deverá ser a vítima do deadlock. Quando inicia-se uma transação e a mesma não é
finalizada, e logo em seguida, inicia-se outra transação na mesma tabela, uma transação fica esperando
a outra ser finalizada para poder ser executada. Uma situação é quando você inicia uma transação de
alteração em um registro, e ao mesmo tempo, você inicia outra alteração ou uma consulta ao mesmo registro.
c) Como já mencionei acima, o própio banco escolhe de forma aleatória qual será a transação que será
a vítima do deadlock, entretanto, o programador pode intervir, de tal forma que, o próprio programador
pode configurar qual transação poderá ser vítima de deadlock ou qual transação não poderá ser vitima.
Ele faz isso "dizendo" ao banco, qual transação tem "alta" prioridade, e qual transação tem "baixa"
prioridade. Desta forma, numa situação de deadlock, a transação que possui "baixa" prioridade é automaticamente
escolhida como vítima de deadlock
*/