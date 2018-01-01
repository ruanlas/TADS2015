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
   // copia(palindromo, i, 1) o número 1 significa o conjunto de letras que vc quer copiar. se vc coloca 1,
   // ele irá armazenar de 1 em 1 letra em cada posição do vetor, se vc colocasse 2, ele irá armazenar de 2 em 2 letras
   // em cada posição do vetor.
      caracteres[i] <- copia(palindromo,i,1)
   fimpara
   para i de qtd ate 1 passo -1 faca
        escreva (caracteres[i])
   fimpara

fimalgoritmo
