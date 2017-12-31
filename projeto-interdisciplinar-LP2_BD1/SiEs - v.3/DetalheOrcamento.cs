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
    public partial class DetalheOrcamento : Form
    {
        int CodOrcamento = 0;
        public DetalheOrcamento(int CodOrcamento)
        {
            InitializeComponent();
            this.CodOrcamento = CodOrcamento;
        }

        private void Orcamento_Load(object sender, EventArgs e)
        {
            //MessageBox.Show(CodOrcamento.ToString());
            dtEmissao.Enabled = false;
            dtValidade.Enabled = false;
            txCliente.Enabled = false;
            txMaoObra.Enabled = false;
            txObs.Enabled = false;
            txProfissional.Enabled = false;
            txValorTotal.Enabled = false;

            Dados ObjDados = new Dados();
            Dados.Orcamento ObjOrcamento = ObjDados.ConsultaOrcamento_CodOrca(CodOrcamento);
            List<Dados.Descricao_Orcamento> ListaDescricao = ObjDados.ConsultaDescricao_Orcamento_CodOrcam(CodOrcamento);
            List<Dados.Orcamento_TipoAtividade> ListaAtividades = ObjDados.ConsultaOrcamento_TipoAtividade(CodOrcamento);

            dtEmissao.Value = ObjOrcamento.DataEmissao;
            dtValidade.Value = ObjOrcamento.Validade;
            txCliente.Text = ObjDados.ConsultaPessoaCodPess(ObjOrcamento.CodCliente).Nome;
            txProfissional.Text = ObjDados.ConsultaPessoaCodPess(ObjOrcamento.CodProfissional).Nome;
            txMaoObra.Text = ObjOrcamento.MaodeObra.ToString("R$ 0.00");
            txValorTotal.Text = ObjOrcamento.ValorTotal.ToString("R$ 0.00");
            txObs.Text = ObjOrcamento.Observacoes;

            lstAtividades.Clear();
            lstItens.Items.Clear();

            foreach (Dados.Descricao_Orcamento descr in ListaDescricao)
            {
                ListViewItem ObjListView = new ListViewItem();

                ObjListView.Text = descr.CodMaterial.ToString();
                ObjListView.SubItems.Add(descr.Item.ToString());
                ObjListView.SubItems.Add(descr.nomeMaterial);
                ObjListView.SubItems.Add(descr.QuantidadeMateriais.ToString());
                ObjListView.SubItems.Add(descr.UnidadeMedida);
                ObjListView.SubItems.Add(descr.NumeroUnidades.ToString());
                ObjListView.SubItems.Add(descr.UnidadeAgrupamento);
                ObjListView.SubItems.Add(descr.ValorUnitario.ToString("R$ 0.00"));
                ObjListView.SubItems.Add(RegrasNegocio.PrecoTotalPorItem(descr.ValorUnitario, descr.NumeroUnidades).ToString("R$ 0.00"));

                lstItens.Items.Add(ObjListView);
            }

            foreach (Dados.Orcamento_TipoAtividade atividades in ListaAtividades)
            {
                lstAtividades.Items.Add(atividades.atividade);
            }
            
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
