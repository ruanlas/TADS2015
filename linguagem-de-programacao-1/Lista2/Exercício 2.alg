algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
a, b: inteiro
tipocalculo: caractere
inicio
      escreval ("Digite o que você quer calcular: ")
      leia (tipocalculo)
      escreval ("Digite o lado maior do retângulo: ")
      leia (a)
      escreval ("Digite o lado menor do retângulo: ")
      leia (b)
      escolha tipocalculo
              caso "area", "área"
                   escreval ("A área do retângulo é: ", a*b)
              caso "perimetro", "perímetro"
                   escreval ("O perímetro do retângulo é: ", 2*a+2*b)
              outrocaso
                       escreval ("Cálculo não suportado")
      fimescolha
fimalgoritmo
