using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_02
{
    class Ordem // => Classe que verifica se os numeros do vetor estão em sequencia
    {
        bool emordem = false; // => Caso os vetores estejam em sequencia, a variável se torna true
        
        public bool vetorEmOrdem(int[] num) // => Método que faz a checagem se os numeros do vetor estão em sequencia e retorna
        {                                 // a variável bool "emordem" = true (se os numeros estiverem em sequencia) e 
            for (int i = 0; i < (num.Length - 1); i++) // ou retorna a variável bool "emordem" = false (se nao estiverem em sequencia)
            {
                if (num[i]<= num[i + 1])
                {
                    emordem = true;
                }
                else
                {
                    emordem = false;
                    break;
                }
            }
            return emordem;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Ordem SequenciaVetor = new Ordem();
            int[] numeros = new int[10];
            for (int i = 0; i < numeros.Length; i++)
            {
                Console.WriteLine("Digite um valor para ocupar a posição {0} do vetor", i + 1);
                numeros[i] = int.Parse(Console.ReadLine());
            }
            /*for (int i = 0; i <(numeros.Length -1); i++)
             {
                 if (numeros[i] <= numeros[i + 1])
                 {
                     ordem = true;
                 }
                 else
                 {
                     ordem = false;
                     break;
                 }
             }*/
            Console.WriteLine("");
            if ( SequenciaVetor.vetorEmOrdem(numeros) == true)
            {
                Console.WriteLine("O vetor está em sequencia");
            }
            else
            {
                Console.WriteLine("O vetor não esta na sequencia");
            }
            Console.ReadKey();
        }
    }
}
