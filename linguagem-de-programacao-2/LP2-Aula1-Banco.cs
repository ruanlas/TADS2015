using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula_1
{
public class Cliente
{
    private int conta;
    private float saldo;
    private string nome;

    public void depositar(float deposito)
    {
        saldo += deposito;
    }
    public void sacar(float saque)
    {
        saldo -= saque;
    }
    public void exibe_saldo()
    {
        Console.WriteLine("O saldo do cliente {1} é: {0}", saldo, nome);
    }

    public Cliente(float dep_inicial, string nomecliente)
    {
        saldo = dep_inicial;
        nome = nomecliente;
    }

}
    class program
    {
        static void Main(string[] args)
        {
            Cliente c1 = new Cliente(200, "Maria");
            Cliente c2 = new Cliente(300, "Antonio");
            Cliente c3 = new Cliente(400, "Pedro");

            c1.depositar(10);
            c1.exibe_saldo();

            Console.WriteLine();

            c2.depositar(10);
            c2.exibe_saldo();

            Console.WriteLine();

            c3.depositar(10);
            c3.exibe_saldo();

            Console.WriteLine();

            Console.ReadKey();

        }
    }
}
