algoritmo "Quest�o1"
// Fun��o :
// Autor :
// Data : 15/04/2015
// Se��o de Declara��es 
var
   x, y, divisao_inteira, resto_divisao: inteiro
   divisao_normal, potenciacao: real
inicio
// Se��o de Comandos
   escreva ("Digite um n�mero inteiro: ")
   leia (x)
   escreva ("Digite outro n�mero inteiro: ")
   leia (y)
   
   divisao_normal <- x/y
   divisao_inteira <- x\y
   resto_divisao <- x mod y
   potenciacao <- x^y
   
   escreval (" A) O resultado da divis�o de ", x, " por ", y, " �: ", divisao_normal)
   escreval (" B) O resultado da divis�o inteira de ", x, " por ", y, " �: ", divisao_inteira)
   escreval (" C) O resto da divis�o de ", x, " por ", y, " �: ", resto_divisao)
   escreval (" D) O resultado da pot�ncia��o de ", x, " elevado a ", y, " �: ", potenciacao)
   
fimalgoritmo
