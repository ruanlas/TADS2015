using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Exercicio_5
{
    class Hospede
    {
        string nome;
        string RG;
        int quarto;
        int horaInicio;
        int dataInicio;
        public Hospede()
        {
            Console.WriteLine("Digite o nome do Hospede: ");
            nome = Console.ReadLine();
            Console.WriteLine("Digite o RG do Hospede: ");
            RG = Console.ReadLine();
            Console.WriteLine("Digite o numero do quarto do Hospede: ");
            quarto = int.Parse(Console.ReadLine());
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            Hospede[] hospede = new Hospede[3];
            for(int i = 0; i < 3; i++)
            {
                hospede[i] = new Hospede();
            }
            Console.ReadKey();
        }
    }
}
