algoritmo "Exercício 4"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   idade:inteiro
   
   procedimento categoria (x:inteiro)
   var
      cat: caractere
   inicio
         se x < 5 entao
            cat <- "Sem parâmetros para classificação"
         senao
              se (x >= 5) e (x <= 7) entao
                 cat <- "Infantil I"
              senao
                   se (x >= 8) e (x <= 10) entao
                      cat <- "Infantil II"
                   senao
                        se (x >= 11) e (x <= 13) entao
                           cat <- "Juvenil I"
                        senao
                             se (x >= 14) e (x <= 17) entao
                                cat <- "Juvenil II"
                             senao
                                  se (x >= 18) e (x <= 59) entao
                                     cat <- "Adulto"
                                  senao
                                       cat <- "Master"
                                  fimse
                             fimse
                        fimse
                   fimse
              fimse
         fimse
         escreva (cat)
   fimprocedimento
   
inicio
// Seção de Comandos 
   escreva ("Digite a idade do nadador: ")
   leia (idade)
   categoria(idade)
   
fimalgoritmo
