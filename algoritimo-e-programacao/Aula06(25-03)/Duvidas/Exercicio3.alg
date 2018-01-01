algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
nome: caractere
nota1, nota2, nota3: inteiro
media: real
inicio
// Seção de Comandos
   escreval ("Digite o nome do aluno:")
   leia (nome)
   escreval ("Digite a primeira nota:")
   leia (nota1)
   escreval ("Digite a segunda nota:")
   leia (nota2)
   escreval ("Digite a terceira nota:")
   leia (nota3)
   media <- (nota1 + nota2 + nota3)/3
   escreval (nome, ", Média: ", media)
fimalgoritmo
