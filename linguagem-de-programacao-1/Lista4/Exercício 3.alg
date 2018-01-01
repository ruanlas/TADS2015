algoritmo "semnome"
// Função :
// Autor :
// Data : 07/04/2015
// Seção de Declarações 
var
iten1, iten2, iten3, iten4, iten5: caractere
preco1, preco2, preco3, preco4, preco5: real
reajuste: real
inicio
// Seção de Comandos
   escreva ("Digite o nome do item 1: ")
   leia (iten1)
   escreva ("Digite o valor do item 1: R$ ")
   leia (preco1)
   escreval
   escreva ("Digite o nome do item 2: ")
   leia (iten2)
   escreva ("Digite o valor do item 2: R$ ")
   leia (preco2)
   escreval
   escreva ("Digite o nome do item 3: ")
   leia (iten3)
   escreva ("Digite o valor do item 3: R$ ")
   leia (preco3)
   escreval
   escreva ("Digite o nome do item 4: ")
   leia (iten4)
   escreva ("Digite o valor do item 4: R$ ")
   leia (preco4)
   escreval
   escreva ("Digite o nome do item 5: ")
   leia (iten5)
   escreva ("Digite o valor do item 5: R$ ")
   leia (preco5)
   escreval
   escreva ("Insira o valor do reajuste: ")
   leia (reajuste)
   escreval
   escreval (iten1, " R$ ", preco1 + (preco1 * (reajuste/100)):6:2)
   escreval (iten2, " R$ ", preco2 + (preco2 * (reajuste/100)):6:2)
   escreval (iten3, " R$ ", preco3 + (preco3 * (reajuste/100)):6:2)
   escreval (iten4, " RS ", preco4 + (preco4 * (reajuste/100)):6:2)
   escreval (iten5, " R$ ", preco5 + (preco5 * (reajuste/100)):6:2)
fimalgoritmo
