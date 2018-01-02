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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            //se os textbox NAO estiverem nulos ou vazios
            if (!string.IsNullOrEmpty(textBox1.Text) && !string.IsNullOrEmpty(textBox2.Text))
            {
                try
                {//trata este trecho para verificar se há algum erro
                    Class1Dados dados = new Class1Dados();
                    dados.Gravar(textBox1.Text, int.Parse(textBox2.Text), dateTimePicker1.Value);
                    MessageBox.Show("Dados Gravados Com sucesso");
                    textBox1.Text = null;
                    textBox2.Text = null;
                    dateTimePicker1.Value = DateTime.Today;
                }
                catch (Exception ex)
                {

                    MessageBox.Show("Erro: " + ex.Message);
                }
            }
            else
            {
                if (string.IsNullOrEmpty(textBox1.Text))
                {
                    errorProvider1.SetError(textBox1, "Informe o Nome");
                }
                if (string.IsNullOrEmpty(textBox2.Text))
                {
                    errorProvider1.SetError(textBox2, "Informe a Idade");
                }
            }
            
                
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form2 F2 = new Form2();
            F2.ShowDialog();
        }
    }
}
