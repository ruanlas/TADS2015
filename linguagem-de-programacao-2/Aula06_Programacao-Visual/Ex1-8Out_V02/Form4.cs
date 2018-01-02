using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace testeEx1_8Out
{
    public partial class Form4 : Form
    {
        Aluno Cad_alunos = new Aluno();
        public Form4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int controle = 0;
            foreach (Aluno aluno in Cad_alunos.ListaAlunos())
            {
                //verifica se o nome digitado se encontra no array
                if(textBox1.Text == aluno.Nome)
                {
                    MessageBox.Show("Aluno Encontrado! Clique em Ok para lançar a nota do aluno");
                    label2.Text = "Nota do Aluno: " + aluno.Nome;
                    button2.Enabled = true;
                    textBox2.Enabled = true;
                    groupBox1.Enabled = true;
                    controle = 1;
                }
            }
            if (controle == 0)
            {
                MessageBox.Show("Aluno não encontrado. Por favor, verifique o nome e tente novamente.");
                textBox1.Text = null;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            foreach (Aluno aluno in Cad_alunos.ListaAlunos())
            {
                if (textBox1.Text == aluno.Nome)
                {
                    //tratamento de exceção
                    try
                    {
                        if (radioButton1.Checked)
                        {
                            aluno.NotaP1 = double.Parse(textBox2.Text);
                            MessageBox.Show("Notas Inseridas com sucesso!!");
                            textBox1.Text = null;
                            textBox2.Text = null;
                        }
                        else if (radioButton2.Checked)
                        {
                            aluno.NotaP2 = double.Parse(textBox2.Text);
                            MessageBox.Show("Notas Inseridas com sucesso!!");
                            textBox1.Text = null;
                            textBox2.Text = null;
                        }
                        else
                        {
                            MessageBox.Show("Por favor, escolha a nota que deseja lançar");
                        }
                    }
                    //tratamento de exceção
                    catch(FormatException)
                    {
                        MessageBox.Show("Digite um valor válido");
                        textBox2.Text = null;
                    }
                    
                }
            }
        }
    }
}
