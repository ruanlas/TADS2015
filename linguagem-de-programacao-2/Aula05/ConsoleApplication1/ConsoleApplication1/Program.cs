using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();
            int[] vetor = new int[100];
            int soma = 0;
            int tam;
            float media;

            Console.Write("De quantos elementos você quer a média? ");
            tam = int.Parse(Console.ReadLine());

            Console.WriteLine("\nPREENCHIMENTO DO VETOR\n");
            for (int i = 0; i < tam; i++)
            {
                vetor[i] = r.Next() %10;
            }
            //SOMA DE TODOS OS ELEMENTOS DO VETOR
            for (int i = 0; i < tam; i++)
            {
                //soma = soma + vetor[i];
                soma += vetor[i];
            }
            Console.WriteLine("Os números gerados foram:");
            for (int i = 0; i < tam; i++)
            {
                Console.WriteLine("Elemento {0}: {1}", i + 1, vetor[i]);
            }
            //A MEDIA É A SOMA DOS ELEMENTOS DIVIDIDA PELO NUMERO DE ELEMENTOS
            media = soma / tam;
            Console.WriteLine("A media dos elementos do vetor é:  {0}", media);
            Console.ReadKey();
        }
    }
}
