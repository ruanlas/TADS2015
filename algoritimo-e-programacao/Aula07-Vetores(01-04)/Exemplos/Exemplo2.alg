algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
// Exemplo 2
numeros: vetor [1..10] de inteiro
i: inteiro
inicio
// o comando "passo" � um padr�o que criamos para iniciar a contagem de acordo com uma regra pr� estabelecida
// Geralmente, por padr�o a contagem � feita de um em um, mesmo nao tendo o comando (passo 1)
// mas podemos fazer a contagem de dois em dois, tr�s em tr�s ("passo 2"); ("passo 3"), ou tamb�m
// iniciar a contagem inversa ("passo -1"); ("passo -2")
      para i de 1 ate 10 faca
           escreva ("Digite um n�mero ")
           leia (numeros[i])
      fimpara
      escreva ("N�meros na ordem inversa: ")
      para i de 10 ate 1 passo -1 faca
           escreva (numeros [i])
      fimpara
fimalgoritmo
