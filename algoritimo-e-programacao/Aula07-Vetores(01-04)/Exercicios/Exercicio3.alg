algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 01/04/2015
// Se��o de Declara��es 
var
numero: vetor [1..8] de inteiro
i, n, valor: inteiro
encontrou: logico
inicio
// o comando "interrompa" � usado para sair do la�o de repeti��o. Nesse exemplo, quando ele encontra
// o valor, ele sai imediatamente do la�o de repeti��o e nao termina a verifica��o. se nao houvesse
// esse comando, ele iria encontrar o valor, mas mesmo assim iria verificar todo o vetor at�
// finalizar o la�o ** OBS: quando h� a presen�a desse comando, ele 'trava' o contador na posi��o
// em que o valor foi encontrado
      para i de 1 ate 8 faca
            escreval ("Insira um valor ")
            leia (numero[i])
      fimpara
      escreva ("Digite um n�mero para ser buscado no vetor: ")
      leia (valor)
      encontrou <- falso
      para i de 1 ate 8 faca
           se (numero[i] = valor) entao
              encontrou <- verdadeiro
           interrompa
           fimse
      fimpara
           se encontrou entao
              escreval("Posi��o do elemento no vetor: ", i )
           senao
                escreval ("O n�mero n�o se encontra no vetor")
           fimse

fimalgoritmo
