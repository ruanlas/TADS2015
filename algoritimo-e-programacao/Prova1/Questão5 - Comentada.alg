algoritmo "Quest�o5"
// Fun��o :
// Autor :
// Data : 15/04/2015
// Se��o de Declara��es 
var
   palindromo: caractere
   caracteres: vetor [1..10] de caractere
   qtd, i: inteiro
inicio
// Se��o de Comandos
   escreval ("Digite um pal�ndromo qualquer com no m�ximo 10 caracteres: ")
   leia (palindromo)
   qtd <- compr(palindromo)
   para i de 1 ate qtd faca
   // copia(palindromo, i, 1) o n�mero 1 significa o conjunto de letras que vc quer copiar. se vc coloca 1,
   // ele ir� armazenar de 1 em 1 letra em cada posi��o do vetor, se vc colocasse 2, ele ir� armazenar de 2 em 2 letras
   // em cada posi��o do vetor.
      caracteres[i] <- copia(palindromo,i,1)
   fimpara
   para i de qtd ate 1 passo -1 faca
        escreva (caracteres[i])
   fimpara

fimalgoritmo
