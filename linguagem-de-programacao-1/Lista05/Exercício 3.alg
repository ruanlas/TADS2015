algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 14/04/2015
// Se��o de Declara��es 
var
   soma, i, n: inteiro
inicio
      escreva ("Digite um n�mero: ")
      leia (n)
      soma <- 0
      para i de 1 ate n faca
           soma <- i*i*i + soma
      fimpara
      escreval ("A soma dos primeiros ", n, " cubos � ", soma)
fimalgoritmo
