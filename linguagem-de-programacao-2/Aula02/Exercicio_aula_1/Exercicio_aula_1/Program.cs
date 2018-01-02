using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercício_aula_1
{
    class Cliente
    {
        int conta; // = private int conta;
        float saldo;
        string nome;

        public Cliente()//construtor => inicializador
        {
            saldo = 0;
        }
        //outro exemplo de construtor: (neste caso ele inicia com um valor aleatório)
        /*
        public Cliente(float deposito_inicial)
        {
            saldo = deposito_inicial;
        }
        */
        //outro exemplo de construtor: (neste caso ele inicia com um valor aleatório e um nome do cliente)
        /*
        public Cliente(float deposito_inicial, string nome_cliente)
        {
            saldo = deposito_inicial;
            nome = nome_cliente;
        }
        */

        public void depositar(float valor)//metodos
        {
            saldo = saldo + valor; // saldo += valor;
        }
        public void sacar(float valor)
        {
            saldo = saldo - valor; // saldo -= valor;
        }
        public float MostrarSaldo()
        {
            return saldo;
        }
        // outra opção para mostrar o saldo:
        /*
        public void exibe_saldo()
        {
            Console.WriteLine(saldo);
        }
        */
        // OU:
        /*
        public void exibe_saldo()
        {
            Console.WriteLine("O saldo do cliente {1} é: R$ {0}", saldo, nome);
            //Console.WriteLine("O saldo do cliente "+ saldo);
            //Console.WriteLine("O saldo do cliente " + nome " é R$ " + saldo);
        }
        */
    }
    class Program
    {
        static void Main(string[] args)
        {
            float valorsaque = 0;
            float valordeposito = 0;
            Cliente cliente1 = new Cliente();  // instanciação=criação de objeto do tipo Cliente com o nome cliente1
            Console.WriteLine("Digite um valor para deposito: ");
            valordeposito = float.Parse(Console.ReadLine());
            cliente1.depositar(valordeposito);
            Console.WriteLine("Digite um valor para saque: ");
            valorsaque = float.Parse(Console.ReadLine());
            cliente1.sacar(valorsaque);
            Console.WriteLine("Saldo em Conta = R${0}", cliente1.MostrarSaldo());
            Console.ReadKey();
        }
    }
}