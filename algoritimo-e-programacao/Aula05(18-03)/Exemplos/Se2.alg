algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 19/03/2015
// Se��o de Declara��es 
var
   nota: real
inicio
// Exemplo comando "se"
   escreval ("Coloque a nota:")
   leia (nota)
        se (nota >= 7) entao
           escreval ("Aprovado")
        fimse
             se (nota < 7) e (nota >= 4) entao
                 escreval ("IFA")
             fimse
                se (nota <4) entao
                      escreval ("Reprovado")
        fimse
fimalgoritmo
