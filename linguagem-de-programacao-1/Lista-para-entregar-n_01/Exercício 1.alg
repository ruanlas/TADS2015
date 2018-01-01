algoritmo "semnome"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   i, x: inteiro
   mult: real
inicio
// Seção de Comandos 
         escreva ("Digite um número para ser calculado seu fatorial: ")
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
