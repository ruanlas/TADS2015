algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
nota: inteiro
inicio
// Exercício teste comando "escolha"
   escreval("Digite a nota do aluno(a)")
   leia (nota)
   escolha nota
           caso 1,2
                escreval ("Reprovado")
           caso 3,4,5
                escreval ("Recuperação")
           caso 6,7,8,9,10
                escreval ("Aprovado")
           outrocaso
                    escreval ("Nota não suportada")
   fimescolha
fimalgoritmo
