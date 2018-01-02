using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class Form1 : Form
    {
        int i = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            i += 1;
            label1.ForeColor = Color.Blue;
            label1.Text = i.ToString("0.00");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            i += 2;
            label1.ForeColor = Color.Blue;
            label1.Text = i.ToString("0.00");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            i -= 1;
            label1.ForeColor = Color.Red;
            label1.Text = i.ToString("0.00");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            i -= 2;
            label1.ForeColor = Color.Red;
            label1.Text = i.ToString("0.00");
        }

        private void button6_Click(object sender, EventArgs e)
        {
            i = 0;
            label1.ForeColor = Color.Black;
            label1.Text = i.ToString("0.00");
        }

        private void label1_Click(object sender, EventArgs e)
        {
            label1.Text = "0";
        }
    }
}
