algoritmo "semnome"
// Função :
// Autor :
// Data : 08/04/2015
// Seção de Declarações 
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
      escreva ("Digite um número qualquer: ")
      leia (numero)
      escreva ("Este número é par? ", par_impar(numero))
fimalgoritmo
