algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 29/03/2015
// Se��o de Declara��es 
var
nome: caractere
sobrenome: caractere
idade: inteiro
inicio
// Se��o de Comandos
   escreval ("Insira seu primeiro nome:")
   leia (nome)
   escreval ("Insira seu sobrenome:")
   leia (sobrenome)
   escreval ("Coloque sua idade:")
   leia (idade)
   se idade >30 entao
   //o uso do " " atribiu o espa�o na string.
   // o uso do espa�o antes da palavra tamb�m atribui o espa�o
      escreval (nome + " " + sobrenome," ", "voc� � velho(a)")
   senao
   escreval(nome + " "+ sobrenome," Voc� � novo(a)")
   fimse
fimalgoritmo
