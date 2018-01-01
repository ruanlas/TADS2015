algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
time: caractere
inicio
// Exercício teste comando "escolha"
   escreval("Digite o nome de um time:")
   leia (time)
   escolha time
           caso "Flamengo", "Fluminense", "Vasco", "Botafogo"
                escreval ("É um time carioca")
           caso "São Paulo", "Palmeiras", "Santos", "Corínthians"
                escreval ("É um time paulista")
           outrocaso
                    escreval ("É um time de outro estado")
   fimescolha
fimalgoritmo
