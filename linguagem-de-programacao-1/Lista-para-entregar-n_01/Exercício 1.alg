algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 26/04/2015
// Se��o de Declara��es 
var
   i, x: inteiro
   mult: real
inicio
// Se��o de Comandos 
         escreva ("Digite um n�mero para ser calculado seu fatorial: ")
         leia (x)
         se (x = 1) ou (x = 0) entao
                 mult <- 1
         senao
              para i de x ate 2 passo -1 faca
                   se i=x entao
                      mult <- i * (i-1)
                   senao
                        mult <- mult* (i-1)
                   fimse
              fimpara
         fimse
         escreval (x,"!","=",mult)
fimalgoritmo
