algoritmo "semnome"
// Função :
// Autor :
// Data : 05/04/2015
// Seção de Declarações 
var
nome, sobrenome: caractere
nome_completo: caractere
inicio
// Para exibir o nome completo podemos criar uma váriável chamada "nome_completo", onde receberá a junção (somatória)
// da variável "nome" e "sobrenome" e pedir para o comando "escreva" exibir essa variável, ou,
// podemos usar o comando "escreva" e pedir para ele exibir as duas variáveis "nome" e "sobrenome" na sequência
// não havendo necessidade de criar mais uma variável para armazenar o nome completo
   escreval ("Digite o seu nome:")
            leia (nome)
   escreval ("Digite seu Sobrenome")
            leia (sobrenome)
   nome_completo <- nome + " " + sobrenome
   escreva (nome_completo)
fimalgoritmo
