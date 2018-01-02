using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Operadores
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            double primeiro_valor, segundo_valor, resultado;
            primeiro_valor = double.Parse(textBox1.Text);
            segundo_valor = double.Parse(textBox2.Text);

            if (radioButton1.Checked)
            {
                resultado = primeiro_valor + segundo_valor;
                textBox3.Text = resultado.ToString();
            } else if (radioButton2.Checked)
            {
                resultado = primeiro_valor - segundo_valor;
                textBox3.Text = resultado.ToString();
            }else if (radioButton3.Checked)
            {
                resultado = primeiro_valor * segundo_valor;
                textBox3.Text = resultado.ToString();
            }else if (radioButton4.Checked)
            {
                resultado = primeiro_valor / segundo_valor;
                textBox3.Text = resultado.ToString();
            }else if (radioButton5.Checked)
            {
                resultado = primeiro_valor % segundo_valor;
                textBox3.Text = resultado.ToString();
            }

        }
     }
}
