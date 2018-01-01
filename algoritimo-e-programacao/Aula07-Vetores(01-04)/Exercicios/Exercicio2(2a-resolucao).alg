algoritmo "semnome"
// Função :
// Autor :
// Data : 01/04/2015
// Seção de Declarações 
var
numero: vetor [1..15] de inteiro
i: inteiro
inicio
      para i de 1 ate 15 faca
            escreval ("Insira um valor")
            leia (numero[i])
      fimpara
      escreva ("Números positivos deste vetor: ")
      para i de 1 ate 15 faca
           se (numero [i] >=0) entao
              escreva (numero[i]:3)
           fimse
      fimpara
fimalgoritmo
