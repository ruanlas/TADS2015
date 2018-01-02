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
        bool selecionouAluno = false;

        Aluno Cad_alunos = new Aluno();
        public Form4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            listView1.Clear();
            int controle = 0;
            foreach (Aluno aluno in Cad_alunos.ListaAlunos())
            {
                //verifica se o nome digitado se encontra no array
                if(aluno.Nome.ToUpper().Contains(textBox1.Text.ToUpper()))
                {
                    //MessageBox.Show("Aluno Encontrado! Clique em Ok para lançar a nota do aluno");
                    listView1.Items.Add(aluno.Nome);
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
            //verifica se já foi selecionado na lista, caso contrario, ele nao fara nada
            if (!selecionouAluno) return;
                foreach (Aluno aluno in Cad_alunos.ListaAlunos())
                {

                    foreach (ListViewItem item in listView1.SelectedItems)
                    {
                        if (aluno.Nome == item.Text)
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
                                selecionouAluno = false;



                                    }
                                    else if (radioButton2.Checked)
                                    {
                                        aluno.NotaP2 = double.Parse(textBox2.Text);
                                        MessageBox.Show("Notas Inseridas com sucesso!!");
                                        textBox1.Text = null;
                                        textBox2.Text = null;
                                selecionouAluno = false;
                                    }
                                    else
                                    {
                                        MessageBox.Show("Por favor, escolha a nota que deseja lançar");
                                    }
                                }
                                //tratamento de exceção
                                catch (FormatException)
                                {
                                    MessageBox.Show("Digite um valor válido");
                                    textBox2.Text = null;
                                }

                        }
                    }

                }
           
            
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            selecionouAluno = true;
        }

        private void Form4_Load(object sender, EventArgs e)
        {
            selecionouAluno = false;
        }
    }
}
