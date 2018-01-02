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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        public static ArrayList alunos = new ArrayList();
        public ArrayList ListaAlunos()
        {
            return alunos;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            alunos.Add(new Aluno());
            foreach (Aluno aluno in alunos)
            {
                if (aluno.Nome == null)
                {
                    aluno.Nome = textBox1.Text;
                    aluno.Matricula = textBox2.Text;
                    aluno.Serie = int.Parse(textBox3.Text);
                }
                
            }
            MessageBox.Show("Dados gravados com sucesso");
            textBox1.Text = null;
            textBox2.Text = null;
            textBox3.Text = null;
        }
    }
}
