algoritmo "semnome"
// Função :
// Autor :
// Data : 14/04/2015
// Seção de Declarações 
var
   somapar, somaimpar, i, n: inteiro
inicio
// Seção de Comandos
   escreva ("Digite um valor máximo: ")
   leia (n)
   somaimpar <- 0
   para i de 1 ate n passo 2 faca
        somaimpar <- i + somaimpar
   fimpara
   somapar <- 0
   para i de 0 ate n passo 2 faca
        somapar <- i + somapar
   fimpara
   escreval ("Somatória dos valores pares: ", somapar)
   escreval ("Somatória dos valores ímpares: ", somaimpar)
fimalgoritmo
