algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao par_impar (n:inteiro): logico
   var
      situacao: logico
   inicio
         se n mod 2 = 0 entao
            situacao <- verdadeiro
         senao
              situacao <- falso
         fimse
         retorne situacao
   fimfuncao
var
   numero: inteiro
inicio
      escreva ("Digite um n�mero qualquer: ")
      leia (numero)
      escreva ("Este n�mero � par? ", par_impar(numero))
fimalgoritmo
