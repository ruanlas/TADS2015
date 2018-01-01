algoritmo "Exercício 2"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
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
// Seção de Comandos
   escreva ("Digite o valor do 1º resistor em Ohms: ")
   leia (R1)
   escreva ("Digite o valor do 2º resistor em Ohms: ")
   leia (R2)
   escreval
   escreval ("O Valor da Resistência equivalente é de: " , Re_equi(R1,R2):2:3, " Ohms")
fimalgoritmo
