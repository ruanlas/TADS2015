algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
time: caractere
inicio
// Exerc�cio teste comando "escolha"
   escreval("Digite o nome de um time:")
   leia (time)
   escolha time
           caso "Flamengo", "Fluminense", "Vasco", "Botafogo"
                escreval ("� um time carioca")
           caso "S�o Paulo", "Palmeiras", "Santos", "Cor�nthians"
                escreval ("� um time paulista")
           outrocaso
                    escreval ("� um time de outro estado")
   fimescolha
fimalgoritmo
