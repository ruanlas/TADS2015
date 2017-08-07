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
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void linkCadastro_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            CadastroUsuario Cadastro = new CadastroUsuario();
            Cadastro.ShowDialog();
        }
        
        private void btnEntrar_Click(object sender, EventArgs e)
        {
            
            Dados dados = new Dados();
            List<Dados.Usuarios> listaUsuarios = new List<Dados.Usuarios>();
            //busca a lista de usuarios no banco e retorna uma lista
            listaUsuarios = dados.ConsultarUsuarios(txLogin.Text);
            bool ControleAcesso = false;
            //trecho que verifica a existencia do usuário na lista
            foreach (Dados.Usuarios usuario in listaUsuarios)
            {
                if (usuario.User == txLogin.Text && usuario.Password == txPassword.Text)
                {
                    if (usuario.CodTipo == 1)
                    {
                        //MessageBox.Show("ACESSO CONCEDIDO");
                        AcessoProfissional ObjProfissional = new AcessoProfissional(usuario.CodUsuario, usuario.CodTipo);
                        ObjProfissional.ShowDialog();
                    }else if (usuario.CodTipo == 2)
                    {
                        //MessageBox.Show("ACESSO CONCEDIDO");
                        AcessoCliente ObjCliente = new AcessoCliente(usuario.CodUsuario, usuario.CodTipo);
                        ObjCliente.ShowDialog();
                    }
                    ControleAcesso = true;
                    
                    //txLogin.Text = null;
                    //txPassword.Text = null;
                    //MessageBox.Show("LIBERADO");
                }
                
            }
            if (!ControleAcesso)
            {
                MessageBox.Show("ACESSO NEGADO");
            }

        }

        private void btnSistLim_Click(object sender, EventArgs e)
        {
            AcessoLimitado ObjLimitado = new AcessoLimitado();
            ObjLimitado.ShowDialog();
        }
    }
}
