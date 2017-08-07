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
    public partial class PesquisaOrcamento : Form
    {
        int CodPessoa = 0;
        int CodProfissao = 0;
        int CodOrcamento = 0;
        public PesquisaOrcamento(int CodPessoa, int CodProfissao)
        {
            InitializeComponent();
            this.CodPessoa = CodPessoa;
            this.CodProfissao = CodProfissao;
        }

        private void PesquisaOrcamento_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            if (CodProfissao == 1)
            {//cliente
                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodProfis(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
            else if (CodProfissao == 2)
            {//profissional
                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodCliente(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
        }

        private void lstOrcamento_SelectedIndexChanged(object sender, EventArgs e)
        {
            CodOrcamento = int.Parse(lstOrcamento.SelectedItems[0].Text);
            //MessageBox.Show(CodOrcamento.ToString());
        }

        private void btnOrdenarMaisCaro_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            if (CodProfissao == 1)
            {//cliente

                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodProfisDESC(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
            else if (CodProfissao == 2)
            {//profissional
                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodClienteDESC(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
        }

        private void btnOrdenarPeloMaisBarato_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            if (CodProfissao == 1)
            {//cliente
                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodProfisASC(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
            else if (CodProfissao == 2)
            {//profissional
                List<Dados.Orcamento> ListaOrcamento = ObjDados.ConsultaOrcamento_CodClienteASC(CodPessoa);
                lstOrcamento.Items.Clear();

                foreach (Dados.Orcamento item in ListaOrcamento)
                {
                    ListViewItem ObjListViewItem = new ListViewItem();
                    ObjListViewItem.Text = item.CodOrcamento.ToString();
                    ObjListViewItem.SubItems.Add(item.Observacoes);
                    ObjListViewItem.SubItems.Add(item.DataEmissao.ToShortDateString());
                    ObjListViewItem.SubItems.Add(item.Validade.ToShortDateString());
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodCliente).Nome);
                    ObjListViewItem.SubItems.Add(ObjDados.ConsultaPessoaCodPess(item.CodProfissional).Nome);
                    ObjListViewItem.SubItems.Add(item.MaodeObra.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(item.ValorTotal.ToString("R$ 0.00"));

                    lstOrcamento.Items.Add(ObjListViewItem);
                }
            }
        }

        private void btnDetalhe_Click(object sender, EventArgs e)
        {
            if (lstOrcamento.SelectedItems.Count > 0)
            {
                DetalheOrcamento ORC = new DetalheOrcamento(CodOrcamento);
                ORC.ShowDialog();
            }
            else
            {
                MessageBox.Show("Selecione um orçamento para visualizar os detalhes");
            }
            
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
