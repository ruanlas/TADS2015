algoritmo "semnome"
// Função :
// Autor :
// Data : 13/04/2015
// Seção de Declarações 
var
   base, expoente, i, potencia: inteiro
inicio
      escreval ("Potenciação de números inteiros")
      escreval ("Informe a base: ")
      leia (base)
      escreval ("Informe o expoente: ")
      leia (expoente)
      potencia <- 1
      para i de 1 ate expoente faca
           potencia <- potencia*base
      fimpara
      escreval ("O resultado da potenciação é: ", potencia)
      
fimalgoritmo
