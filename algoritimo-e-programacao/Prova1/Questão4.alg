algoritmo "Quest�o4"
// Fun��o :
// Autor :
// Data : 15/04/2015
// Se��o de Declara��es 
var
   z: inteiro
inicio
// Se��o de Comandos
  escreva ("Digite um n�mero inteiro qualquer: ")
  leia (z)

  se z mod 2 = 0 entao
     escreval (" A) Este n�mero � par")
  senao
       escreval (" A) Este n�mero � �mpar")
  fimse
  se z > 0 entao
     escreval (" B) Este � um n�mero positivo")
  senao
       escreval (" B) Este � um n�mero negativo")
  fimse
  se z mod 3 = 0 entao
     escreval (" C) Este n�mero � m�ltiplo de 3")
  senao
       escreval (" C) Este n�mero n�o � m�ltiplo de 3")
  fimse

fimalgoritmo
