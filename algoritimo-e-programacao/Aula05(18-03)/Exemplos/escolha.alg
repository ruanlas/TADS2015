algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
nota: inteiro
inicio
// Exerc�cio teste comando "escolha"
   escreval("Digite a nota do aluno(a)")
   leia (nota)
   escolha nota
           caso 1,2
                escreval ("Reprovado")
           caso 3,4,5
                escreval ("Recupera��o")
           caso 6,7,8,9,10
                escreval ("Aprovado")
           outrocaso
                    escreval ("Nota n�o suportada")
   fimescolha
fimalgoritmo
