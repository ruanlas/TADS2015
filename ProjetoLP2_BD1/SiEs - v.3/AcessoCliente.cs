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
    public partial class AcessoCliente : Form
    {
        //Cod do usuário que esta logado
        int CodUsuario = 0;
        int codPessoa = 0;
        int codProfissao = 0;
        int codTipoUsuario = 0;
        public AcessoCliente(int CodUsuario, int codTipoUsuario)
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
            //metodo que faz a atualização dos dados de perfil, relacionando o usuário do sistema com 
            //sua ficha de cliente ou profissional
            Dados ObjDados = new Dados();
            try
            {
                Dados.CodPessoa_CodProfissao CodPess_CodProf = ObjDados.Consulta_CodPessoaCodProfissao(CodUsuario);
                codPessoa = CodPess_CodProf.CodPessoa;
                codProfissao = CodPess_CodProf.CodProfissao;
                //MessageBox.Show("CodUsuario: " + CodUsuario.ToString() + " / CodProfissao: " + codProfissao.ToString() + " / CodPessoa: " + codPessoa.ToString());
            }
            catch (Exception EXC)
            {

                MessageBox.Show("Erro: " + EXC.Message);
            }
        }
        private void AcessoCliente_Load(object sender, EventArgs e)
        {
            Atualizar();
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

        private void btnPesquisarProfis_Click(object sender, EventArgs e)
        {
            PesqPessoa PP = new PesqPessoa(1);
            PP.ShowDialog();
        }

        private void btnCadastrarProfis_Click(object sender, EventArgs e)
        {
            //A Classe CadastroPessoa é chamada para visualizar os dados referentes
            //à pessoa cadastrada, mas é utilizada também para efetuar um novo cadastro
            //Neste caso, está sendo chamada para cadastrar profissionais
            CadastroPessoa CP = new CadastroPessoa(1, false, 0);
            CP.ShowDialog();
        }

        private void btnPesquisarOrcam_Click(object sender, EventArgs e)
        {
            //A classe PesquisaOrcamento é usada para filtrar somente os orçamentos feitos
            //pela pessoa ou para a pessoa
            PesquisaOrcamento PO = new PesquisaOrcamento(codPessoa, codProfissao);
            PO.ShowDialog();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
