/*
Exerc�cio 1)
a) Deadlock � o nome dado ao evento que ocorre quando duas transa��es desejam alterar
um dado na mesma tabela ao mesmo tempo. Neste caso, o banco escolhe uma das transa��es
para ser a v�tima do deadlock, ou seja, ele escolhe uma transa��o para ser for�ada a
parar
b) Um deadlock pode ocorrer quando existe duas transa��es querendo alterar um determinado
dado em uma mesma tabela ao mesmo tempo. Neste caso, o pr�prio banco de dados escolhe de forma autom�tica
qual ser� a transa��o que dever� ser a v�tima do deadlock. Quando inicia-se uma transa��o e a mesma n�o �
finalizada, e logo em seguida, inicia-se outra transa��o na mesma tabela, uma transa��o fica esperando
a outra ser finalizada para poder ser executada. Uma situa��o � quando voc� inicia uma transa��o de
altera��o em um registro, e ao mesmo tempo, voc� inicia outra altera��o ou uma consulta ao mesmo registro.
c) Como j� mencionei acima, o pr�pio banco escolhe de forma aleat�ria qual ser� a transa��o que ser�
a v�tima do deadlock, entretanto, o programador pode intervir, de tal forma que, o pr�prio programador
pode configurar qual transa��o poder� ser v�tima de deadlock ou qual transa��o n�o poder� ser vitima.
Ele faz isso "dizendo" ao banco, qual transa��o tem "alta" prioridade, e qual transa��o tem "baixa"
prioridade. Desta forma, numa situa��o de deadlock, a transa��o que possui "baixa" prioridade � automaticamente
escolhida como v�tima de deadlock
*/