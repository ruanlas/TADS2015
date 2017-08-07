using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Projeto_Sorveteria
{
    public partial class Form1 : Form
    {
        double precototal = 0;
        double[] precocopinho = new double[3] {1.5, 3, 4 };
        double[] precocascao = new double[2] {2.5, 4 };
        double[] precocestinha = new double[2] {3, 5 };
        double precopicole = 1;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {
            //botão de zerar cálculo
            precototal = 0;
            label4.Text = precototal.ToString("0.00");
        }
        private void checkBox11_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 1 bola - abacaxi
            if (checkBox11.Checked)
            {
                double preco = precocopinho[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
        }
        private void checkBox12_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 2 bolas - abacaxi
            if (checkBox12.Checked)
            {
                double preco = precocopinho[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }
        private void checkBox13_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 3 bolas - abacaxi
            if (checkBox13.Checked)
            {
                double preco = precocopinho[2];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[2];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }
        private void checkBox50_CheckedChanged(object sender, EventArgs e)
        {
            //Cascão 1 bola - Abacaxi
            if (checkBox50.Checked)
            {
                double preco = precocascao[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }
        private void checkBox49_CheckedChanged(object sender, EventArgs e)
        {
            //Cascão 2 bolas - Abacaxi
            if (checkBox49.Checked)
            {
                double preco = precocascao[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }
        private void checkBox70_CheckedChanged(object sender, EventArgs e)
        {
            //Cestinha 1 bola - Abacaxi
            if (checkBox70.Checked)
            {
                double preco = precocestinha[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }
        private void checkBox69_CheckedChanged(object sender, EventArgs e)
        {
            //Cestinha 2 bolas - Abacaxi
            if (checkBox69.Checked)
            {
                double preco = precocestinha[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox80_CheckedChanged(object sender, EventArgs e)
        {
            //picolé - Abacaxi
            if (checkBox80.Checked)
            {
                double preco = precopicole;
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precopicole;
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox16_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Amora
            if (checkBox16.Checked)
            {
                double preco = precocopinho[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox15_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Amora
            if (checkBox15.Checked)
            {
                double preco = precocopinho[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox14_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Amora
            if (checkBox14.Checked)
            {
                double preco = precocopinho[2];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[2];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox48_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 1 bola - Amora
            if (checkBox48.Checked)
            {
                double preco = precocascao[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox47_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 2 bolas - Amora
            if (checkBox47.Checked)
            {
                double preco = precocascao[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox68_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Amora
            if (checkBox68.Checked)
            {
                double preco = precocestinha[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox67_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Amora
            if (checkBox67.Checked)
            {
                double preco = precocestinha[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox79_CheckedChanged(object sender, EventArgs e)
        {
            //Picole - Amora
            if (checkBox79.Checked)
            {
                double preco = precopicole;
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precopicole;
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox19_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 1 bola - Beijinho
            if (checkBox19.Checked)
            {
                double preco = precocopinho[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox18_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 2 bolas - Beijinho
            if (checkBox18.Checked)
            {
                double preco = precocopinho[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox17_CheckedChanged(object sender, EventArgs e)
        {
            //Copinho 3 bolas - Beijinho
            if (checkBox17.Checked)
            {
                double preco = precocopinho[2];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[2];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox46_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 1 bola - Beijinho
            if (checkBox46.Checked)
            {
                double preco = precocascao[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox45_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 2 bolas - Beijinho
            if (checkBox45.Checked)
            {
                double preco = precocascao[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox66_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Beijinho
            if (checkBox66.Checked)
            {
                double preco = precocestinha[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox65_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Beijinho
            if (checkBox65.Checked)
            {
                double preco = precocestinha[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocestinha[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox78_CheckedChanged(object sender, EventArgs e)
        {
            //Picole - Beijinho
            if (checkBox78.Checked)
            {
                double preco = precopicole;
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precopicole;
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox22_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Brigadeiro
            if (checkBox22.Checked)
            {
                double preco = precocopinho[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox21_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Brigadeiro
            if (checkBox21.Checked)
            {
                double preco = precocopinho[1];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[1];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox20_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Brigadeiro
            if (checkBox20.Checked)
            {
                double preco = precocopinho[2];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocopinho[2];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox44_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 1 bola - Brigadeiro
            if (checkBox44.Checked)
            {
                double preco = precocascao[0];
                precototal += preco;
                label4.Text = precototal.ToString("0.00");
            }
            else
            {
                double preco = precocascao[0];
                precototal -= preco;
                label4.Text = precototal.ToString("0.00");
            }
            
        }

        private void checkBox43_CheckedChanged(object sender, EventArgs e)
        {
            //cascão 2 bolas - Brigadeiro
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox64_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Brigadeiro
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox63_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Brigadeiro
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox77_CheckedChanged(object sender, EventArgs e)
        {
            //picole - Brigadeiro
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox25_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Capuccino
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox24_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Capuccino
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox23_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Capuccino
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox42_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Capuccino
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox41_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Capuccino
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox62_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Capuccino
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox61_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Capuccino
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox76_CheckedChanged(object sender, EventArgs e)
        {
            //picole - Capuccino
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox28_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Chocolate
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox27_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Chocolate
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox26_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Chocolate
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox10_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Chocolate
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox9_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Chocolate
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox60_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Chocolate
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox59_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Chocolate
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox75_CheckedChanged(object sender, EventArgs e)
        {
            //picole 2 bolas - Chocolate
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox31_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Diamante Negro
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox30_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Diamante Negro
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox29_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Diamante Negro
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Diamante Negro
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Diamante Negro
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox58_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Diamante Negro
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox57_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Diamante Negro
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox74_CheckedChanged(object sender, EventArgs e)
        {
            //picole - Diamante Negro
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox34_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Sonho de Valsa
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox33_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Sonho de Valsa
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox32_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Sonho de Valsa
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Sonho de Valsa
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox5_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Sonho de Valsa
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox56_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Sonho de Valsa
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox55_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Sonho de Valsa
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox73_CheckedChanged(object sender, EventArgs e)
        {
            //picole bolas - Sonho de Valsa
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox37_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Kinder Ovo
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox36_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Kinder Ovo
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox35_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Kinder Ovo
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox4_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Kinder Ovo
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Kinder Ovo
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox54_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Kinder Ovo
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox53_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Kinder Ovo
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox72_CheckedChanged(object sender, EventArgs e)
        {
            //picole - Kinder Ovo
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox40_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 1 bola - Torta de Chocolate
            double preco = precocopinho[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox39_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 2 bolas - Torta de Chocolate
            double preco = precocopinho[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox38_CheckedChanged(object sender, EventArgs e)
        {
            //copinho 3 bolas - Torta de Chocolate
            double preco = precocopinho[2];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 1 bola - Torta de Chocolate
            double preco = precocascao[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            //cascao 2 bolas - Torta de Chocolate
            double preco = precocascao[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox52_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 1 bola - Torta de Chocolate
            double preco = precocestinha[0];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox51_CheckedChanged(object sender, EventArgs e)
        {
            //cestinha 2 bolas - Torta de Chocolate
            double preco = precocestinha[1];
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

        private void checkBox71_CheckedChanged(object sender, EventArgs e)
        {
            //picole - Torta de Chocolate
            double preco = precopicole;
            precototal += preco;
            label4.Text = precototal.ToString("0.00");
        }

    }
}
