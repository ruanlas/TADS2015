algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao avaliacao (n:inteiro):logico
   var
      par: logico
   inicio
         se n mod 2 = 0 entao
            par <- verdadeiro
         senao
              par <- falso
         fimse
         retorne par
   fimfuncao
var
   numero: inteiro
inicio
      escreva ("Digite um n�mero qualquer: ")
      leia (numero)
      se avaliacao(numero) entao
         escreval ("Par")
      senao
           escreva("�mpar")
      fimse
fimalgoritmo
