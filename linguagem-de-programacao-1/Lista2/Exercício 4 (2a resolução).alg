algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 06/04/2015
// Se��o de Declara��es 
var
p_v, p_n, g_m, g_a: real
qtd: inteiro
inicio
// Se��o de Comandos
   escreva ("Digite o valor do litro do combust�vel sem o aumento: ")
   leia (p_v)
   escreva ("Digite o valor do litro do combust�vel com o aumento: ")
   leia (p_n)
   escreva ("Digite o consumo (em litros) de gasolina por m�s: ")
   leia (qtd)
   
   g_m <- p_v*qtd
   escreval
   escreval ("O gasto mensal sem o aumento era de R$ ", g_m:8:2)
   g_a <- g_m*12
   escreval ("O gasto anual sem o aumento seria de R$ ", g_a:8:2)
   escreval
   g_m <- p_n*qtd
   escreval ("O gasto mensal com o aumento passou para R$ ", g_m:8:2)
   g_a <- g_m*12
   escreval ("O gasto anual com o aumento ser� de R$ ", g_a:8:2)
fimalgoritmo
