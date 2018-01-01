using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_3
{
    class Verificação
    {
        static bool divisivel = false;
        static bool par = false;
        static public bool ChecaDivisivel(int x, int y)
        {
            if (x % y == 0)
            {
                divisivel = true;
            }
            return divisivel;
        }
        static public bool ChecaPar(int x)
        {
            if (x % 2 == 0)
            {
                par = true;
            }
            return par;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Exercício 1\n");
            Console.Write("Digite um número inteiro qualquer: ");
            int x = int.Parse(Console.ReadLine());
            Console.Write("Digite outro número para verificar se {0} é divisível por ele: ", x);
            int y = int.Parse(Console.ReadLine());
            Console.WriteLine();
            if (Verificação.ChecaDivisivel(x, y))
            {
                Console.WriteLine("O número {0} é divisível por {1}", x, y);
            }
            else
            {
                Console.WriteLine("O número {0} não é divisível por {1}", x, y);
            }
            Console.WriteLine();
            Console.Write("Digite um número inteiro para verificar se ele é par: ");
            int j = int.Parse(Console.ReadLine());
            if (Verificação.ChecaPar(j))
            {
                Console.WriteLine("O número {0} é par", j);
            }
            else
            {
                Console.WriteLine("O número {0} não é par", j);
            }
            Console.ReadKey();
        }
    }
}
