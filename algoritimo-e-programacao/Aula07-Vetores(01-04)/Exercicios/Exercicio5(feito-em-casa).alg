algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
x: vetor [1..10] de inteiro
y: vetor [1..10] de inteiro
soma: vetor [1..10] de inteiro
i: inteiro
inicio
// Seção de Comandos
   para i de 1 ate 10 faca
        escreva ("Digite um número para x", i, ": ")
        leia (x[i])
   fimpara
   para i de 1 ate 10 faca
        escreva ("Digite um número para y", i, ": ")
        leia (y[i])
   fimpara
   escreval
   escreval ("Soma dos elementos de mesma posição")
   para i de 1 ate 10 faca
        soma[i] <- x[i] + y[i]
        escreval (" Posição x", i,", y", i, ": ", "Soma: ", soma[i])
   fimpara
fimalgoritmo
