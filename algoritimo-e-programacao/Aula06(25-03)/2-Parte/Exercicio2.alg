algoritmo "exerc�cio 2"
// Fun��o :
// Autor :
// Data : 25/03/2015
// Se��o de Declara��es 
var
numero: inteiro
inicio
      escreval ("Digite um N�mero:")
      leia (numero)
      se (numero > 0) e (numero < 10) entao
         escreval("Um d�gito")
         senao
              se (numero > 9) e (numero < 100) entao
                 escreval ("Dois d�gitos")
                 senao
                      se (numero > 99) e (numero < 1000) entao
                         escreval ("Tr�s d�gitos")
                         senao
                              se (numero > 999) e (numero < 10000) entao
                                 escreval ("Quatro d�gitos")
                                 senao
                                 se (numero > 9999) entao
                                    escreval ("Cinco ou mais d�gitos")
                                    senao
                                    escreval ("Numero N�o avaliado")
                                 fimse
                              fimse
                      fimse
              fimse
      fimse
fimalgoritmo
