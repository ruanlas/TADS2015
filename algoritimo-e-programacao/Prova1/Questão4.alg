algoritmo "Questão4"
// Função :
// Autor :
// Data : 15/04/2015
// Seção de Declarações 
var
   z: inteiro
inicio
// Seção de Comandos
  escreva ("Digite um número inteiro qualquer: ")
  leia (z)

  se z mod 2 = 0 entao
     escreval (" A) Este número é par")
  senao
       escreval (" A) Este número é ímpar")
  fimse
  se z > 0 entao
     escreval (" B) Este é um número positivo")
  senao
       escreval (" B) Este é um número negativo")
  fimse
  se z mod 3 = 0 entao
     escreval (" C) Este número é múltiplo de 3")
  senao
       escreval (" C) Este número não é múltiplo de 3")
  fimse

fimalgoritmo
