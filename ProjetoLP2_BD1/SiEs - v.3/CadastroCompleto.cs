using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using System.Collections;

namespace SiEs___v._2
{
    public partial class CadastroCompleto : Form
    {
        //Cod do usuário que está efetuando seu cadastro
        int CodUsuario = 0;
        int CodProfissao = 0;
        int CodPessoa = 0;
        bool AlterarCadastro = false;

        public CadastroCompleto(int CodUsuario, int CodProfissao)
        {
            InitializeComponent();
            this.CodUsuario = CodUsuario;
            this.CodProfissao = CodProfissao;

        }
        private void Atualizar()
        {
            //irá conter o comando para atualizar
            Dados ObjDados = new Dados();
            try
            {
                Dados.Pessoa_Usuarios pessoa_usuarios = ObjDados.ConsultarPessoaUsuarios_CodUsuario(CodUsuario);
                CodPessoa = pessoa_usuarios.CodPessoa;

                Dados.Pessoa pessoa = ObjDados.ConsultaPessoaCodPess(CodPessoa);

                txNomeCompl.Text = pessoa.Nome;
                txCpf.Text = pessoa.CPF;
                txRg.Text = pessoa.RG;
                txEndereco.Text = pessoa.Endereco;
                dataNasc.Value = pessoa.DataNascimento;
                txObs.Text = pessoa.Obs;

                txCpf.Enabled = false;
                txNomeCompl.Enabled = false;
                txRg.Enabled = false;
                txEndereco.Enabled = false;
                dataNasc.Enabled = false;
                txObs.Enabled = false;
                //
                btnGravarInfo.Enabled = false;
                btnBuscarCadas.Visible = false;
                btnAlterCadastr.Enabled = true;
                btnInseriTelef.Enabled = true;
                btnInserirEmai.Enabled = true;
                if (AlterarCadastro)
                {
                    AlterarCadastro = false;
                }
                else
                {
                    MessageBox.Show("Você está cadastrado");
                }
                
            }
            catch (RegistroNaoEncontrado)
            {
                btnAlterCadastr.Enabled = false;
                btnInserirEmai.Enabled = false;
                btnInseriTelef.Enabled = false;
                MessageBox.Show("Usuário nao cadastrado. Efetue o cadastro");
            }
            catch (Exception Ex)
            {
                MessageBox.Show("Erro: " + Ex.Message);
            }
        }
        private void CadastroCompleto_Load(object sender, EventArgs e)
        {
            Atualizar();
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
                        ObjDados.AlterarPessoa(CodPessoa, txNomeCompl.Text, dataNasc.Value, txRg.Text, txCpf.Text, txEndereco.Text, CodProfissao, txObs.Text);
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
                        ObDados.InserirPessoa(txNomeCompl.Text, dataNasc.Value, txRg.Text, txCpf.Text, txEndereco.Text, CodProfissao, txObs.Text);
                        ConfirmarCadastro ConfCadas = new ConfirmarCadastro(CodUsuario);
                        ConfCadas.ShowDialog();
                        MessageBox.Show("Dados gravados com sucesso");

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

        private void btnBuscarCadas_Click(object sender, EventArgs e)
        {
            ConfirmarCadastro CC = new ConfirmarCadastro(CodUsuario, true);
            CC.ShowDialog();
            Atualizar();
        }

        private void btnAlterCadastr_Click(object sender, EventArgs e)
        {
            AlterarCadastro = true;
            btnGravarInfo.Enabled = true;

            txCpf.Enabled = true;
            txNomeCompl.Enabled = true;
            txRg.Enabled = true;
            txEndereco.Enabled = true;
            dataNasc.Enabled = true;
            txObs.Enabled = true;
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
