using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        string nome;
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            //CaixaEntrada.Text = "CAIXA DE ENTRADA";
            nome = CaixaEntrada.Text;
            //string imput = CaixaEntrada.Text;
            //label1.Text = CaixaEntrada.Text;
        }

        private void label1_Click(object sender, EventArgs e)
        {
            //label1.Text = nome;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.ForeColor = Color.CadetBlue;
            label1.Text = nome;
        }
    }
}
