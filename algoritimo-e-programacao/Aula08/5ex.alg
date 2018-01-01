algoritmo "semnome"
// Função :
// Autor :
// Data : 10/04/2015
// Seção de Declarações 
   funcao numero_primo (a:inteiro):logico
   var
      i:inteiro
      primo: logico
   inicio
         para i de 1 ate a faca
              se a = 1 entao
                 primo <- falso
              senao
                   se a=2 entao
                      primo <- verdadeiro
                   senao
                        se a mod i = 0 entao
                           primo <- falso
                        senao
                             primo <- verdadeiro
                        fimse
                   fimse
              fimse
         fimpara
         retorne primo
   fimfuncao
var
   numero: inteiro
inicio
      leia (numero)
      escreval ("O numero " , numero, " é primo?", numero_primo(numero))
fimalgoritmo
