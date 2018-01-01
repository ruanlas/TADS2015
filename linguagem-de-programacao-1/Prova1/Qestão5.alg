algoritmo "Questão5"
// Função :
// Autor : RUAN LUIZ ALVES DA SILVA
// Data : 16/04/2015
// Seção de Declarações 
var
   reais: real
   dolar, cotacao: real
inicio
// Seção de Comandos
   escreval ("Digite um valor em real R$: ")
   leia (reais)
   escreval ("Digite o valor da cotação do dólar R$: ")
   leia (cotacao)
   dolar <- reais / cotacao
   escreval ("O valor R$ ", reais, " é equivalente a U$$ ", dolar:4:3, " dólares")
   
fimalgoritmo
