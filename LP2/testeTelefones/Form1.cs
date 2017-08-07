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

namespace testeTelefones
{
    public partial class Form1 : Form
    {
        //lista de telefones
        List<int> telefone = new List<int>();


        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                //verifica se há telefones na lista
                if(telefone.Count == 0)
                {
                    MessageBox.Show("Adicione um telefone");
                }
                else
                {
                    Class1 dados = new Class1();

                    //gravação dos itens da lista no banco
                    foreach (int x in telefone)
                    {

                        dados.Gravar(x);
                        //limpa o listview
                        listView1.Clear();
                    }
                    MessageBox.Show("Dados Gravados com sucesso");
                }
                //limpa a lista de telefones depois da gravação no banco
                telefone.Clear();
            }
            catch (Exception mess)
            {

                MessageBox.Show("Erro: "+mess);
            }
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //verifica se o texrbox está nulo
            if (string.IsNullOrEmpty(textBox1.Text))
            {
                MessageBox.Show("Digite um telefone para inserir");
            }
            else
            {
                try
                {
                    listView1.Items.Add(textBox1.Text);
                    //adição de numeros na lista
                    telefone.Add(int.Parse(textBox1.Text));
                    textBox1.Text = null;
                }
                catch (Exception Me)
                {

                    MessageBox.Show("Erro: " + Me);
                }
            }
    
        }
    }
}
