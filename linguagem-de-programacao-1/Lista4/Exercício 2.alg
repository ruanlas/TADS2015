algoritmo "semnome"
// Função :
// Autor :
// Data : 06/04/2015
// Seção de Declarações 
var
nome1, nome2: caractere
idade1, idade2: inteiro
inicio
// Seção de Comandos
   escreva ("Digite o nome do primeiro irmão: ")
   leia (nome1)
   escreva ("Digite sua idade: ")
   leia (idade1)
   escreva ("Digite o nome do segundo irmão: ")
   leia (nome2)
   escreva ("Digite sua idade: ")
   leia (idade2)
   se idade1 > idade2 entao
      escreval (nome2, " ", idade2, " anos")
      escreval (nome1, " ", idade1, " anos")
   senao
        escreval (nome1, " ", idade1, " anos")
        escreval (nome2, " ", idade2, " anos")
   fimse

fimalgoritmo
