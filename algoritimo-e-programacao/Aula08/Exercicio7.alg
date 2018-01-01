algoritmo "semnome"
// Função :
// Autor :
// Data : 13/04/2015
// Seção de Declarações 
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
      escreva ("Digite um número: ")
      leia (X)
      escreval ("O fatorial desse número é: ", fatorial(X))
fimalgoritmo
