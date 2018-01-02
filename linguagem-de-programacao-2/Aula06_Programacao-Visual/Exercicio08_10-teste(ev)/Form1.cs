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
    public partial class Form1 : Form
    {
        /*
        Não é o método ideal porque cria apenas uma instacia do obejeto e todo objeto que ralizar alterações 
        modifica o objeto
        */
        private static ArrayList alunos = new ArrayList();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            alunos.Add(new Aluno(textBox1.Text, int.Parse(textBox2.Text)));

            foreach (Aluno aluno in alunos)
            {
                MessageBox.Show(aluno.getNome());
            }
        }

        public ArrayList getListaAlunos()
        {
            return alunos;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            f2.Show();
        }
    }
}
