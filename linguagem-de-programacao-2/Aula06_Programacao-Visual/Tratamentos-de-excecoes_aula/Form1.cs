using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace excecoes_aula
{
    public partial class Form1 : Form
    {
        ContaPoupanca Conta = new ContaPoupanca();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                if (Conta.Saca(100.00))
                {
                    MessageBox.Show("");
                }
            }
            catch (Exception Ex)// ou (Exception) => se caso você nao for usar a variavel 'Ex'
            {
                MessageBox.Show(Ex.Message);
                // ou
                //MessageBox.Show("minha mensagem");
            }
            catch (ValorNaoPermitido)
            {

            }
        }
    }
    public class ValorNaoPermitido : Exception
    {
        
    }
    public class ContaPoupanca
    {
        public double Saldo;

        public bool Saca(double valor)
        {
            if (valor < 0)
            {
                throw new ValorNaoPermitido();
                //return false;
            }
            if (valor <= Saldo)
            {
                Saldo -= valor;
                return true;
            }
            else
            {
                throw new Exception("Valor do saque excede o saldo");
                //return false;
            }
        }
    }
}
