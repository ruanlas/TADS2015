algoritmo "Questão1"
// Função :
// Autor : RUAN LUIZ ALVES DA SILVA
// Data : 16/04/2015
// Seção de Declarações 
var
   res, x: real
inicio
// Seção de Comandos
   escreval ("Calculando a diferença de um valor para o seu inteiro mais próximo")
   escreva("Digite o valor: R$ ")
   leia (x)
        res <- 1-(x- int(x))
   escreval ("A diferença é de R$", res:3:2, " centavos")
fimalgoritmo
