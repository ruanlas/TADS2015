using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace exercicio_8outubro
{
    public partial class Form2 : Form
    {
        Form1[] obj = new Form1[10];
        
        public Form2()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            var formulario = new Form1(textBox1.Text, textBox2.Text, int.Parse(textBox3.Text));
            formulario.Show();
        }
    }
}
