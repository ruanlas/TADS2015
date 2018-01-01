algoritmo "semnome"
// Função :
// Autor :
// Data : 19/03/2015
// Seção de Declarações 
var
   nota: real
inicio
// Exemplo comando "se"
   escreval ("Coloque a nota:")
   leia (nota)
        se (nota >= 7) entao
           escreval ("Aprovado")
        senao
             se (nota < 7) e (nota >= 4) entao
                 escreval ("IFA")
             senao
                se (nota <4) entao
                      escreval ("Reprovado")
                fimse
             fimse
        fimse
fimalgoritmo
