algoritmo "Quest�o6"
// Fun��o :
// Autor :
// Data : 15/04/2015
// Se��o de Declara��es
var
   nome: caractere
   
   funcao inversao (nome:caractere):caractere
   var
      resultado: caractere
      qtd, i: inteiro
      caracteres: vetor [1..15] de caractere
   inicio
         qtd <- compr(nome)
         para i de 1 ate qtd faca
              caracteres[i] <- copia(nome,i,1)
         fimpara
         para i de qtd ate 1 passo -1 faca
              resultado <- resultado + caracteres[i]
         fimpara
         retorne resultado
   fimfuncao

inicio
// Se��o de Comandos
   escreval ("Digite uma palavra qualquer com no m�ximo 15 caracteres: ")
   leia (nome)
   escreva (inversao(nome))

fimalgoritmo
