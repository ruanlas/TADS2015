algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 14/04/2015
// Se��o de Declara��es 
var
   somapar, somaimpar, i, n: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite um valor m�ximo: ")
   leia (n)
   somaimpar <- 0
   para i de 1 ate n passo 2 faca
        somaimpar <- i + somaimpar
   fimpara
   somapar <- 0
   para i de 0 ate n passo 2 faca
        somapar <- i + somapar
   fimpara
   escreval ("Somat�ria dos valores pares: ", somapar)
   escreval ("Somat�ria dos valores �mpares: ", somaimpar)
fimalgoritmo
