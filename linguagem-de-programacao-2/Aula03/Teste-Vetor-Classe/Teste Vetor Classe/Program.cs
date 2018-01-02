using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{

    class Aluno
    {
        public string nome;
        public double prontuario;
        public double p1, p2, t1, t2;


    }


    class Program
    {



        static void Main(string[] args)
        {
            int i = 0;

            Aluno[] aluno = new Aluno[3];

            for (i = 0; i < 3; i++)
            {
                aluno[i] = new Aluno();
            }


            for (i = 0; i < 3; i++)
            {
                Console.WriteLine("Entre com o nome do aluno {0}", i + 1);
                aluno[i].nome = Console.ReadLine();
                Console.WriteLine("Entre com o prontuário do aluno {0}", i + 1);
                aluno[i].prontuario = double.Parse(Console.ReadLine());
                Console.WriteLine("Entre com a nota da prova 1 do aluno {0}", i + 1);
                aluno[i].p1 = double.Parse(Console.ReadLine());
                Console.WriteLine("Entre com a nota da prova 2 do aluno {0}", i + 1);
                aluno[i].p2 = double.Parse(Console.ReadLine());
                Console.WriteLine("Entre com a nota t1 do aluno {0}", i + 1);
                aluno[i].t1 = double.Parse(Console.ReadLine());
                Console.WriteLine("Entre com a nota t2 do aluno {0}", i + 1);
                aluno[i].t2 = double.Parse(Console.ReadLine());

            }

        }
    }
}