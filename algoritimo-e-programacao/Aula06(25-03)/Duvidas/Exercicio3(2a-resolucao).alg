algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
nome: caractere
nota1, nota2, nota3, soma: inteiro
media: real
inicio
// Se��o de Comandos
   escreval ("Digite o nome do aluno:")
   leia (nome)
   escreval ("Digite a primeira nota:")
   leia (nota1)
   escreval ("Digite a segunda nota:")
   leia (nota2)
   escreval ("Digite a terceira nota:")
   leia (nota3)
   soma <- nota1 + nota2 + nota3
   media <- soma/3
   escreval (nome, ", " , "M�dia: ", media)
fimalgoritmo
