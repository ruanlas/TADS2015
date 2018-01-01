algoritmo "Questão3"
// Função :
// Autor : RUAN LUIZ ALVES DA SILVA
// Data : 16/04/2015
// Seção de Declarações 
var
   item: caractere
inicio
// Seção de Comandos
   escreval ("Digite um ietm para ser analisado por categoria pelo sistema: ")
   leia (item)
        escolha item
                caso "melao", "melão", "laranja", "melancia", "caqui", "pera", "pêra"
                     escreval ("Fruta")
                caso "abóbora", "abobora", "alho", "alpo", "pepino", "brócolis", "brocolis"
                     escreval ("Legume")
                caso "alface", "acelga", "couve", "almeirao", "almeirão", "rucula", "rúcula"
                     escreval ("Verdura")
                outrocaso
                         escreval ("Não Identificado")
        fimescolha
fimalgoritmo
