using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_02
{
    class Ordem
    {
        bool emordem = false;

        public void/*bool*/ vetorEmOrdem(int[] num)
        {
            for (int i = 0; i < (num.Length - 1); i++)
            {
                if (num[i] <= num[i + 1])
                {
                    emordem = true;
                }
                else
                {
                    emordem = false;
                    break;
                }
            }
            //return emordem;
        }
        public bool MostrarOrdem()
        {
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
            SequenciaVetor.vetorEmOrdem(numeros);
            Console.WriteLine("");
            if (SequenciaVetor.MostrarOrdem() == true)
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
