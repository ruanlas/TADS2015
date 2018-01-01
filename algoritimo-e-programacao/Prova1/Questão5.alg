algoritmo "Questão5"
// Função :
// Autor :
// Data : 15/04/2015
// Seção de Declarações 
var
   palindromo: caractere
   caracteres: vetor [1..10] de caractere
   qtd, i: inteiro
inicio
// Seção de Comandos
   escreval ("Digite um palíndromo qualquer com no máximo 10 caracteres: ")
   leia (palindromo)
   qtd <- compr(palindromo)
   para i de 1 ate qtd faca
      caracteres[i] <- copia(palindromo,i,1)
   fimpara
   para i de qtd ate 1 passo -1 faca
        escreva (caracteres[i])
   fimpara

fimalgoritmo
