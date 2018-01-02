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
            //ArgumentExcepcion => exceção de tratamento de argumento incorreto
            try
            {
                if (Conta.Saca(100.00))
                {
                    MessageBox.Show("");
                }
            }
            catch (SaldoInsuficiente SI)
            {
                MessageBox.Show(SI.Message);
                // ou
                //MessageBox.Show("minha mensagem");
            }
            catch (ValorNaoPermitido)
            {
                
            }
            finally
            {
                MessageBox.Show("ACONTECEU");
            }
        }
    }
    public class ValorNaoPermitido : Exception
    {
        public ValorNaoPermitido()
        {
            MessageBox.Show("");
        }
    }
    public class SaldoInsuficiente : Exception
    {
        public SaldoInsuficiente()
        {
            MessageBox.Show("");
        }
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
                throw new SaldoInsuficiente();
                //return false;
            }
        }
    }
}
