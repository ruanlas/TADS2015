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
    public partial class Form3 : Form
    {
        Form2 F2 = new Form2();
        
        public Form3()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            
        }
        private void button1_Click(object sender, EventArgs e)
        {
            //ArrayList alunos = new ArrayList();
            //alunos = F2.ListaAlunos();
            foreach (Aluno alu in F2.ListaAlunos())
            {
                MessageBox.Show(alu.nome);
            }
        }

        
    }
}
