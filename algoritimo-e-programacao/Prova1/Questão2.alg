algoritmo "Questão2"
// Função :
// Autor :
// Data : 15/04/2015
// Seção de Declarações 
var
   x, pf, a: real
   n: inteiro
inicio
// Seção de Comandos
   escreva ("Digite um número real: ")
   leia (x)

   n <- int (x)
   pf <- x - int(x)
   a <- x
   
   escreval (" A) A parte inteira é: ", n)
   escreval (" B) A parte fracionária é: ", pf)
   escreval (" C) O número arredondado sem casas decimais fica: ", a:3:0)
   
fimalgoritmo
