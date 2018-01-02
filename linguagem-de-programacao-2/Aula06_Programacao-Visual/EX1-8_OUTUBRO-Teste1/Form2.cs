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

namespace EX1_8_OUTUBRO
{
    public partial class Form2 : Form
    {
        static ArrayList alunos = new ArrayList();
        public Form2()
        {
            InitializeComponent();
        }
        public ArrayList ListaAlunos()
        {
            return alunos;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            alunos.Add(new Aluno());
            foreach (Aluno alu in alunos)
            {
                if (alu.nome == null)
                {
                    alu.nome = textBox1.Text;
                }
            }
            textBox1.Text = null;
            
        }
    }
}
