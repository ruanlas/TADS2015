using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Matriz
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] matriz = new int[2, 3];

            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 3; j++)
                {
                    Console.Write("matriz[{0},{1}] = ", i, j);
                    matriz[i, j] = int.Parse(Console.ReadLine());
                }

            for (int i = 0; i < 2; i++)
            {
                Console.WriteLine(); //Quebra de linha
                for (int j = 0; j < 3; j++)
                {
                    Console.Write("{0} ", matriz[i, j]);
                }
            }
            Console.ReadKey();
        }
    }
}
