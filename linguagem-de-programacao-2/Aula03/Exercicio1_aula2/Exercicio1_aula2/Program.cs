using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio1_aula2
{
    class Aluno
    {
        string nome;
        int prontuario;
        double p1;
        double p2;
        double t1;
        double t2;
        double mf;
        public Aluno()
        {
            prontuario = 0;
            p1 = 0;
            p2 = 0;
            t1 = 0;
            t2 = 0;
            mf = 0;
        }
        public void LerNome(string nome)
        {
            this.nome = nome;
        }
        public void LerMatricula(int prontuario)
        {
            this.prontuario = prontuario;
        }
        public void LerP1(double p1)
        {
            this.p1 = 0.7 * p1;
        }
        public void LerP2(double p2)
        {
            this.p2 = 0.7 * p2;
        }
        public void LerT1(double t1)
        {
            this.t1 = 0.3 * t1;
        }
        public void LerT2(double t2)
        {
            this.t2 = 0.3 * t2;
        }
        public double Media()
        {
           return mf = (t1 + t2 + p1 + p2) / 2;
        }
        public string MostrarNome()
        {
            return nome;
        }
        public int MostrarProntuario()
        {
            return prontuario;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno1 = new Aluno();
            Aluno aluno2 = new Aluno();
            Aluno aluno3 = new Aluno();
            Console.WriteLine("Digite um nome do aluno 1: ");
            aluno1.LerNome(Console.ReadLine());
            Console.WriteLine("Digite a matricula do aluno 1: ");
            aluno1.LerMatricula(int.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P1 do aluno 1: ");
            aluno1.LerP1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P2 do aluno 1: ");
            aluno1.LerP2(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T1 do aluno 1: ");
            aluno1.LerT1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T2 do aluno 1: ");
            aluno1.LerT2(double.Parse(Console.ReadLine()));

            Console.WriteLine("Digite um nome do aluno 2: ");
            aluno2.LerNome(Console.ReadLine());
            Console.WriteLine("Digite a matricula do aluno 2: ");
            aluno2.LerMatricula(int.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P1 do aluno 2: ");
            aluno2.LerP1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P2 do aluno 2: ");
            aluno2.LerP2(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T1 do aluno 2: ");
            aluno2.LerT1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T2 do aluno 2: ");
            aluno2.LerT2(double.Parse(Console.ReadLine()));
            
            Console.WriteLine("Digite um nome do aluno 3: ");
            aluno3.LerNome(Console.ReadLine());
            Console.WriteLine("Digite a matricula do aluno 3: ");
            aluno3.LerMatricula(int.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P1 do aluno 3: ");
            aluno3.LerP1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota da P2 do aluno 3: ");
            aluno3.LerP2(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T1 do aluno 3: ");
            aluno3.LerT1(double.Parse(Console.ReadLine()));
            Console.WriteLine("Digite a nota do T2 do aluno 3: ");
            aluno3.LerT2(double.Parse(Console.ReadLine()));
            // aluno3 = Objeto da classe Aluno / LerT2 = Método
            Console.WriteLine("Situacao final dos alunos: ");
            Console.WriteLine("Aluno 1: {0}", aluno1.MostrarNome());
            Console.WriteLine("Prontuario: {0}", aluno1.MostrarProntuario());
            Console.WriteLine("Media Final: {0}", aluno1.Media().ToString("0.00"));
            Console.WriteLine("");
            Console.WriteLine("Aluno 2: {0}", aluno2.MostrarNome());
            Console.WriteLine("Prontuario: {0}", aluno2.MostrarProntuario());
            Console.WriteLine("Media Final: {0:F2}", aluno2.Media()); // {0:F2} => F de "Float" (pode haver outras iniciais de controles para outros tipos de variáveis)
            Console.WriteLine("");
            Console.WriteLine("Aluno 3: {0}", aluno3.MostrarNome());
            Console.WriteLine("Prontuario: {0}", aluno3.MostrarProntuario());
            Console.WriteLine("Media Final: {0}", aluno3.Media());
            Console.WriteLine("");

            Console.ReadKey();
        }
    }
}
