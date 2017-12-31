using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TesteComBD
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Class1Dados dados = new Class1Dados();
            List<Class1Dados.Alunos> lstAlunos = new List<Class1Dados.Alunos>();
            //ou
            //List<TesteComBD.Class1Dados.Alunos> lstAlunos = new List<Class1Dados.Alunos>();
            try
            {
                lstAlunos = dados.Consultar();
            }
            catch (Exception ex)
            {

                MessageBox.Show("Erro: "+ ex.Message);
            }
            

            dataGridView1.DataSource = lstAlunos;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form3 F3 = new Form3();
            F3.ShowDialog();
        }
    }
}
