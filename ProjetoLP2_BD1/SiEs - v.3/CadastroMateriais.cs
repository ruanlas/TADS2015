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
    public partial class CadastroMateriais : Form
    {
        public CadastroMateriais()
        {
            InitializeComponent();
        }
        private void Zerar_campos()
        {
            txContEmba.Text = null;
            txNomMater.Text = null;
            txObs.Text = null;
            txRendMater.Text = null;
            txUnidContEmba.Text = null;
            txUnidRend.Text = null;
            cboxCatMat.SelectedIndex = -1;
        }
        private void btnSalvar_Click(object sender, EventArgs e)
        {

            if (!string.IsNullOrEmpty(txNomMater.Text) && !string.IsNullOrEmpty(txRendMater.Text)&&!string.IsNullOrEmpty(txObs.Text)&&!string.IsNullOrEmpty(txUnidRend.Text)&&!string.IsNullOrEmpty(txContEmba.Text)&&!string.IsNullOrEmpty(txUnidContEmba.Text)&&!string.IsNullOrEmpty(cboxCatMat.SelectedIndex.ToString()))
            {
                Dados ObjDados = new Dados();
                try
                {
                    ObjDados.InserirMateriais(txNomMater.Text, float.Parse(txRendMater.Text), txObs.Text, txUnidRend.Text, float.Parse(txContEmba.Text), txUnidContEmba.Text, (cboxCatMat.SelectedIndex+1));
                    MessageBox.Show("Dados gravados com sucesso");
                    Zerar_campos();
                }
                catch (Exception Exc)
                {

                    MessageBox.Show("Erro: " + Exc.Message);
                }
            }
            else
            {
                MessageBox.Show("Preencha os campos obrigatorios");
            }
            
            
        }

        private void cboxCatMat_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void CadastroMateriais_Load(object sender, EventArgs e)
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

        private void btnMaterial_Atividade_Click(object sender, EventArgs e)
        {
            TipoAtividade_MateriaisCad TA_MC = new TipoAtividade_MateriaisCad();
            TA_MC.ShowDialog();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
