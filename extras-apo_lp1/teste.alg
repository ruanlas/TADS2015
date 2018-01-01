algoritmo "semnome"
// Função :
// Autor :
// Data : 29/03/2015
// Seção de Declarações 
var
nome: caractere
sobrenome: caractere
idade: inteiro
inicio
// Seção de Comandos
   escreval ("Insira seu primeiro nome:")
   leia (nome)
   escreval ("Insira seu sobrenome:")
   leia (sobrenome)
   escreval ("Coloque sua idade:")
   leia (idade)
   se idade >30 entao
   //o uso do " " atribiu o espaço na string.
   // o uso do espaço antes da palavra também atribui o espaço
      escreval (nome + " " + sobrenome," ", "você é velho(a)")
   senao
   escreval(nome + " "+ sobrenome," Você é novo(a)")
   fimse
fimalgoritmo
