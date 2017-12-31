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
    public partial class TipoAtividade_MateriaisCad : Form
    {
        int codMaterial = 0;
        int codAtividade = 0;
        public TipoAtividade_MateriaisCad()
        {
            InitializeComponent();
        }

        private void TipoAtividade_MateriaisCad_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();

            lstMateriais.Items.Clear();
            lstAtividade.Items.Clear();
            foreach (var materiais in ObjDados.ConsultaMateriais())
            {
                ListViewItem ObjListViewItem = new ListViewItem();
                ObjListViewItem.Text = materiais.CodMaterial.ToString();
                ObjListViewItem.SubItems.Add(materiais.NomeMaterial);

                lstMateriais.Items.Add(ObjListViewItem);
            }
            foreach (var atividades in ObjDados.ConsultarTipoAtividade())
            {
                ListViewItem ObjListViewItem = new ListViewItem();
                ObjListViewItem.Text = atividades.CodTipo.ToString();
                ObjListViewItem.SubItems.Add(atividades.Atividade);

                lstAtividade.Items.Add(ObjListViewItem);
            }
        }

        private void lstMateriais_SelectedIndexChanged(object sender, EventArgs e)
        {
            codMaterial = int.Parse(lstMateriais.SelectedItems[0].Text);
            //MessageBox.Show(codMaterial.ToString());
            label1.Text = "Item Selecionado: " + codMaterial.ToString();
        }

        private void lstAtividade_SelectedIndexChanged(object sender, EventArgs e)
        {
            codAtividade = int.Parse(lstAtividade.SelectedItems[0].Text);
            //MessageBox.Show(codMaterial.ToString());
            label2.Text = "Item Selecionado: " + codAtividade.ToString();
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            //MessageBox.Show(codAtividade.ToString() + codMaterial.ToString());
            try
            {
                ObjDados.InserirTipoAtividade_Materiais(codMaterial, codAtividade);
                MessageBox.Show("Informações gravadas com sucesso!!");
                codAtividade = 0;
                codMaterial = 0;
            }
            catch (Exception Exc)
            {
                MessageBox.Show("Erro: "+Exc.Message);
            }
            
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
