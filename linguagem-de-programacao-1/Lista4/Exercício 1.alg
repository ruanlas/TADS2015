algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 06/04/2015
// Se��o de Declara��es 
var
a, b, c, d, maior: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite o primeiro n�mero: ")
   leia (a)
   escreva ("Digite o segundo n�mero: ")
   leia (b)
   escreva ("Digite o terceiro n�mero: ")
   leia (c)
   escreva ("Digite o quarto n�mero: ")
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
   escreval ("O n�mero maior � ", maior)
fimalgoritmo
