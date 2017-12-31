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
    public partial class CadastroEmail : Form
    {
        int CodPessoa = 0;
        public CadastroEmail(int CodPessoa)
        {
            InitializeComponent();
            this.CodPessoa = CodPessoa;
        }

        private void btnAddEmail_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            try
            {
                ObjDados.InserirPessoa_email(CodPessoa, txEmail.Text);
                MessageBox.Show("Dados cadastrados com sucesso");
                lstEmail.Items.Clear();
                foreach (var EmailPess in ObjDados.ConsultarPessoa_email(CodPessoa))
                {
                    ListViewItem ObList = new ListViewItem();
                    ObList.Text = EmailPess.Cod.ToString();
                    ObList.SubItems.Add(EmailPess.Email);

                    lstEmail.Items.Add(ObList);
                }
            }
            catch (Exception Ex)
            {

                MessageBox.Show("ERRO: " + Ex.Message);
            }
        }

        private void CadastroEmail_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            foreach (var EmailPess in ObjDados.ConsultarPessoa_email(CodPessoa))
            {
                ListViewItem ObList = new ListViewItem();
                ObList.Text = EmailPess.Cod.ToString();
                ObList.SubItems.Add(EmailPess.Email);
                try
                {
                    lstEmail.Items.Add(ObList);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("ERRO: " + ex.Message);
                }
            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            int CodEmail = 0;
            if(lstEmail.SelectedItems.Count > 0)
            {
                CodEmail = int.Parse(lstEmail.SelectedItems[0].Text);

            }
            Dados ObjDados = new Dados();
            ObjDados.DeletarPessoa_email(CodEmail);
            MessageBox.Show("Dados excluidos com sucesso");
            lstEmail.Items.Clear();
            foreach (var EmailPess in ObjDados.ConsultarPessoa_email(CodPessoa))
            {
                ListViewItem ObList = new ListViewItem();
                ObList.Text = EmailPess.Cod.ToString();
                ObList.SubItems.Add(EmailPess.Email);

                lstEmail.Items.Add(ObList);
            }
            //MessageBox.Show(CodEmail.ToString());
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
