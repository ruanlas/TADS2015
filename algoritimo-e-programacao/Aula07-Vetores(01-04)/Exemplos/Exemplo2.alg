algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
// Exemplo 2
numeros: vetor [1..10] de inteiro
i: inteiro
inicio
// o comando "passo" é um padrão que criamos para iniciar a contagem de acordo com uma regra pré estabelecida
// Geralmente, por padrão a contagem é feita de um em um, mesmo nao tendo o comando (passo 1)
// mas podemos fazer a contagem de dois em dois, três em três ("passo 2"); ("passo 3"), ou também
// iniciar a contagem inversa ("passo -1"); ("passo -2")
      para i de 1 ate 10 faca
           escreva ("Digite um número ")
           leia (numeros[i])
      fimpara
      escreva ("Números na ordem inversa: ")
      para i de 10 ate 1 passo -1 faca
           escreva (numeros [i])
      fimpara
fimalgoritmo
