algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao primo(n:inteiro):logico
   var
      i, divisiveis:inteiro
      numero_primo: logico
   inicio
         divisiveis <- 0
         para i de 1 ate n faca
              se n mod i = 0 entao
                 divisiveis <- divisiveis + 1
              fimse
         fimpara
         numero_primo <- verdadeiro
         se divisiveis > 2 entao
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
