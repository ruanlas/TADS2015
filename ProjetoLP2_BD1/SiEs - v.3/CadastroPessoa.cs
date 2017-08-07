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
    public partial class CadastroPessoa : Form
    {
        bool Pesquisa = false;
        int codProfissao = 0;
        int CodPessoa = 0;
        //controle do botão gravar informações
        bool AlterarCadastro = false;
        public CadastroPessoa(int codProfissao, bool Pesquisa, int CodPessoa)
        {
            //Parâmetros passados pelo formulário que instancializa este
            InitializeComponent();
            this.Pesquisa = Pesquisa;
            this.codProfissao = codProfissao;
            this.CodPessoa = CodPessoa;
        }
        private void Atualizar()
        {
            //irá conter o comando para atualizar
            Dados ObjDados = new Dados();

            try
            {

                Dados.Pessoa pessoa = ObjDados.ConsultaPessoaCodPess(CodPessoa);

                txNomeCompl.Text = pessoa.Nome;
                txCpf.Text = pessoa.CPF;
                txRg.Text = pessoa.RG;
                txEndereco.Text = pessoa.Endereco;
                dtNasci.Value = pessoa.DataNascimento;
                txObs.Text = pessoa.Obs;

                txCpf.Enabled = false;
                txNomeCompl.Enabled = false;
                txRg.Enabled = false;
                txEndereco.Enabled = false;
                dtNasci.Enabled = false;
                txObs.Enabled = false;
                //
                btnGravarInfo.Enabled = false;

                btnNovo.Enabled = true;
                btnAlterCadastr.Enabled = true;
                btnInseriTelef.Enabled = true;
                btnInserirEmai.Enabled = true;
                if (AlterarCadastro)
                {
                    AlterarCadastro = false;
                }

            }
            catch (RegistroNaoEncontrado)
            {
                btnAlterCadastr.Enabled = false;
                btnInserirEmai.Enabled = false;
                btnInseriTelef.Enabled = false;
                MessageBox.Show("Cadastre a Pessoa");
            }
            catch (Exception Ex)
            {
                MessageBox.Show("Erro: " + Ex.Message);
            }
        }
        private void CadastroPessoa_Load(object sender, EventArgs e)
        {
            //Se caso for carregado a janela para realizar a pesquisa de pessoas, ele atualiza os
            //campos com os dados da pessoa, caso seja chamado para cadastrar uma pessoa, cliente ou
            //profissional, ele inicia os campos com null para poder preencher os dados
            if (Pesquisa)
            {
                Atualizar();
                btnNovo.Visible = false;
            }
            else
            {
                btnNovo.Enabled = false;
                btnAlterCadastr.Enabled = false;
                btnInserirEmai.Enabled = false;
                btnInseriTelef.Enabled = false;
                MessageBox.Show("Cadastre a Pessoa");
            }

        }

        private void btnGravarInfo_Click(object sender, EventArgs e)
        {
            if (AlterarCadastro)
            {
                if (!string.IsNullOrEmpty(txNomeCompl.Text) && !string.IsNullOrEmpty(txRg.Text) && !string.IsNullOrEmpty(txCpf.Text) && !string.IsNullOrEmpty(txEndereco.Text))
                {
                    try
                    {
                        Dados ObjDados = new Dados();
                        ObjDados.AlterarPessoa(CodPessoa, txNomeCompl.Text, dtNasci.Value, txRg.Text, txCpf.Text, txEndereco.Text, codProfissao, txObs.Text);
                        MessageBox.Show("Dados Alterados com sucesso");
                        Atualizar();
                    }
                    catch (Exception Exc)
                    {

                        MessageBox.Show("Erro: " + Exc.Message);
                    }
                }
                else
                {
                    MessageBox.Show("Preencha os campos Obrigatórios");
                }
            }
            else
            {
                if (!string.IsNullOrEmpty(txNomeCompl.Text) && !string.IsNullOrEmpty(txRg.Text) && !string.IsNullOrEmpty(txCpf.Text) && !string.IsNullOrEmpty(txEndereco.Text))
                {
                    try
                    {
                        Dados ObDados = new Dados();
                        //gravação na tabela Pessoa
                        ObDados.InserirPessoa(txNomeCompl.Text, dtNasci.Value, txRg.Text, txCpf.Text, txEndereco.Text, codProfissao, txObs.Text);
                        MessageBox.Show("Dados gravados com sucesso");
                        Dados.Pessoa ObjPessoa = ObDados.ConsultaPessoa_ultimaCadas();
                        CodPessoa = ObjPessoa.CodPessoa;
                        Atualizar();

                       //MessageBox.Show("Dados gravados com sucesso");
                    }
                    catch (Exception Exc)
                    {

                        MessageBox.Show("Erro: " + Exc.Message);
                    }
                }
                else
                {
                    MessageBox.Show("Preencha os campos Obrigatórios");
                }
            }


        }

        private void btnInseriTelef_Click(object sender, EventArgs e)
        {
            CadastroTelefone CT = new CadastroTelefone(CodPessoa);
            CT.Show();
        }

        private void btnInserirEmai_Click(object sender, EventArgs e)
        {
            CadastroEmail CE = new CadastroEmail(CodPessoa);
            CE.Show();
        }


        private void btnAlterCadastr_Click(object sender, EventArgs e)
        {
            AlterarCadastro = true;
            btnGravarInfo.Enabled = true;

            txCpf.Enabled = true;
            txNomeCompl.Enabled = true;
            txRg.Enabled = true;
            txEndereco.Enabled = true;
            dtNasci.Enabled = true;
            txObs.Enabled = true;
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            AlterarCadastro = false;
            btnNovo.Enabled = false;
            btnAlterCadastr.Enabled = false;
            btnInserirEmai.Enabled = false;
            btnInseriTelef.Enabled = false;

            txCpf.Enabled = true;
            txNomeCompl.Enabled = true;
            txRg.Enabled = true;
            txEndereco.Enabled = true;
            dtNasci.Enabled = true;
            txObs.Enabled = true;
            btnGravarInfo.Enabled = true;

            txCpf.Text = null;
            txNomeCompl.Text = null;
            txRg.Text = null;
            txEndereco.Text = null;
            txObs.Text = null;
            dtNasci.Value = DateTime.Today;
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
