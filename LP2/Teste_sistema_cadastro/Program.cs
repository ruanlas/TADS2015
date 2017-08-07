using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Teste_sistema_cadastro
{
    class Cliente
    {
        string nomeCliente;
        string sexoCliente;
        string numeroConta;
        double saldoConta;
        public Cliente()
        {
            //nomeCliente = "";
            saldoConta = 0;
        }

        public string NomeCliente
        {
            get
            {
                return nomeCliente;
            }
            set
            {
                nomeCliente = value;
            }
        }
        public string SexoCliente
        {
            get
            {
                return sexoCliente;
            }
            set
            {
                sexoCliente = value;
            }
        }
        public string NumeroConta
        {
            get
            {
                return numeroConta;
            }
            set
            {
                numeroConta = value;
            }
        }
        public double Saque(double saque)
        {
            return saldoConta = saldoConta - saque;
        }
        public double Deposito(double deposito)
        {
            return saldoConta = saldoConta + deposito;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList cliente = new ArrayList();

            
            int op = 9;
            while (op != 0)
            {
                Console.WriteLine("Deseja cadastrar um cliente?");
                Console.WriteLine("Digite 1 para sim e 0 para não");
                op = int.Parse(Console.ReadLine());
                if(op == 1)
                {
                    cliente.Add(new Cliente());
                    Console.WriteLine("Instância criada com sucesso!");
                }
                foreach (Cliente cli in cliente)
                {
                    if (cli.NomeCliente == null)
                    {
                        Console.WriteLine("Digite o nome do cliente: ");
                        cli.NomeCliente = Console.ReadLine();
                        Console.WriteLine("Digite o sexo do cliente: ");
                        cli.SexoCliente = Console.ReadLine();
                    }
                }
                
            }
            Console.WriteLine("Imprimir? ");
            Console.WriteLine("1-Sim");
            int x = int.Parse(Console.ReadLine());
            if (x == 1)
            {
                foreach(Cliente cli in cliente)
                {
                    Console.WriteLine(cli.NomeCliente);
                    Console.WriteLine(cli.SexoCliente);
                    Console.WriteLine();
                }
            }

            /*
            cliente.Add(new Cliente());
            cliente.Add(new Cliente());
            cliente.Add(new Cliente());
            for (int i = 0;i < cliente.Count;i++)
            {
                Console.WriteLine(cliente[i]);
            }*/
            Console.ReadKey();
        }
    }
}
