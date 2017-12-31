using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio3_b
{
    class Program
    {
        public static int Paridade(int x)
        {
            return x % 2;
        }
        static void Main(string[] args)
        {
            Program c = new Program();
            int x = 10, y = 10;
            string[,] tabuleiro = new string[8, 8];
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if (Program.Paridade(j)==0 && Program.Paridade(i)!=0 || Program.Paridade(j) != 0 && Program.Paridade(i) == 0)
                    {
                        tabuleiro[i, j] = "Branco";
                    }
                    else
                    {
                        tabuleiro[i, j] = "Preto";
                    }
                }
            }
            /*
            for (int i = 0; i < 8; i++)
            {
                Console.WriteLine();
                for (int j = 0; j < 8; j++)
                {
                    Console.Write("{0} ", tabuleiro[i, j]);
                }
            }*/
            Console.WriteLine();
            Console.WriteLine("Digite as coordenadas do tabuleiro: ");
            Console.WriteLine("(OBS: as coordenadas devem estar entre 1 e 8)");
            Console.Write("Coordenada X: ");
            while (x > 8||x < 0)
            {
                x = int.Parse(Console.ReadLine());
            }
            Console.Write("Coordenada Y: ");
            while (y > 8 || y < 0)
            {
                y = int.Parse(Console.ReadLine());
            }
            Console.WriteLine("A casa do tabuleiro com a coordenada {0},{1} é : {2}", x, y, tabuleiro[(x - 1), (y - 1)]);
                Console.ReadKey();
        }
    }
}
