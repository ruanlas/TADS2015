using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exemplo
{
    class Program
    {
        static void Main(string[] args)
        {
            string nome = "Adalberto Nobre Garcia";
            string comparação;
            comparação = Console.ReadLine();
            //Contains() = pesquisa por trechos da string
            if (nome.ToUpper().Contains(comparação.ToUpper()))
            {
                Console.WriteLine("Encontrou");
            }
            else
            {
                Console.WriteLine("Não encontrou");
            }

            Console.ReadKey();
        }
    }
}
