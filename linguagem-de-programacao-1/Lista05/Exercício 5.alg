algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 14/04/2015
// Se��o de Declara��es 
var
   binario: caractere
   i, n, c: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite um valor em decimal: ")
   leia (n)
   c <- n
   enquanto c > 0 faca
        se (c mod 2) = 0 entao
           binario <- "0" + binario
        senao
             binario <- "1" + binario
        fimse
   c <- c\2
   fimenquanto
   escreval (" O decimal ", n, " convertido em bin�rio �: ", binario)
fimalgoritmo
