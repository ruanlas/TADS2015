algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
a, b: inteiro
tipocalculo: caractere
inicio
      escreval ("Digite o que voc� quer calcular: ")
      leia (tipocalculo)
      escreval ("Digite o lado maior do ret�ngulo: ")
      leia (a)
      escreval ("Digite o lado menor do ret�ngulo: ")
      leia (b)
      escolha tipocalculo
              caso "area", "�rea"
                   escreval ("A �rea do ret�ngulo �: ", a*b)
              caso "perimetro", "per�metro"
                   escreval ("O per�metro do ret�ngulo �: ", 2*a+2*b)
              outrocaso
                       escreval ("C�lculo n�o suportado")
      fimescolha
fimalgoritmo
