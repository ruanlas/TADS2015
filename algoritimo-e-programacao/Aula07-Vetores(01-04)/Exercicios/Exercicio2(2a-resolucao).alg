algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 01/04/2015
// Se��o de Declara��es 
var
numero: vetor [1..15] de inteiro
i: inteiro
inicio
      para i de 1 ate 15 faca
            escreval ("Insira um valor")
            leia (numero[i])
      fimpara
      escreva ("N�meros positivos deste vetor: ")
      para i de 1 ate 15 faca
           se (numero [i] >=0) entao
              escreva (numero[i]:3)
           fimse
      fimpara
fimalgoritmo
