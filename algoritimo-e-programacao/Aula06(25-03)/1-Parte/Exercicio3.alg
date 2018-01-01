algoritmo "semnome"
// Função :
// Autor :
// Data : 19/03/2015
// Seção de Declarações 
var
valor1: inteiro
valor2: inteiro
inicio
// Seção de Comandos
   escreva ("Digite o primeiro valor:")
   leia (valor1)
   escreva ("Digite o segundo valor:")
   leia (valor2)
        se (valor1 = valor2) entao
           escreval ("Os valores fornecidos são iguais")
        senao
             se (valor1 < valor2) entao
                escreval ("Os valores fornecidos são diferentes, e o número ", valor2, " é o maior valor")
             senao
                  escreval ("Os valores fornecidos são diferentes, e o número ", valor1, " é o maior valor")
             fimse
        fimse
fimalgoritmo
