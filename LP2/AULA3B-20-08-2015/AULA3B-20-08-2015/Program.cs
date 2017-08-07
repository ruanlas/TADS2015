using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula3
{
    class Aluno
    {
        private string nome;
        private int prontuario;
        private double p1;
        private double p2;
        private double t1;
        private double t2;
        private double mf;

        public void calcula_media()
        {
            mf = (0.7 * ((p1 + p2) / 2.0)) + (0.3 * ((t1 + t2) / 2.0));
        }

        public void exibe_notas()
        {
            Console.WriteLine("--------------------------------------------------");
            Console.WriteLine("Aluno: {0} - Matrícula: {1}", nome, prontuario);
            Console.WriteLine("--------------------------------------------------");
            Console.WriteLine("A nota P1 é: {0}", p1.ToString("0.00"));
            Console.WriteLine("A nota P2 é: {0}", p2.ToString("0.00"));
            Console.WriteLine("A nota T1 é: {0}", t1.ToString("0.00"));
            Console.WriteLine("A nota T2 é: {0}", t2.ToString("0.00"));
            Console.WriteLine("--------------------------------------------------");
            Console.WriteLine("A média é: {0}", mf.ToString("0.00"));

        }


        public void le_dados()
        {
            Console.WriteLine("Informe nome do aluno: ");
            nome = Console.ReadLine();

            Console.WriteLine("Informe prontuario: ");
            prontuario = int.Parse(Console.ReadLine());

            Console.WriteLine("Informe a nota p1: ");
            p1 = double.Parse(Console.ReadLine());

            Console.WriteLine("Informe a nota p2: ");
            p2 = double.Parse(Console.ReadLine());

            Console.WriteLine("Informe a nota t1: ");
            t1 = double.Parse(Console.ReadLine());

            Console.WriteLine("Informe a nota t2: ");
            t2 = double.Parse(Console.ReadLine());
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno1 = new Aluno();
            Aluno aluno2 = new Aluno();
            Aluno aluno3 = new Aluno();

            aluno1.le_dados();
            aluno2.le_dados();
            aluno3.le_dados();

            aluno1.calcula_media();
            aluno1.exibe_notas();
            aluno2.calcula_media();
            aluno2.exibe_notas();
            aluno3.calcula_media();
            aluno3.exibe_notas();

            Console.ReadLine();
        }
    }
}


