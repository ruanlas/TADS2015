algoritmo "semnome"
// Função :
// Autor :
// Data : 26/04/2015
// Seção de Declarações 
var
   num:real
   x:real
   
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
                   escreval(res)
              fimpara
         fimse
         retorne res
   fimfuncao
   
   funcao som_cos (x:real) : real
   var
      res:real
      n: inteiro
   inicio
         n <- 0
         enquanto n <= 20 faca
                  res <- (((-1)^n))/(fat(2*n)))* x^(2*n)
                  n<-n+1
         fimenquanto
         retorne res
   fimfuncao
inicio
// Seção de Comandos 
   //leia (num)
   leia(x)
   escreval (som_cos(x))
fimalgoritmo
