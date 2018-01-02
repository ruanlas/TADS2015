using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_2
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] vetor = new int[10] { 2, 67, 87, 0, 95, 2, 3, 4, 2, 55 };
            int soma = 0;
            float media;

            //SOMA DE TODOS OS ELEMENTOS DO VETOR
            for (int i = 0; i < vetor.Length; i++)
            { 
                //soma = soma + vetor[i];
                soma += vetor[i];
            }
            //A MEDIA É A SOMA DOS ELEMENTOS DIVIDIDA PELO NUMERO DE ELEMENTOS
            media = soma / vetor.Length;
            Console.WriteLine("A media dos numeros 2, 67, 87, 0, 95, 2, 3, 4, 2, 55 é:    {0}", media);
            Console.ReadKey();
        }
    }
}
