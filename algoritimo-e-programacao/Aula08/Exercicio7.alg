algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 13/04/2015
// Se��o de Declara��es 
var
   x: inteiro
   funcao fatorial(n:inteiro):inteiro
   var
      i:inteiro
      fat:inteiro
   inicio
         fat <- 1
         para i de 1 ate n faca
              fat <- fat*i
         fimpara
         retorne fat
   fimfuncao
inicio
      escreva ("Digite um n�mero: ")
      leia (X)
      escreval ("O fatorial desse n�mero �: ", fatorial(X))
fimalgoritmo
