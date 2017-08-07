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
    public partial class CadastroUsuario : Form
    {
        public CadastroUsuario()
        {
            InitializeComponent();
        }


        private void btnGravar_Click(object sender, EventArgs e)
        {
            //testar sem este if para ver se o banco está consistente com os valores null -> ver possibilidaed para levantar excessão
            if(!string.IsNullOrEmpty(txConfirPassword.Text) && !string.IsNullOrEmpty(txUser.Text) && !string.IsNullOrEmpty(txPassword.Text))
            {
                Dados dados = new Dados();
                try
                {
                    if (rbtProfissionalConst.Checked)
                    {
                        dados.CriarUsuario(txUser.Text, txPassword.Text, txConfirPassword.Text, 1);
                        MessageBox.Show("Cadastro efetuado com êxito");
                    }

                    else if (rbtClient.Checked)
                    {
                        dados.CriarUsuario(txUser.Text, txPassword.Text, txConfirPassword.Text, 2);
                        MessageBox.Show("Cadastro efetuado com êxito");
                    }
                    else
                    {
                        MessageBox.Show("Selecione uma categoria de usuário");
                    }

                }
                catch (SenhaDiferente se)
                {
                    MessageBox.Show(se.Message);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Erro: " + ex.Message);
                }
                this.Close();
            }
            else
            {
                MessageBox.Show("Digite um valor válido");
            }
               
        }
    }
}
