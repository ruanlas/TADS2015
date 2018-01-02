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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }
        /*Propiedades ListView Importantes:
        * FullRowSelect = bool (true/false) defaut 'false' => Selecionar a linha inteira
        * GridLines = bool (true/false) defaut 'false' => Exibir linhas do Grid
        * View = Details (Modo de visualização)
        * MultiSelect = bool (true/false) defaut 'true' => permite que mais de um item da lista
        seja selecionado. Se esta propriedade estiver ativa (true), em uma operação
        de exclusao ou edição de dados pode causar problema
        */
        private void button1_Click(object sender, EventArgs e)
        {
            Class1Dados dados = new Class1Dados();
            List<Class1Dados.Alunos> ListAlunos = new List<Class1Dados.Alunos>();
            //ou
            //List<TesteComBD.Class1Dados.Alunos> lstAlunos = new List<Class1Dados.Alunos>();

                ListAlunos = dados.Consultar();
            
            
            foreach (Class1Dados.Alunos aluno in ListAlunos)
            {
                ListViewItem OBlistView = new ListViewItem();

                OBlistView.Text = aluno.matricula.ToString();
                OBlistView.SubItems.Add(aluno.nome);
                OBlistView.SubItems.Add(aluno.idade.ToString());
                OBlistView.SubItems.Add(aluno.data_nasc.ToShortDateString());
                
                //adicionando os itens e subitens criados ao listview:
                try
                {
                    //listView2.Items.Add(aluno.matricula.ToString() + aluno.nome + aluno.data_nasc.ToString());
                    listView1.Items.Add(OBlistView);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("ERRO: "+ex.Message);
                }
                
                
                
            }
            //listView1.Items.Add(OBlistView);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int Matricula = 0;

            //Verifica se o item selecionado é maior que 0. Caso for maior, significa
            //que há um item selecionado, ou seja, o usuário selecionou um item
            if(listView1.SelectedItems.Count > 0)
            {
                //MessageBox.Show(matricula.Index.ToString());
                //MessageBox.Show(listView1.SelectedItems[0].Text);
                Matricula = int.Parse(listView1.SelectedItems[0].Text);
                //onde o '.SelectedItems[0].' => É passado o índice 0
                //que se refere à matricula do registro. desta forma, ele retorna o valor
                //do objeto selecionado, que seria o número da matrícula do registro
            }
            Class1Dados dados = new Class1Dados();
            dados.Excluir(Matricula);
            MessageBox.Show("Dados Excluidos com Sucesso!");
        }
    }
}
