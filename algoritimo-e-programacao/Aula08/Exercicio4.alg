algoritmo "semnome"
// Função :
// Autor :
// Data : 08/04/2015
// Seção de Declarações 
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
      escreva ("Digite um número qualquer: ")
      leia (numero)
      se avaliacao(numero) entao
         escreval ("Par")
      senao
           escreva("Ímpar")
      fimse
fimalgoritmo
