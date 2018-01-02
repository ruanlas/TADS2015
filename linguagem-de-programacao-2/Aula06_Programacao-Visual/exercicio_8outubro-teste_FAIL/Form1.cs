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
    
    public partial class Form1 : Form
    {
        string nome;
        string matricula;
        int serie;
        public Form1()
        {
            InitializeComponent();
        }
        public Form1(string matr, string nom, int ser)
        {
            InitializeComponent();
            nome = label1.Text;
            matricula = label2.Text;
            serie = ser;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 Cadastro = new Form2();
            Cadastro.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form3 Consulta = new Form3();
            Consulta.ShowDialog();
        }
    }
}
