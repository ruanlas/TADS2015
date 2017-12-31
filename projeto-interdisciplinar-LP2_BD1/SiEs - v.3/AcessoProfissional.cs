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
    public partial class AcessoProfissional : Form
    {
        //Cod do usuário que esta logado
        int CodUsuario = 0;
        int codPessoa = 0;
        int codProfissao = 0;
        int codTipoUsuario = 0;
        public AcessoProfissional(int CodUsuario, int codTipoUsuario)
        {
            InitializeComponent();
            this.CodUsuario = CodUsuario;
            this.codTipoUsuario = codTipoUsuario;
        }

        private void btnAlterarCadastro_Click(object sender, EventArgs e)
        {
            CadastroCompleto CC = new CadastroCompleto(CodUsuario, codTipoUsuario);
            CC.ShowDialog();
            Atualizar();
        }
        private void Atualizar()
        {
            //fazer busca por cod profissao e cod pessoa
            Dados ObjDados = new Dados();
            try
            {
                Dados.CodPessoa_CodProfissao CodPess_CodProf = ObjDados.Consulta_CodPessoaCodProfissao(CodUsuario);
                codPessoa = CodPess_CodProf.CodPessoa;
                codProfissao = CodPess_CodProf.CodProfissao;
                //MessageBox.Show("CodUsuario: "+CodUsuario.ToString()+" / CodProfissao: "+codProfissao.ToString()+" / CodPessoa: "+codPessoa.ToString());
            }
            catch (Exception EXC)
            {

                MessageBox.Show("Erro: " + EXC.Message);
            }
        }
        private void AcessoProfissional_Load(object sender, EventArgs e)
        {
            Atualizar();
        }

        private void btnCadastrarMater_Click(object sender, EventArgs e)
        {
            CadastroMateriais CM = new CadastroMateriais();
            CM.Show();
        }

        private void btnPesquisarMater_Click(object sender, EventArgs e)
        {
            PesquisaMaterial PM = new PesquisaMaterial();
            PM.Show();
        }

        private void btnEstimativa_Click(object sender, EventArgs e)
        {
            Estimativa Es = new Estimativa(codPessoa,codProfissao);
            Es.ShowDialog();
        }

        private void btnPesquisarClient_Click(object sender, EventArgs e)
        {
            PesqPessoa PP = new PesqPessoa(2);
            PP.ShowDialog();
        }

        private void btnCadastrarClien_Click(object sender, EventArgs e)
        {
            CadastroPessoa CP = new CadastroPessoa(2, false, 0);
            CP.ShowDialog();
        }

        private void btnPesquisarOrcam_Click(object sender, EventArgs e)
        {
            PesquisaOrcamento PO = new PesquisaOrcamento(codPessoa, codProfissao);
            PO.ShowDialog();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
