algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao estudo_sinal (n:inteiro):logico
   var
      sinal: logico
   inicio
         se n > 0 entao
               sinal <- verdadeiro
         senao
              sinal <- falso
         fimse
         retorne sinal
   fimfuncao
         
var
   numero: inteiro
inicio
      escreva ("Digite um n�mero: ")
      leia (numero)
      se estudo_sinal(numero) entao
         escreva ("� positivo")
      senao
           escreva ("� negativo")
      fimse
fimalgoritmo
