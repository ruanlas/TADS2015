using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApplication1
{
    public class UsuarioNaoEncontrado : Exception
    {
        public UsuarioNaoEncontrado()
        {

        }
    }
    public class LoginNull : Exception
    {
        public LoginNull()
        {

        }
    }
    public class SenhaNull : Exception
    {
        public SenhaNull()
        {

        }
    }
    public class SenhaIncorreta : Exception
    {
        public SenhaIncorreta()
        {

        }
    }
    class FerramentasDeLogin
    {
        //Verifica se o login que o usuário digitou existe ou não
        //Caso o login nao exista, ele retorna um throw
        /*
        login/senha => dados que o usuário vai digitar
        login2/senha2 => dados que serão buscados no banco de dados para validação
        */
        public static bool verificaLogin(string login, string senha, string login2, string senha2)
        {
            if (login == login2 && senha == senha2)
            {
                return true;
            }
            else if (login == null)
            {
                throw new LoginNull();
            }else if(senha == null)
            {
                throw new SenhaNull();
            }else if(login == login2 && senha != senha2)
            {
                throw new SenhaIncorreta();
            }
            else
            {
                throw new UsuarioNaoEncontrado();
            }
            
        }
        //verifica se qual o perfil de usuário que está entrando no sistema
        //e retorna com um int (pode pesquisar no banco de dados também através de uma consulta)
        public static int verificaPerfilUsuario(string login, string senha)
        {
            return 1;
        }
    }
}
