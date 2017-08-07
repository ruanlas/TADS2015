using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SiEs___v._2
{
    public partial class ConfirmarCadastro : Form
    {
        int CodUsuario = 0;
        int CodPessoa = 0;
        bool Pesquisar = false;
        public ConfirmarCadastro(int CodUsuario)
        {
            InitializeComponent();
            this.CodUsuario = CodUsuario;
        }
        public ConfirmarCadastro(int CodUsuario, bool Pesquisar)
        {
            InitializeComponent();
            this.CodUsuario = CodUsuario;
            this.Pesquisar = Pesquisar;
        }

        private void ConfirmarCadastro_Load(object sender, EventArgs e)
        {
            if (Pesquisar)
            {

            }
            else
            {
                btnPesquisar.Visible = false;
                txCPF.Visible = false;
                label2.Visible = false;

                Dados ObjDados = new Dados();
                Dados.Pessoa ObjPessoa = ObjDados.ConsultaPessoa_ultimaCadas();

                lstPessoa.Items.Clear();
                ListViewItem ObjListViewItem = new ListViewItem();

                ObjListViewItem.Text = ObjPessoa.CodPessoa.ToString();
                ObjListViewItem.SubItems.Add(ObjPessoa.Nome);
                ObjListViewItem.SubItems.Add(ObjPessoa.CPF);

                lstPessoa.Items.Add(ObjListViewItem);
            }
            
        }
        private void lstPessoa_SelectedIndexChanged(object sender, EventArgs e)
        {
            CodPessoa = int.Parse(lstPessoa.SelectedItems[0].Text);
            //MessageBox.Show(CodPessoa.ToString());
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            if(lstPessoa.SelectedItems.Count > 0)
            {
                try
                {
                    ObjDados.InserirPessoa_Usuarios(CodPessoa, CodUsuario);
                    MessageBox.Show("Usuário vinculado");
                    this.Close();
                }
                catch (Exception ex)
                {

                    MessageBox.Show("ERRO: " + ex.Message);
                }
            }
            else
            {
                MessageBox.Show("Selecione o cadastro");
            }
        }

        private void btnPesquisar_Click(object sender, EventArgs e)
        {
            try
            {
                Dados ObjDados = new Dados();
                Dados.Pessoa ObjPessoa = ObjDados.ConsultaPessoaCPF(txCPF.Text);
                MessageBox.Show("Usuário encontrado");
                lstPessoa.Items.Clear();
                ListViewItem ObjListViewItem = new ListViewItem();

                ObjListViewItem.Text = ObjPessoa.CodPessoa.ToString();
                ObjListViewItem.SubItems.Add(ObjPessoa.Nome);
                ObjListViewItem.SubItems.Add(ObjPessoa.CPF);

                lstPessoa.Items.Add(ObjListViewItem);
            }
            catch (RegistroNaoEncontrado)
            {
                MessageBox.Show("Usuário não encontrado. Por favor, realize seu cadastro");
            }
            catch (Exception Ex)
            {
                MessageBox.Show("Erro: " + Ex.Message);
            }
            
        }
    }
}
