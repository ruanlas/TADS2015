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

namespace testeEx1_8Out
{
    public partial class Form3 : Form
    {
        Aluno Cad_alunos = new Aluno();
        public Form3()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int controle = 0;
            foreach (Aluno aluno in Cad_alunos.ListaAlunos())
            {
                if (aluno.Nome == textBox1.Text)
                {
                    controle = 1;
                    listView1.Items.Add("Nome do aluno: "+ aluno.Nome);
                    listView1.Items.Add("Matrícula: " + aluno.Matricula);
                    listView1.Items.Add("Série: " + aluno.Serie.ToString());
                    listView1.Items.Add("Nota P1: " + aluno.NotaP1.ToString("0.0"));
                    listView1.Items.Add("Nota P2: " + aluno.NotaP2.ToString("0.0"));
                    listView1.Items.Add("Media Final: " + aluno.MediaFinal().ToString("0.0"));
                    listView1.Items.Add("---------------------------------------------------------------------------");
                }
            }
            if (controle == 0)
            {
                MessageBox.Show("Aluno não encontrado");
            }
            
            
            //foreach (Aluno item in Cad_alunos.ListaAlunos())
            //{
            //    MessageBox.Show(item.Nome);
            //}
        }

        private void button2_Click(object sender, EventArgs e)
        {
            listView1.Clear();
        }
    }
}
