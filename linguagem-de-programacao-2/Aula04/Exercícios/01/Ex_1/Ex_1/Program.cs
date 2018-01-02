using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_1
{
    class Program
    {
        static void Main(string[] args)
        {
            float[] numero = new float[10];
            float soma = 0;
            float media = 0;
            for (int i = 0; i < numero.Length; i++)
            {
                Console.WriteLine("Digite um valor para a posição {0} do vetor: ", i + 1);
                numero[i] = float.Parse(Console.ReadLine());
            }
            for (int i = 0; i < numero.Length; i++)
            {
                soma = soma + numero[i]; // igual a =>>> soma += numero[i];
            }
            media = soma / numero.Length;
            Console.WriteLine("");
            Console.WriteLine("A média dos numeros digitados é {0}",media.ToString("0.00")); //=>>> Variavel.ToString("0.00") 
            Console.ReadKey();                                                         //|||>>>>  Formata a saída do numero, convertendo
                                                                    // para string e mostrando no formato "0.00" na tela
        }
    }
}
