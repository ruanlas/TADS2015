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
    public partial class PesqPessoa : Form
    {
        int codProfissao = 0;
        int CodPessoa = 0;
        public PesqPessoa(int codProfissao)
        {
            InitializeComponent();
            this.codProfissao = codProfissao;
        }

        private void PesqPessoa_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            List<Dados.Pessoa> ListaPessoa = ObjDados.ConsultaPessoa(codProfissao);
            foreach (Dados.Pessoa pessoa in ListaPessoa)
            {
                ListViewItem ObjListView = new ListViewItem();

                ObjListView.Text = pessoa.CodPessoa.ToString();
                ObjListView.SubItems.Add(pessoa.Nome);
                ObjListView.SubItems.Add(pessoa.RG);
                ObjListView.SubItems.Add(pessoa.CPF);
                ObjListView.SubItems.Add(pessoa.Endereco);
                
                lstPessoa.Items.Add(ObjListView);
            }
        }

        private void btnMaisInf_Click(object sender, EventArgs e)
        {
            CadastroPessoa CP = new CadastroPessoa(codProfissao, true, CodPessoa);
            CP.ShowDialog();
        }

        private void lstPessoa_SelectedIndexChanged(object sender, EventArgs e)
        {
            CodPessoa = int.Parse(lstPessoa.SelectedItems[0].Text);
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
