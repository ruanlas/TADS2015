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
            int[] vetor = new int[100];
            int soma = 0;
            int tam;
            float media;

            Console.Write("De quantos elementos você quer a média? ");
            tam = int.Parse(Console.ReadLine());

            Console.WriteLine("\nPREENCHIMENTO DO VETOR\n");
            for (int i = 0; i < tam; i++)
            {
                Console.Write("Digite o elemento da posição {0}: ", i + 1);
                vetor[i] = int.Parse(Console.ReadLine());
            }
            //SOMA DE TODOS OS ELEMENTOS DO VETOR
            for (int i = 0; i < tam; i++)
            {
                //soma = soma + vetor[i];
                soma += vetor[i];
            }
            //A MEDIA É A SOMA DOS ELEMENTOS DIVIDIDA PELO NUMERO DE ELEMENTOS
            media = soma / tam;
            Console.WriteLine("A media dos elementos do vetor é:  {0}", media);
            Console.ReadKey();
        }
    }
}
