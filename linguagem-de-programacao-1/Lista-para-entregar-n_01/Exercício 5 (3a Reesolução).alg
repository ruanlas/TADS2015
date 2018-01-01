algoritmo "Exercício 5"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   num:real
   a:real
   
   funcao fat(x:inteiro):inteiro
   var
      res, i:inteiro
   inicio
         se (x = 1) ou (x = 0) entao
            res <- 1
         senao
              para i de x ate 2 passo -1 faca
                   se x = i entao
                      res <- i* (i - 1)
                   senao
                        res <- res * (i-1)
                   fimse
              fimpara
         fimse
         retorne res
   fimfuncao
   
   funcao somatoria(y:real) : real
   var
      resp, som:real
      n: inteiro
   inicio
         para n de 0 ate 19 faca
              resp <- (((-1)^n))/(fat(2*n)))* y^(2*n)
              som <- som + resp
         fimpara
         retorne res
   fimfuncao
inicio
// Seção de Comandos 
   //leia (num)
   leia(a)
   num <- somatoria(a)
   escreval (num)
   escreval (cos(a))
fimalgoritmo
