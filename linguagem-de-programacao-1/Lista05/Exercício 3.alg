algoritmo "semnome"
// Função :
// Autor :
// Data : 14/04/2015
// Seção de Declarações 
var
   soma, i, n: inteiro
inicio
      escreva ("Digite um número: ")
      leia (n)
      soma <- 0
      para i de 1 ate n faca
           soma <- i*i*i + soma
      fimpara
      escreval ("A soma dos primeiros ", n, " cubos é ", soma)
fimalgoritmo
