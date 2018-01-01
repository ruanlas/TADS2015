algoritmo "Exercício7"

var
   num:inteiro

inicio
   escreval ("Digite um número para que o programa o analise")
   leia (num)

   se (num MOD 2) = 0 entao
      escreval ("Este número é par")
   senao
      escreval ("Este número é ímpar")
   fimse

   se (num >= 0) entao
      escreval ("Este número é positivo")
   senao
      escreval ("Este número é negativo")
   fimse

   se (num MOD 3) <> 0 entao
      escreval ("Este número não é múltiplo de 3")
   senao
      escreval ("Este número é múltiplo de 3")
   fimse

fimalgoritmo
