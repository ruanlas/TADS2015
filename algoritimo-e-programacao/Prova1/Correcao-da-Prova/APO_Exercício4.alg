algoritmo "Exerc�cio7"

var
   num:inteiro

inicio
   escreval ("Digite um n�mero para que o programa o analise")
   leia (num)

   se (num MOD 2) = 0 entao
      escreval ("Este n�mero � par")
   senao
      escreval ("Este n�mero � �mpar")
   fimse

   se (num >= 0) entao
      escreval ("Este n�mero � positivo")
   senao
      escreval ("Este n�mero � negativo")
   fimse

   se (num MOD 3) <> 0 entao
      escreval ("Este n�mero n�o � m�ltiplo de 3")
   senao
      escreval ("Este n�mero � m�ltiplo de 3")
   fimse

fimalgoritmo
