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
namespace Exercicio08_10
{
    public partial class Form2 : Form
    {
        Form1 f1 = new Form1();
         

        public Form2()
        {
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            ArrayList alunos = f1.getListaAlunos();
            foreach (Aluno aluno in alunos)
            {
                //quando o form2 carrega, já aparece a mensagem
                //Console.WriteLine(aluno.getNome());
                MessageBox.Show(aluno.getNome());
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ArrayList alunos = f1.getListaAlunos();
            foreach (Aluno aluno in alunos)
            {
                //Console.WriteLine(aluno.getNome());
                MessageBox.Show(aluno.getNome());
            }

        }
    }
}
