algoritmo "Quest�o5"
// Fun��o :
// Autor : RUAN LUIZ ALVES DA SILVA
// Data : 16/04/2015
// Se��o de Declara��es 
var
   reais: real
   dolar, cotacao: real
inicio
// Se��o de Comandos
   escreval ("Digite um valor em real R$: ")
   leia (reais)
   escreval ("Digite o valor da cota��o do d�lar R$: ")
   leia (cotacao)
   dolar <- reais / cotacao
   escreval ("O valor R$ ", reais, " � equivalente a U$$ ", dolar:4:3, " d�lares")
   
fimalgoritmo
