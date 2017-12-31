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
    public partial class CadastroTelefone : Form
    {
        int CodPessoa = 0;
        public CadastroTelefone(int CodPessoa)
        {
            InitializeComponent();
            this.CodPessoa = CodPessoa;
        }

        private void btnAddTelef_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            try
            {
                ObjDados.InserirPessoa_Telefone(CodPessoa, txTelefone.Text, txTipoTelef.Text);
                MessageBox.Show("Dados cadastrados com sucesso");
                lstTelef.Items.Clear();
                foreach (var TelefPess in ObjDados.ConsultarPessoa_Telefone(CodPessoa))
                {
                    ListViewItem Oblist = new ListViewItem();

                    Oblist.Text = TelefPess.Cod.ToString();
                    Oblist.SubItems.Add(TelefPess.Telefone + "  ---  " + TelefPess.TipoTelefone);

                    try
                    {
                        lstTelef.Items.Add(Oblist);
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show("ERRO: " + ex.Message);
                    }
                }

            }
            catch (Exception Ex)
            {

                MessageBox.Show("ERRO: "+Ex.Message);
            }
        }

        private void CadastroTelefone_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            foreach (var TelefPess in ObjDados.ConsultarPessoa_Telefone(CodPessoa))
            {
                ListViewItem Oblist = new ListViewItem();
                Oblist.Text = TelefPess.Cod.ToString();
                Oblist.SubItems.Add(TelefPess.Telefone + "  ---  " + TelefPess.TipoTelefone);

                try
                {
                    lstTelef.Items.Add(Oblist);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("ERRO: " + ex.Message);
                }

            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            int CodTelef = 0;

            if(lstTelef.SelectedItems.Count > 0)
            {
                CodTelef = int.Parse(lstTelef.SelectedItems[0].Text);
            }
            Dados ObjDados = new Dados();
            ObjDados.DeletarPessoa_Telefone(CodTelef);
            MessageBox.Show("Dados excluidos com sucesso");
            lstTelef.Items.Clear();
            foreach (var TelefPess in ObjDados.ConsultarPessoa_Telefone(CodPessoa))
            {
                ListViewItem Oblist = new ListViewItem();

                Oblist.Text = TelefPess.Cod.ToString();
                Oblist.SubItems.Add(TelefPess.Telefone + "  ---  " + TelefPess.TipoTelefone);

                try
                {
                    lstTelef.Items.Add(Oblist);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("ERRO: " + ex.Message);
                }
            }
        }
    }
}
