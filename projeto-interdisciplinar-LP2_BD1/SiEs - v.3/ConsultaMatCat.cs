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
    public partial class ConsultaMatCat : Form
    {
        public ConsultaMatCat()
        {
            InitializeComponent();
        }


        private void cboxCatMat_SelectedIndexChanged(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            lstVMateriais.Items.Clear();
            foreach (var material in ObjDados.ConsultaMateriaisCat(cboxCatMat.SelectedIndex + 1))
            {
                ListViewItem ObListView = new ListViewItem();
                ObListView.Text = material.CodMaterial.ToString();
                ObListView.SubItems.Add(material.NomeMaterial);
                ObListView.SubItems.Add(material.Rendimento.ToString());
                ObListView.SubItems.Add(material.UnidadeDeRendimento);
                ObListView.SubItems.Add(material.ConteudoEmbalagem.ToString());
                ObListView.SubItems.Add(material.UnidadeDoConteudo_Cx);
                ObListView.SubItems.Add(material.Observacoes);

                lstVMateriais.Items.Add(ObListView);
            }
        }

        private void ConsultaMatCat_Load(object sender, EventArgs e)
        {
            cboxCatMat.Items.Add("Piso");
            cboxCatMat.Items.Add("Argamassa");
            cboxCatMat.Items.Add("Rejunte");
            cboxCatMat.Items.Add("Tinta");
            cboxCatMat.Items.Add("Massa Corrida");
            cboxCatMat.Items.Add("Selador");
            cboxCatMat.Items.Add("Corante");
            cboxCatMat.Items.Add("Fundo Preparador");
            cboxCatMat.Items.Add("Gramado");
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
