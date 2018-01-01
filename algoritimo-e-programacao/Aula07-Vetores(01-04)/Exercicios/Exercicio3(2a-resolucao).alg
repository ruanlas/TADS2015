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
              escreval ("posição no vetor: ", i)
           fimse
      fimpara
      se encontrou entao
      senao
           escreval ("O número não se encontra no vetor")
      fimse

fimalgoritmo
