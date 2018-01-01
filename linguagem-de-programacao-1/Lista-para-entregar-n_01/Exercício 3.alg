algoritmo "Exercício 3"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   a: vetor [1..10] de inteiro
   b: vetor [1..10] de inteiro
   i: inteiro

   funcao soma(x,y:inteiro):inteiro
   var
      total: inteiro
   inicio
         total <- x + y
         retorne total
   fimfuncao
   
inicio
// Seção de Comandos 
   para i de 1 ate 10 faca
        escreva ("Digite um número para ser armazenado no Vetor A",i,":")
        leia (a[i])
        escreva ("Digite um número para ser armazenado no Vetor B",i,":")
        leia (b[i])
   fimpara
   para i de 1 ate 10 faca
        escreval ("A",i:1, " + ", "B",i:1, " =", soma(a[i],b[i]))
   fimpara
fimalgoritmo
