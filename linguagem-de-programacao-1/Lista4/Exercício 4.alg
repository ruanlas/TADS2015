algoritmo "semnome"
// Função :
// Autor :
// Data : 07/04/2015
// Seção de Declarações 
var
carro1, carro2, carro3, carro4, carro5: caractere
preco1, preco2, preco3, preco4, preco5: real
mini1, mini2, mini3, mini4, mini5: real
desconto: real
inicio
// Seção de Comandos
   escreval ("Digite o Nome/Modelo do carro e seus preços máximos e mínimos")
   
   escreva ("Nome/Modelo: ")
   leia (carro1)
   escreva ("Preço: R$ ")
   leia (preco1)
   escreva ("Preço mínimo: R$ ")
   leia (mini1)

   escreval
   
   escreva ("Nome/Modelo: ")
   leia (carro2)
   escreva ("Preço: R$ ")
   leia (preco2)
   escreva ("Preço mínimo: R$ ")
   leia (mini2)
   
   escreval
   
   escreva ("Nome/Modelo: ")
   leia (carro3)
   escreva ("Preço: R$ ")
   leia (preco3)
   escreva ("Preço mínimo: R$ ")
   leia (mini3)
   
   escreval
   
   escreva ("Nome/Modelo: ")
   leia (carro4)
   escreva ("Preço: R$ ")
   leia (preco4)
   escreva ("Preço mínimo: R$ ")
   leia (mini4)
   
   escreval
   
   escreva ("Nome/Modelo: ")
   leia (carro5)
   escreva ("Preço: R$ ")
   leia (preco5)
   escreva ("Preço mínimo: ")
   leia (mini5)
   
   escreval
   
   escreva ("Forneça o desconto: ")
   leia (desconto)

   escreval
   
   se (preco1 - (preco1 * (desconto/100))) > mini1 entao
      escreval (carro1, " ", "Valor Final: R$ ",(preco1 - (preco1 * (desconto/100))))
   senao
        escreval (carro1, " ", "Valor Final: R$ ", mini1)
   fimse
   
   se (preco2 - (preco2 * (desconto/100))) > mini2 entao
      escreval (carro2, " ", "Valor Final: R$ ",(preco2 - (preco2 * (desconto/100))))
   senao
        escreval (carro2, " ", "Valor Final: R$ ",mini2)
   fimse

   se (preco3 - (preco3 * (desconto/100))) > mini3 entao
      escreval (carro3, " ", "Valor Final: R$ ",(preco3 - (preco3 * (desconto/100))))
   senao
        escreval (carro3, " ", "Valor Final: R$ ",mini3)
   fimse
   
   se (preco4 - (preco4 * (desconto/100))) > mini4 entao
      escreval (carro4, " ", "Valor Final: R$ ",(preco4 - (preco4 * (desconto/100))))
   senao
        escreval(carro4, " ", "Valor Final: R$ ",mini4)
   fimse
   
   se (preco5 - (preco5 * (desconto/100))) > mini5 entao
      escreval (carro5, " ", "Valor Final: R$ ",(preco5 - (preco5 * (desconto/100))))
   senao
        escreval (carro5, " ", "Valor Final: R$ ",mini5)
   fimse
fimalgoritmo
