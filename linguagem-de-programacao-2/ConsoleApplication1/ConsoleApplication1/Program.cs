using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace ConsoleApplication1
{
    class Aluno
    {
        string nome;
        string rg;
        int idade;

        public string Nome
        {
            get
            {
                return nome;
            }
            set
            {
                nome = value;
            }
        }
        public string RG
        {
            get
            {
                return rg;
            }
            set
            {
                rg = value;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            List<Aluno> alu = new List<Aluno>();
            Aluno aluno1 = new Aluno();
            alu.Add(aluno1);
            alu[0].Nome = "fabiodd";
            alu.Add(aluno1);
            alu[1].Nome = "jonatas";
           // alu[2].Nome = "antoni";
            Console.WriteLine(alu[0].Nome);
           // Console.WriteLine(alu[1].Nome);
            //Console.WriteLine(alu[2].Nome);
            Console.ReadKey();
        }
    }
}
