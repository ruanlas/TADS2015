algoritmo "Exercício6"

var

   funcao inverterPalavra (palavra : caractere) : caractere
   var
      i, tam_palavra: inteiro
      vet: vetor [1..50] de caractere
      palavra_inversa: caractere

   inicio
      //obtém o tamanho da palavra
      tam_palavra <- compr(palavra)

      //faz um laço para inverter a palavra
      para i de tam_palavra ate 1 passo -1 faca
         palavra_inversa <-  palavra_inversa + copia(palavra, i, 1)
      fimpara

      retorne palavra_inversa
   fimfuncao

inicio

   escreval(inverterPalavra("teste"))

fimalgoritmo
