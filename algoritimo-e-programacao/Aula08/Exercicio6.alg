algoritmo "semnome"
// Função :
// Autor :
// Data : 13/04/2015
// Seção de Declarações 
var
   d,m,a: inteiro

   funcao idade (d,m,a:inteiro):inteiro
   var
      diasmes: inteiro
      diasano:inteiro
      diastotais:inteiro
   inicio
         escolha m
         caso 1, 3, 5, 7, 8, 10, 12
              diasmes <- 31-d
              diasano <- ((12-m)* 30) + diasmes
              diastotais <- (( 2015-a)*365) + diasano
         caso 4, 6, 9, 11
              diasmes <- 30-d
              diasano <- ((12-m)* 30) + dias mes
              diastotais <- (( 2015-a)*365) + diasano
         caso 2
              diasmes <- 28-d
              diasano <- ((12-m)* 30) + dias mes
              diastotais <- (( 2015-a)*365) + diasano
         outrocaso
                  escreval ("Mês nao existente")
         fimescolha
         retorne diastotais
   fimfuncao
inicio
      escreva ("Digite o dia do seu nascimento: ")
      leia (d)
      escreval
      escreva ("Digite o Mês do seu nascimento: ")
      leia (m)
      escreval
      escreva ("Digite o ano completo do seu nascimento: ")
      leia (a)
      escreval ("Quantidade de dias após o nascimento: ")
      escreval (idade(d,m,a), " dias aproximadamente")
fimalgoritmo
