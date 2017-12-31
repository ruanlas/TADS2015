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
        //declaração do arrayList
        public ArrayList premios = new ArrayList();
        int tamanhoarray = 0;
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
        public int TamArary()// obs: este médoto não funcionou!
        {
            return tamanhoarray = premios.Count;
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
                    //Adição de "elementos" do array
                    premios.Add(Console.ReadLine());
                    Console.WriteLine("O Cachorro mais algum prêmio?");
                    Console.WriteLine("(OBS: S para sim, N para não)");
                }
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
            //declaração do arrayDentado
            string[][] Premios = new string[cachorro.Length][];

            

            for (int i = 0; i < cachorro.Length; i++)
            {
                Console.Write("Digite o nome do cachorro {0}: ", i + 1);
                cachorro[i].Nome = Console.ReadLine();
                Console.Write("Digite o peso do cachorro: ");
                cachorro[i].Peso = double.Parse(Console.ReadLine());
                cachorro[i].ArmazenarPremio();
                Console.Clear();
            }

            for (int i = 0; i < cachorro.Length; i++)
                for (int j = 0; j < cachorro[i].premios.Count; j++)
                {
                    //inicialização e criação do tamanho do array(coluna)
                    //cachorro[i]. => Objeto da classe
                    //premios. => Nome do ArrayList
                    //Count => Informa o tamanho do ArrayList (conta o tamanho do array)
                    Premios[i] = new string[cachorro[i].premios.Count];
                }
            for (int i = 0; i < cachorro.Length; i++)
                for (int j = 0; j < cachorro[i].premios.Count; j++)
                {
                    //(string)cachorro[i].premios[j] => "converte" para string
                    //ele pega o conteúdo do arrayList na posição solicitada
                    //e armazena no arrayDentado criado
                    Premios[i][j] = (string)cachorro[i].premios[j];
                }
            Console.Clear();

            for (int i = 0; i < cachorro.Length; i++)
            {

                Console.WriteLine();
                Console.WriteLine("Nome do cachorro {0}: {1}", i + 1, cachorro[i].Nome);
                Console.WriteLine("Peso do cachorro {0}: {1} Kg", i + 1, cachorro[i].Peso.ToString("0.00"));
                Console.WriteLine("Eventos e premiações do cachorro {0}: ", i + 1);
                // impressão do conteúdo do arrayDentado
                for (int j = 0; j < cachorro[i].premios.Count; j++)
                {
                    Console.Write("{0} ", Premios[i][j]);
                }
                Console.WriteLine();
            }
            
            Console.ReadKey();
        }
    }
}
