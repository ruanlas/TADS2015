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
    public partial class PesqClien : Form
    {
        int codProfissao = 0;
        public PesqClien(int codProfissao)
        {
            InitializeComponent();
            this.codProfissao = codProfissao;
        }

        private void PesqClien_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            List<Dados.Pessoa> ListaClientes = new List<Dados.Pessoa>();
            ListaClientes = ObjDados.ConsultaPessoa(codProfissao);

            foreach (Dados.Pessoa Cliente in ListaClientes)
            {
                ListViewItem ObjListViewItem = new ListViewItem();

                ObjListViewItem.Text = Cliente.CodPessoa.ToString();
                ObjListViewItem.SubItems.Add(Cliente.Nome);
                ObjListViewItem.SubItems.Add(Cliente.CPF);

                lstClientes.Items.Add(ObjListViewItem);
            }
        }

        private void btnSelect_Click(object sender, EventArgs e)
        {
            if(lstClientes.SelectedItems.Count > 0)
            {
                Estimativa.CodPessoaPesquisada = int.Parse(lstClientes.SelectedItems[0].Text);
                MessageBox.Show("Cliente Selecionado "+Estimativa.CodPessoaPesquisada.ToString());
                this.Close();
            }
            else
            {
                MessageBox.Show("Escolha um cliente");
            }
        }
    }
}
