algoritmo "Questão6"
// Função :
// Autor :
// Data : 15/04/2015
// Seção de Declarações
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
// Seção de Comandos
   escreval ("Digite uma palavra qualquer com no máximo 15 caracteres: ")
   leia (nome)
   escreva (inversao(nome))

fimalgoritmo
