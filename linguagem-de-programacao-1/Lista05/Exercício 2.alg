algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 13/04/2015
// Se��o de Declara��es 
var
   base, expoente, i, potencia: inteiro
inicio
      escreval ("Potencia��o de n�meros inteiros")
      escreval ("Informe a base: ")
      leia (base)
      escreval ("Informe o expoente: ")
      leia (expoente)
      potencia <- 1
      para i de 1 ate expoente faca
           potencia <- potencia*base
      fimpara
      escreval ("O resultado da potencia��o �: ", potencia)
      
fimalgoritmo
