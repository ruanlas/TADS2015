algoritmo "Exerc�cio 2"
// Fun��o :
// Autor :
// Data : 26/04/2015
// Se��o de Declara��es 
var
   R1, R2: inteiro
   funcao Re_equi (a,b:inteiro):real
   var
      req: real
   inicio
         req <- a*b/(a+b)
         retorne req
   fimfuncao

inicio
// Se��o de Comandos
   escreva ("Digite o valor do 1� resistor em Ohms: ")
   leia (R1)
   escreva ("Digite o valor do 2� resistor em Ohms: ")
   leia (R2)
   escreval
   escreval ("O Valor da Resist�ncia equivalente � de: " , Re_equi(R1,R2):2:3, " Ohms")
fimalgoritmo
