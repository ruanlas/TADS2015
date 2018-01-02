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
            Aluno[] aluno = new Aluno[3];
            aluno[0] = new Aluno();
            aluno[1] = new Aluno();
            aluno[2] = new Aluno();
            /* ou:
            Aluno[] aluno; => Declarando Vetor
            aluno = new Aluno[3]; => Alocando Espaço
            
            |-> Criando Vetor

            aluno[0] = new Aluno(); -> Instanciando elementos do Vetor "aluno", da classe "Aluno"
            ...
            */
            for (int i = 0; i < aluno.Length; i++)
            {
                Console.WriteLine("Digite um nome do aluno {0}: ", i + 1);
                aluno[i].LerNome(Console.ReadLine());
                Console.WriteLine("Digite a matricula do aluno {0}: ", i + 1);
                aluno[i].LerMatricula(int.Parse(Console.ReadLine()));
                Console.WriteLine("Digite a nota da P1 do aluno {0}: ", i + 1);
                aluno[i].LerP1(double.Parse(Console.ReadLine()));
                Console.WriteLine("Digite a nota da P2 do aluno {0}: ", i + 1);
                aluno[i].LerP2(double.Parse(Console.ReadLine()));
                Console.WriteLine("Digite a nota do T1 do aluno {0}: ", i + 1);
                aluno[i].LerT1(double.Parse(Console.ReadLine()));
                Console.WriteLine("Digite a nota do T2 do aluno {0}: ", i + 1);
                aluno[i].LerT2(double.Parse(Console.ReadLine()));
            }
            
            // aluno[i] = Objeto da classe Aluno / LerT2 = Método
            Console.WriteLine("Situacao final dos alunos: ");
            for (int i = 0; i < aluno.Length; i++) //Método Length = Retorna o tamanho do vetor
            {
                Console.WriteLine("Aluno {1}: {0}", aluno[i].MostrarNome(), i + 1);
                Console.WriteLine("Prontuario: {0}", aluno[i].MostrarProntuario());
                Console.WriteLine("Media Final: {0}", aluno[i].Media().ToString("0.00"));
                Console.WriteLine("");
            }

            Console.ReadKey();
        }
    }
}
