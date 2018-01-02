using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace teste_exercicio1_8_10
{
    public partial class Form1 : Form
    {
        Aluno al = new Aluno();
        public Form1()
        {
            InitializeComponent();
        }
        public void dasd()
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 F2 = new Form2();
            F2.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form3 F3 = new Form3();
            F3.Show();
        }
    }
}
