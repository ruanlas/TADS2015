algoritmo "semnome"
// Função :
// Autor :
// Data : 08/04/2015
// Seção de Declarações 
   funcao volume (raio:real):real
   var
      vol: real
   inicio
// O visual G nao reconhece a vírgula "," ele utiliza o ponto "." como vírgula
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
