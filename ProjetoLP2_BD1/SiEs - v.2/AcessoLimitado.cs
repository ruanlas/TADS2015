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
    public partial class AcessoLimitado : Form
    {
        public AcessoLimitado()
        {
            InitializeComponent();
        }

        private void btnPesqMater_Click(object sender, EventArgs e)
        {
            PesquisaMaterial PM = new PesquisaMaterial();
            PM.ShowDialog();
        }

        private void btnEstimat_Click(object sender, EventArgs e)
        {
            Estimativa Es = new Estimativa();
            Es.ShowDialog();
        }
    }
}
