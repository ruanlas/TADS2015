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
    public partial class PesquisaMaterial : Form
    {
        public PesquisaMaterial()
        {
            InitializeComponent();
        }

        private void PesquisaMaterial_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            dgwListMater.DataSource = ObjDados.ConsultaMateriais();
        }

        private void btnConsulCat_Click(object sender, EventArgs e)
        {
            ConsultaMatCat CMC = new ConsultaMatCat();
            CMC.ShowDialog();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
