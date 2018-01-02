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
            textBox2.Enabled = false;
            textBox2.Text = "R$";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //ArgumentExcepcion => exceção de tratamento de argumento incorreto
            try
            {
                if (Conta.Saca(double.Parse(textBox1.Text)))
                {
                    textBox2.Text = Conta.SaldoConta().ToString("R$ 0.00");
                    MessageBox.Show("Saque realizado com Sucesso!!");
                    
                }
            }
            catch (SaldoInsuficiente SI)
            {
                MessageBox.Show("Você Possui Saldo Insuficiente para sacar este valor");
                
            }
            //tratamento de excessão de caracteres inseridos do tipo não declarados
            //como por exemplo, o tipo esperado é um int e o usuário digita uma string
            catch (System.FormatException)
            {
                MessageBox.Show("Digite um valor válido");
            }
            catch (ValorNaoPermitido)
            {
                MessageBox.Show("Valor não permitido");
            }
            finally
            {
                textBox1.Text = null;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                if (Conta.Deposita(double.Parse(textBox1.Text)))
                {
                    textBox2.Text = Conta.SaldoConta().ToString("R$ 0.00");
                    MessageBox.Show("Depósito realizado com Sucesso!!");
                }
            }
            catch(ValorNaoPermitido)
            {
                MessageBox.Show("Valor não Permitido");
            }
            catch (System.FormatException)
            {
                MessageBox.Show("Digite um valor válido");
            }
            finally
            {
                textBox1.Text = null;
            }
            
        }
    }
    public class ValorNaoPermitido : Exception
    {
        public ValorNaoPermitido()
        {
            //MessageBox.Show("");
        }
    }
    public class SaldoInsuficiente : Exception
    {
        public SaldoInsuficiente()
        {
            //MessageBox.Show("");
        }
    }
    public class ContaPoupanca
    {
        public double Saldo;

        public bool Deposita(double valor)
        {
            
            if (valor < 0)
            {
                throw new ValorNaoPermitido();
                //return false;
            }
            else
            {
                Saldo += valor;
                return true;
            }
        }
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
        public double SaldoConta()
        {
            return Saldo;
        }
    }
}
