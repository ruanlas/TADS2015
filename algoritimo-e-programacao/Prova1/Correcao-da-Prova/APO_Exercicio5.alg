algoritmo "Exerc�cio5"

var
   palindromo: caractere
   i, tam_palindromo: inteiro
   vet: vetor [1..50] de caractere

inicio
   escreva("Digite um pal�ndromo: ")
   leia(palindromo)
   
   //obt�m o tamanho do pal�ndromo
   tam_palindromo <- compr(palindromo)
   
   //faz um la�o para extrair as letras do pal�ndromo e armazenar em um vetor
   para i de 1 ate tam_palindromo faca
      vet[i] <- copia(palindromo, i, 1)
   fimpara

   //escreve o vetor em ordem inversa
   para i de tam_palindromo ate 1 passo -1 faca
      escreval(vet[i])
   fimpara
fimalgoritmo
