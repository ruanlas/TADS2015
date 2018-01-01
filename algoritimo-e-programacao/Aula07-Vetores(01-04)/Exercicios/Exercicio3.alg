algoritmo "semnome"
// Função :
// Autor :
// Data : 01/04/2015
// Seção de Declarações 
var
numero: vetor [1..8] de inteiro
i, n, valor: inteiro
encontrou: logico
inicio
// o comando "interrompa" é usado para sair do laço de repetição. Nesse exemplo, quando ele encontra
// o valor, ele sai imediatamente do laço de repetição e nao termina a verificação. se nao houvesse
// esse comando, ele iria encontrar o valor, mas mesmo assim iria verificar todo o vetor até
// finalizar o laço ** OBS: quando há a presença desse comando, ele 'trava' o contador na posição
// em que o valor foi encontrado
      para i de 1 ate 8 faca
            escreval ("Insira um valor ")
            leia (numero[i])
      fimpara
      escreva ("Digite um número para ser buscado no vetor: ")
      leia (valor)
      encontrou <- falso
      para i de 1 ate 8 faca
           se (numero[i] = valor) entao
              encontrou <- verdadeiro
           interrompa
           fimse
      fimpara
           se encontrou entao
              escreval("Posição do elemento no vetor: ", i )
           senao
                escreval ("O número não se encontra no vetor")
           fimse

fimalgoritmo
