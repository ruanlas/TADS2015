algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/04/2015
// Se��o de Declara��es 
   funcao volume (raio:real):real
   var
      vol: real
   inicio
// O visual G nao reconhece a v�rgula "," ele utiliza o ponto "." como v�rgula
      vol<- 4/3*pi*raio^3
      retorne vol
   fimfuncao
var
   r:real
inicio
      escreva ("Digite o raio da esfera: ")
      leia (r)
      escreva (volume (r):8:6)
fimalgoritmo
