algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 05/04/2015
// Se��o de Declara��es 
var
nome, sobrenome: caractere
nome_completo: caractere
inicio
// Para exibir o nome completo podemos criar uma v�ri�vel chamada "nome_completo", onde receber� a jun��o (somat�ria)
// da vari�vel "nome" e "sobrenome" e pedir para o comando "escreva" exibir essa vari�vel, ou,
// podemos usar o comando "escreva" e pedir para ele exibir as duas vari�veis "nome" e "sobrenome" na sequ�ncia
// n�o havendo necessidade de criar mais uma vari�vel para armazenar o nome completo
   escreval ("Digite o seu nome:")
            leia (nome)
   escreval ("Digite seu Sobrenome")
            leia (sobrenome)
   nome_completo <- nome + " " + sobrenome
   escreva (nome_completo)
fimalgoritmo
