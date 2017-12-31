using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Exercicio3_a
{
    class Cao
    {
        string nome;
        double peso;
        string[,] premios = new string[2, 10];
        int tamanho = 0;
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
        public double Peso
        {
            get
            {
                return peso;
            }
            set
            {
                peso = value;
            }
        }
        public int Tamanho
        {
            get
            {
                return tamanho;
            }
            set
            {
                tamanho = value;
            }
        }
        public void ArmazenarPremio()
        {
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < tamanho; j++)
                {
                    if (i == 0)
                    {
                        Console.Write("Digite o nome do evento {0} que o cachorro participou: ", j+1);
                        premios[i, j] = Console.ReadLine();
                    }
                    else
                    {
                        Console.Write("Digite o prêmio referente ao evento {0} que o cachorro ganhou: ", j+1);
                        premios[i, j] = Console.ReadLine();
                    }                              
                }
            }
        }
        public void MostrarPremio()
        {
            Console.WriteLine("Prêmio do cachorro {0}: ", nome);
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < tamanho; j++)
                {
                    if (i == 0)
                        Console.Write("{0}: \t", premios[i, j]);
                    else
                        Console.Write("{0} \t", premios[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Cao[] cachorro = new Cao[3];

            for (int i = 0; i < cachorro.Length; i++)
            {
                cachorro[i] = new Cao();
            }
            for (int i = 0; i < cachorro.Length; i++)
            {
                Console.Write("Digite o nome do cachorro {0}: ", i + 1);
                cachorro[i].Nome = Console.ReadLine();
                Console.Write("Digite o peso do cachorro: ");
                cachorro[i].Peso = double.Parse(Console.ReadLine());
                Console.WriteLine("Informe quantos eventos o cachorro participou: ");
                cachorro[i].Tamanho = int.Parse(Console.ReadLine());
                cachorro[i].ArmazenarPremio();
            }
            for (int i = 0; i < cachorro.Length; i++)
            {
                Console.WriteLine("Nome do cachorro {0}: {1}", i + 1, cachorro[i].Nome);
                Console.WriteLine("Peso do cachorro {0}: {1} Kg", i + 1, cachorro[i].Peso.ToString("0.00"));
                Console.WriteLine("Eventos e premiações do cachorro {0}: ", i + 1);
                cachorro[i].MostrarPremio();
                Console.WriteLine();
            }
            
            Console.ReadKey();
        }
    }
}
