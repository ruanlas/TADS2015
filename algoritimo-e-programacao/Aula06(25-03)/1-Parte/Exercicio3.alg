algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 19/03/2015
// Se��o de Declara��es 
var
valor1: inteiro
valor2: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite o primeiro valor:")
   leia (valor1)
   escreva ("Digite o segundo valor:")
   leia (valor2)
        se (valor1 = valor2) entao
           escreval ("Os valores fornecidos s�o iguais")
        senao
             se (valor1 < valor2) entao
                escreval ("Os valores fornecidos s�o diferentes, e o n�mero ", valor2, " � o maior valor")
             senao
                  escreval ("Os valores fornecidos s�o diferentes, e o n�mero ", valor1, " � o maior valor")
             fimse
        fimse
fimalgoritmo
