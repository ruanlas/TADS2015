algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 13/04/2015
// Se��o de Declara��es 
var
  alt:real
  sexo: caractere
   funcao pesoidealmasc (altura:real):real
   var
      pesoideal: real
   inicio
         pesoideal <- 72.7*altura-58
         retorne pesoideal
   fimfuncao
   
   funcao pesoidealfem (altura:real):real
   var
      pesoideal: real
   inicio
         pesoideal <- 62.1*altura-44.7
         retorne pesoideal
   fimfuncao
   
inicio
      escreva ("Informe sua altura: ")
      leia (alt)
      escreva ("Informe seu sexo, sendo (m) masculino, (f) feminino: ")
      leia (sexo)
      se sexo = "m" entao
         escreval ("O seu peso ideal �: ", pesoidealmasc(alt))
      senao
           se sexo = "f" entao
              escreval ("O seu peso ideal �: ", pesoidealfem(alt))
           senao
                escreval ("Sexo n�o encontrado")
           fimse
      fimse
fimalgoritmo
