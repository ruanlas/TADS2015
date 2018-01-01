algoritmo "semnome"
// Função :
// Autor :
// Data : 06/04/2015
// Seção de Declarações 
var
a, b, c, d, maior: inteiro
inicio
// Seção de Comandos
   escreva ("Digite o primeiro número: ")
   leia (a)
   escreva ("Digite o segundo número: ")
   leia (b)
   escreva ("Digite o terceiro número: ")
   leia (c)
   escreva ("Digite o quarto número: ")
   leia (d)
   
   se a<b entao
      maior <- b
   senao
        maior <- a
   fimse
   se maior < c entao
      maior <- c
   fimse
   se maior < d entao
      maior <- d
   fimse
   escreval
   escreval ("O número maior é ", maior)
fimalgoritmo
