algoritmo "Questão1"
// Função :
// Autor :
// Data : 15/04/2015
// Seção de Declarações 
var
   x, y, divisao_inteira, resto_divisao: inteiro
   divisao_normal, potenciacao: real
inicio
// Seção de Comandos
   escreva ("Digite um número inteiro: ")
   leia (x)
   escreva ("Digite outro número inteiro: ")
   leia (y)
   
   divisao_normal <- x/y
   divisao_inteira <- x\y
   resto_divisao <- x mod y
   potenciacao <- x^y
   
   escreval (" A) O resultado da divisão de ", x, " por ", y, " é: ", divisao_normal)
   escreval (" B) O resultado da divisão inteira de ", x, " por ", y, " é: ", divisao_inteira)
   escreval (" C) O resto da divisão de ", x, " por ", y, " é: ", resto_divisao)
   escreval (" D) O resultado da potênciação de ", x, " elevado a ", y, " é: ", potenciacao)
   
fimalgoritmo
