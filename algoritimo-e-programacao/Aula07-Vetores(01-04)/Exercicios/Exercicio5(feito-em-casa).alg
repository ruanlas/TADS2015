algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
x: vetor [1..10] de inteiro
y: vetor [1..10] de inteiro
soma: vetor [1..10] de inteiro
i: inteiro
inicio
// Se��o de Comandos
   para i de 1 ate 10 faca
        escreva ("Digite um n�mero para x", i, ": ")
        leia (x[i])
   fimpara
   para i de 1 ate 10 faca
        escreva ("Digite um n�mero para y", i, ": ")
        leia (y[i])
   fimpara
   escreval
   escreval ("Soma dos elementos de mesma posi��o")
   para i de 1 ate 10 faca
        soma[i] <- x[i] + y[i]
        escreval (" Posi��o x", i,", y", i, ": ", "Soma: ", soma[i])
   fimpara
fimalgoritmo
