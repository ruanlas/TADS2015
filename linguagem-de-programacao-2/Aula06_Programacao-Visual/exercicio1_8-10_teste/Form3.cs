using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace teste_exercicio1_8_10
{
    public partial class Form3 : Form
    {
        Form2 F2 = new Form2();
        public Form3()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            foreach (Aluno aluno in F2.ListaAlunos())
            {
                MessageBox.Show(aluno.Nome, aluno.Matricula);
            }
        }
    }
}
