algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
// Exemplo 3
numeros: vetor [1..10] de inteiro
i, valor: inteiro
encontrou: logico
inicio
      para i de 1 ate 10 faca
           escreva ("Digite um n�mero ")
           leia (numeros[i])
      fimpara
      
      escreva ("Digite um n�mero para ser buscado no vetor: ")
      leia (valor)
      
      encontrou <- falso
      para i de 1 ate 10 faca
           se (numeros[i] = valor) entao
              encontrou <- verdadeiro
           fimse
      fimpara
      se encontrou entao
         escreva ("O valor se encontra no vetor")
      senao
           escreva ("O valor n�o se encontra no vetor")
      fimse
fimalgoritmo
