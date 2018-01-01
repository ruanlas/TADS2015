algoritmo "exercício 2"
// Função :
// Autor :
// Data : 25/03/2015
// Seção de Declarações 
var
numero: inteiro
inicio
      escreval ("Digite um Número:")
      leia (numero)
      se (numero > 0) e (numero < 10) entao
         escreval("Um dígito")
         senao
              se (numero > 9) e (numero < 100) entao
                 escreval ("Dois dígitos")
                 senao
                      se (numero > 99) e (numero < 1000) entao
                         escreval ("Três dígitos")
                         senao
                              se (numero > 999) e (numero < 10000) entao
                                 escreval ("Quatro dígitos")
                                 senao
                                 se (numero > 9999) entao
                                    escreval ("Cinco ou mais dígitos")
                                    senao
                                    escreval ("Numero Não avaliado")
                                 fimse
                              fimse
                      fimse
              fimse
      fimse
fimalgoritmo
