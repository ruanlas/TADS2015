algoritmo "Quest�o2"
// Fun��o :
// Autor :
// Data : 15/04/2015
// Se��o de Declara��es 
var
   x, pf, a: real
   n: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite um n�mero real: ")
   leia (x)

   n <- int (x)
   pf <- x - int(x)
   a <- x
   
   escreval (" A) A parte inteira �: ", n)
   escreval (" B) A parte fracion�ria �: ", pf)
   escreval (" C) O n�mero arredondado sem casas decimais fica: ", a:3:0)
   
fimalgoritmo
