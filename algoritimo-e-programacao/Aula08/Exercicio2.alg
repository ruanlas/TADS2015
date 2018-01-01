algoritmo "semnome"
// Função :
// Autor :
// Data : 08/04/2015
// Seção de Declarações 
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
      escreva ("Digite um número: ")
      leia (numero)
      se estudo_sinal(numero) entao
         escreva ("É positivo")
      senao
           escreva ("É negativo")
      fimse
fimalgoritmo
