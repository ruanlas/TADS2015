using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio2_aula_1
{
    class Cliente
    {
        string conta;
        float saldo;
        string nome;

        public Cliente()
        {
            saldo = 0;
        }

        public void deposito(float valordeposito)
        {
            saldo = saldo + valordeposito;
        }
        public void saque(float valorsaque)
        {
            saldo = saldo - valorsaque;
        }
        public float MostrarSaldo()
        {
            return saldo;
        }
        public void lerNome(string usuario)
        {
            nome = usuario;
        }
        public void lerconta(string contausuario)
        {
            conta = contausuario;
        }
        public string mostrarNome()
        {
            return nome;
        }
        public string MostrarConta()
        {
            return conta;
        }

        class Program
        {
            static void Main(string[] args)
            {
                Cliente maria = new Cliente();
                Cliente antonio = new Cliente();
                Cliente pedro = new Cliente();
                //Conta de maria
                maria.lerNome("Maria");
                maria.deposito(10);
                //Conta de antonio
                antonio.lerNome("Antonio");
                antonio.deposito(10);
                //Conta de Pedro
                pedro.lerNome("Pedro");
                pedro.saque(50);
                Console.WriteLine("Saldo de Maria: R$ {0}", maria.MostrarSaldo());
                Console.WriteLine("Saldo de Antonio: R$ {0}", antonio.MostrarSaldo());
                Console.WriteLine("Saldo de Pedro: R$ {0}", pedro.MostrarSaldo());
                Console.ReadKey();
            }
        }
    }

}