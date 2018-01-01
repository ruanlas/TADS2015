algoritmo "semnome"
// Função :
// Autor :
// Data : 06/04/2015
// Seção de Declarações 
var
p_v, p_n, g_m, g_a: real
qtd: inteiro
inicio
// Seção de Comandos
   escreva ("Digite o valor do litro do combustível sem o aumento: ")
   leia (p_v)
   escreva ("Digite o valor do litro do combustível com o aumento: ")
   leia (p_n)
   escreva ("Digite o consumo (em litros) de gasolina por mês: ")
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
   escreval ("O gasto anual com o aumento será de R$ ", g_a:8:2)
fimalgoritmo
