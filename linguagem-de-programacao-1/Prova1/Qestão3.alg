algoritmo "Quest�o3"
// Fun��o :
// Autor : RUAN LUIZ ALVES DA SILVA
// Data : 16/04/2015
// Se��o de Declara��es 
var
   item: caractere
inicio
// Se��o de Comandos
   escreval ("Digite um ietm para ser analisado por categoria pelo sistema: ")
   leia (item)
        escolha item
                caso "melao", "mel�o", "laranja", "melancia", "caqui", "pera", "p�ra"
                     escreval ("Fruta")
                caso "ab�bora", "abobora", "alho", "alpo", "pepino", "br�colis", "brocolis"
                     escreval ("Legume")
                caso "alface", "acelga", "couve", "almeirao", "almeir�o", "rucula", "r�cula"
                     escreval ("Verdura")
                outrocaso
                         escreval ("N�o Identificado")
        fimescolha
fimalgoritmo
