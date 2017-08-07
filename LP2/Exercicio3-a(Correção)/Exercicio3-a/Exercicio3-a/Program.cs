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
        ArrayList premios = new ArrayList();
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
            string opcao = "s";
            Console.WriteLine("Este cachorro possui algum prêmio?");
            Console.WriteLine("(OBS: S para sim, N para não)");
            while (opcao == "s"||opcao == "S")
            {
                opcao = Console.ReadLine();
                if (opcao == "s" || opcao == "S")
                {
                    Console.Write("Informe o prêmio: ");
                    premios.Add(Console.ReadLine());
                    Console.WriteLine("O Cachorro mais algum prêmio?");
                    Console.WriteLine("(OBS: S para sim, N para não)");
                }
            }
        }
        public void MostrarPremio()
        {
            Console.WriteLine("Prêmio do cachorro {0}: ", nome);
            foreach (string i in premios)
            {
                Console.WriteLine(i);
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
                //Console.WriteLine("Informe quantos eventos o cachorro participou: ");
                //cachorro[i].Tamanho = int.Parse(Console.ReadLine());
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
