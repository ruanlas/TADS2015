algoritmo "Exercício 5"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   num:real
   x:inteiro
   
   funcao fat(x:inteiro):inteiro
   var
      resp, i:inteiro
   inicio
         se (x = 1) ou (x = 0) entao
            resp <- 1
         senao
              para i de x ate 2 passo -1 faca
                   se x = i entao
                      resp <- i* (i - 1)
                   senao
                        resp <- resp * (i-1)
                   fimse
              fimpara
         fimse
         retorne res
   fimfuncao
   
   funcao somatoria (x:inteiro) : real
   var
      res:real
      som:real
      divi:real
      i: inteiro
   inicio
        para i de 0 ate 19 faca
             divi <- (-1)^i/fat(2*i)
             res <- divi * x^2*i
             som <- som + res
        fimpara
         retorne som
   fimfuncao
inicio
// Seção de Comandos 
   //leia (num)
   leia(x)
   num <- somatoria(x)
   escreva(num)
   escreva (cos(x))
fimalgoritmo
