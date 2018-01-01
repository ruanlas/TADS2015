algoritmo "Exercício5"

var
   palindromo: caractere
   i, tam_palindromo: inteiro
   vet: vetor [1..50] de caractere

inicio
   escreva("Digite um palíndromo: ")
   leia(palindromo)
   
   //obtém o tamanho do palíndromo
   tam_palindromo <- compr(palindromo)
   
   //faz um laço para extrair as letras do palíndromo e armazenar em um vetor
   para i de 1 ate tam_palindromo faca
      vet[i] <- copia(palindromo, i, 1)
   fimpara

   //escreve o vetor em ordem inversa
   para i de tam_palindromo ate 1 passo -1 faca
      escreval(vet[i])
   fimpara
fimalgoritmo
