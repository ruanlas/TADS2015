algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao primo(n:inteiro):logico
   var
      i:inteiro
      contadorPrimo: inteiro
      numero_primo: logico
   inicio
         contadorPrimo <- 0
         numero_primo <- verdadeiro
         para i de 2 ate n faca
              se n mod i = 0 entao
                 contadorPrimo <-contadorPrimo + 1

              fimse
         fimpara
// o contador inicia a partir do 2, mas todo numero primo � divisivel por 1 tamb�m, ent�o teremos que inclu�-lo
// conforme o comando abaixo "contadorPrimo <- contadorPrimo + 1"
// Se o contador iniciar com o numero 1, nao precisa desse comando
         contadorPrimo <- contadorPrimo + 1
         se contadorPrimo > 2 entao
                 numero_primo <- falso
         fimse
         retorne numero_primo
         fimfuncao
var
   x: inteiro
inicio
      escreva ("Digite um numero qualquer: ")
      leia (x)
      escreval
      escreval ("� primo? ", primo(x))
fimalgoritmo
