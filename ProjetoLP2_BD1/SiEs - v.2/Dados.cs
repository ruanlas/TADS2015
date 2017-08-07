using System;
//
using System.Collections;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/// <summary>
/// /////tentar utilizar o DataTable
/// </summary>
namespace SiEs___v._2
{
    class Dados
    {
        //String de conexão
        public string stringConexao = ConfigurationManager.ConnectionStrings["ConnectionStringSiEs"].ConnectionString;
        //Comandos para usuários de Login no Sistema
        public const string strInsertUsuarios = "INSERT INTO Usuarios VALUES (@User, @Password, @CodTipo)";
        public const string strAlterarSenhaUsuario = "UPDATE Usuarios SET Password = @Password WHERE CodUsuario = @CodUsuario";
        public const string strSelectUsuario = "SELECT * FROM Usuarios WHERE [User] = @User";
        //Comandos para Tabela Materiais
        public const string strInsertMateriais = "INSERT INTO Materiais VALUES (@NomeMaterial, @Rendimento, @Observacoes, @UnidadeDeRendimento, @ConteudoEmbalagem, @UnidadeDoConteudo_Cx, @CodCat)";
        public const string strAlterarMateriais = "UPDATE Materiais SET NomeMaterial = @NomeMaterial, Rendimento = @Rendimento, Observacoes = @Observacoes, UnidadeDeRendimento = @UnidadeDeRendimento, "+
            "ConteudoEmbalagem = @ConteudoEmbalagem, UnidadeDoConteudo_Cx = @UnidadeDoConteudo_Cx WHERE CodMaterial = @CodMaterial";
        public const string strSelectMateriais = "SELECT * FROM Materiais";
        public const string strDeletarMateriais = "DELETE FROM Materiais WHERE CodMaterial = @CodMaterial";
        public const string strSelectMateriaisUltim = "SELECT TOP 1 * FROM Materiais ORDER BY CodMaterial DESC";
        public const string strSelectMateriaisCat = "SELECT * FROM Materiais WHERE CodCat = @CodCat";
        public const string strSelectMateriaisCodMat = "SELECT * FROM Materiais WHERE CodMaterial = @CodMaterial";
        //Comandos para Tabela Pessoa
        public const string strInsertPessoa = "INSERT INTO Pessoa VALUES (@Nome, @DataNascimento, @RG, @CPF, @Endereco, @CodProfissao, @Obs)";
        public const string strAlterarPessoa = "UPDATE Pessoa SET Nome = @Nome, DataNascimento = @DataNascimento, RG = @RG, CPF = @CPF, Endereco = @Endereco, CodProfissao = @CodProfissao, Obs = @Obs WHERE CodPessoa = @CodPessoa";
        public const string strDeletarPessoa = "DELETE FROM Pessoa WHERE CodPessoa = @CodPessoa";
        public const string strSelectPessoa = "SELECT * FROM Pessoa WHERE CodProfissao = @CodProfissao";
        public const string strSelectPessoaCodPess = "SELECT * FROM Pessoa WHERE CodPessoa = @CodPessoa";
        public const string strSelecPessoaAll = "SELECT * FROM Pessoa";
        public const string strSelectPessoaUltim = "SELECT TOP 1 * FROM Pessoa ORDER BY CodPessoa DESC";
        public const string strSelectPessoaCPF = "SELECT * FROM Pessoa WHERE CPF = @CPF";

        //public const string strSelectPessoaCodProf = "SELECT * FROM Pessoa WHERE CodProfissao = @CodProfissao";
        //Comandos para a Tabela Pessoa_Email
        public const string strInsertPessoa_email = "INSERT INTO Pessoa_email VALUES (@CodPessoa, @Email)";
        public const string strAlterarPessoa_email = "UPDATE Pessoa_email SET Email = @Email WHERE Cod = @Cod";
        public const string strDeletarPessoa_email = "DELETE FROM Pessoa_email WHERE Cod = @Cod";
        public const string strSelectPessoa_email = "SELECT * FROM Pessoa_email WHERE CodPessoa = @CodPessoa";
        //Comandos para a Tabela Pessoa_Telefone
        public const string strInsertPessoa_Telefone = "INSERT INTO Pessoa_Telefone VALUES (@CodPessoa, @Telefone, @TipoTelefone)";
        public const string strAlterarPessoa_Telefone = "UPDATE Pessoa_Telefone SET Telefone = @Telefone, TipoTelefone = @TipoTelefone WHERE Cod = @Cod";
        public const string strDeletarPessoa_Telefone = "DELETE FROM Pessoa_Telefone WHERE Cod = @Cod";
        public const string strSelectPessoa_Telefone = "SELECT * FROM Pessoa_Telefone WHERE CodPessoa = @CodPessoa";
        //Comandos para a Tabela Pessoa_Usuarios
        public const string strInsertPessoa_Usuarios = "INSERT INTO Pessoa_Usuarios VALUES (@CodUsuario, @CodPessoa)";
        public const string strInsertPessoa_UsuariosAuto = "INSERT INTO Pessoa_Usuarios VALUES (@CodUsuario, @@identity)";
        public const string strSelectPessoa_Usuarios = "SELECT * FROM Pessoa_Usuarios";
        public const string strSelectPessoa_UsuariosCodUsua = "SELECT * FROM Pessoa_Usuarios WHERE CodUsuario = @CodUsuario";
        //Comandos para a Tabela Orçamento
        public const string strInsertOrcamento = "INSERT INTO Orcamento VALUES (@Observacoes, @MaodeObra, @ValorTotal, @DataEmissao, @Validade, @CodCliente, @CodProfissional)";
        public const string strSelectOrcamento = "SELECT * FROM Orcamento";
        public const string strSelectOrcamentoUltimoCads = "SELECT TOP 1 CodOrcamento FROM Orcamento ORDER BY CodOrcamento DESC";////////////
        public const string strSelectOrcamento_CodCliente = "SELECT * FROM Orcamento WHERE CodCliente = @CodCliente";
        public const string strSelectOrcamento_CodClienteASC = "SELECT * FROM Orcamento WHERE CodCliente = @CodCliente ORDER BY ValorTotal ASC";
        public const string strSelectOrcamento_CodClienteDESC = "SELECT * FROM Orcamento WHERE CodCliente = @CodCliente ORDER BY ValorTotal DESC";
        public const string strSelectOrcamento_CodProfissi = "SELECT * FROM Orcamento WHERE CodProfissional = @CodProfissional";
        public const string strSelectOrcamento_CodProfissiASC = "SELECT * FROM Orcamento WHERE CodProfissional = @CodProfissional ORDER BY ValorTotal ASC";
        public const string strSelectOrcamento_CodProfissiDESC = "SELECT * FROM Orcamento WHERE CodProfissional = @CodProfissional ORDER BY ValorTotal DESC";
        public const string strSelectOrcamento_CodOrca = "SELECT * FROM Orcamento WHERE CodOrcamento = @CodOrcamento";
        //Comandos para a tabela Descricao_Orcamento
        public const string strInsertDescricao_Orcamento = "INSERT INTO Descricao_Orcamento VALUES (@CodOrcamento, @CodMaterial, @Item, @QuantidadeMateriais, @UnidadeMedida, @NumeroUnidades, @UnidadeAgrupamento, @ValorUnitario)";
        public const string strSelectDescricao_Orcamento_CodOrcam = "SELECT Descricao_Orcamento.Cod, Descricao_Orcamento.CodMaterial,"+
            " Materiais.NomeMaterial, Descricao_Orcamento.CodOrcamento, Descricao_Orcamento.Item, Descricao_Orcamento.NumeroUnidades, Descricao_Orcamento.QuantidadeMateriais,"+
            " Descricao_Orcamento.UnidadeAgrupamento, Descricao_Orcamento.UnidadeMedida, Descricao_Orcamento.ValorUnitario FROM Descricao_Orcamento INNER JOIN Materiais"+
            " ON Descricao_Orcamento.CodMaterial = Materiais.CodMaterial WHERE Descricao_Orcamento.CodOrcamento = @CodOrcamento";

        //comandos para a tabela Orcamento_TipoAtividade
        public const string strInsertOrcamento_TipoAtividade = "INSERT INTO Orcamento_TipoAtividade VALUES (@CodOrcamento, @CodTipo)";
        public const string strConsultaOrcamento_TipoAtividade_CodOrcam = "SELECT Orcamento_TipoAtividade.Cod, Orcamento_TipoAtividade.CodOrcamento, Orcamento_TipoAtividade.CodTipo, TipoAtividade.Atividade" +
            " FROM Orcamento_TipoAtividade INNER JOIN TipoAtividade ON Orcamento_TipoAtividade.CodTipo = TipoAtividade.CodTipo WHERE CodOrcamento = @CodOrcamento";
        //Comandos para a tabela TipoAtividade_Materiais
        public const string strInsertTipoAtividade_Materiais = "INSERT INTO TipoAtividade_Materiais VALUES (@CodMaterial, @CodTipo)";
        //Comandos para a tabela TipoAtividade
        public const string strSelectTipoAtividade = "SELECT * FROM TipoAtividade";
        //Comando para Retornar CodPessoa e CodProfissao a partir do codUsuario
        public const string strSelectCodPessoa_CodProfiss = "SELECT Pessoa.CodPessoa, Pessoa.CodProfissao FROM Pessoa"+
            " INNER JOIN Pessoa_Usuarios ON Pessoa.CodPessoa = Pessoa_Usuarios.CodPessoa INNER JOIN Usuarios ON "+
            "Pessoa_Usuarios.CodUsuario = Usuarios.CodUsuario WHERE Usuarios.CodUsuario = @CodUsuario";

        public class Usuarios
        {
            public int CodUsuario { get; set; }
            public string User { get; set; }
            public string Password { get; set; }
            public int CodTipo { get; set; }
        } //Tabela Usuários
        public class Materiais //Tabela Materiais
        {
            public int CodMaterial { get; set; }
            public string NomeMaterial { get; set; }
            public float Rendimento { get; set; }
            public string Observacoes { get; set; }
            public string UnidadeDeRendimento { get; set; }
            public float ConteudoEmbalagem { get; set; }
            public string UnidadeDoConteudo_Cx { get; set; }
        }
        public class Pessoa //Tabela Pessoa
        {
            public int CodPessoa { get; set; }
            public string Nome { get; set; }
            public DateTime DataNascimento { get; set; }
            public string RG { get; set; }
            public string CPF { get; set; }
            public string Endereco { get; set; }
            public int CodProfissao { get; set; }
            public string Obs { get; set; }
        }
        public class Pessoa_email //Tabela Pessoa_Email
        {
            public int Cod { get; set; }
            public int CodPessoa { get; set; }
            public string Email { get; set; }
        }
        public class Pessoa_Telefone //Tabela Pessoa_Telefone
        {
            public int Cod { get; set; }
            public int CodPessoa { get; set; }
            public string Telefone { get; set; }
            public string TipoTelefone { get; set; }
        }
        public class Pessoa_Usuarios //Tabela Pessoa_Usuarios
        {
            public int Cod { get; set; }
            public int CodUsuario { get; set; }
            public int CodPessoa { get; set; }
        }
        public class Orcamento //Tabela Orcamento
        {
            public int CodOrcamento { get; set; }
            public string Observacoes { get; set; }
            public double MaodeObra { get; set; }
            public double ValorTotal { get; set; }
            public DateTime DataEmissao{ get; set; }
            public DateTime Validade { get; set; }
            public int CodCliente { get; set; }
            public int CodProfissional { get; set; }
        }
        public class Descricao_Orcamento
        {
            public int Cod { get; set; }
            public int CodOrcamento { get; set; }
            public int CodMaterial { get; set; }
            public string nomeMaterial { get; set; }
            public int Item { get; set; }
            public double QuantidadeMateriais { get; set; }
            public string UnidadeMedida { get; set; }
            public int NumeroUnidades { get; set; }
            public string UnidadeAgrupamento { get; set; }
            public double ValorUnitario { get; set; }
        } //Tabela Descricao_Orcamento
        public class Orcamento_TipoAtividade
        {
            public int Cod { get; set; }
            public int CodOrcamento { get; set; }
            public int CodTipo { get; set; }
            public string atividade { get; set; }
        } //Tabela Orcamento_TipoAtividade
        public class TipoAtividade
        {
            public int CodTipo { get; set; }
            public string Atividade { get; set; }
        }
        public class CodPessoa_CodProfissao
        {
            public int CodPessoa { get; set; }
            public int CodProfissao { get; set; }
        }
        //na criação de usuário precisa fazer validação para ver se existe usuário cadastrado no banco
        //Metodos para usuários de Login no Sistema
        public void CriarUsuario(string User, string Password, string ConfirmPassword, int TipoUsuario)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertUsuarios, ObjConexao))
                {
                    if(Password == ConfirmPassword)
                    {
                        ObjComando.Parameters.AddWithValue("@User", User);
                        ObjComando.Parameters.AddWithValue("@Password", Password);
                        ObjComando.Parameters.AddWithValue("@CodTipo", TipoUsuario);

                        ObjConexao.Open();
                        ObjComando.ExecuteNonQuery();
                        ObjConexao.Close();
                    }
                    else
                    {
                        throw new SenhaDiferente("Senhas não coicidem");
                    }
                    
                }
            }
        }
        public void AlterarSenhaUsuario(int CodUsuario, string NewPassword, string ConfirPassword)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strAlterarSenhaUsuario, ObjConexao))
                {
                    if (NewPassword == ConfirPassword)
                    {
                        ObjComando.Parameters.AddWithValue("@CodUsuario", CodUsuario);
                        ObjComando.Parameters.AddWithValue("@Password", NewPassword);

                        ObjConexao.Open();
                        ObjComando.ExecuteNonQuery();
                        ObjConexao.Close();
                    }
                    else
                    {
                        throw new SenhaDiferente("Senhas não coicidem");
                    }

                }
            }
        }
        public List<Usuarios> ConsultarUsuarios(string User)
        {
            List<Usuarios> ListaUsuarios = new List<Usuarios>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectUsuario, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@User", User);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Usuarios ObjUsuarios = new Usuarios();

                            ObjUsuarios.CodUsuario = int.Parse(ObjDataReader["CodUsuario"].ToString());
                            ObjUsuarios.User = ObjDataReader["User"].ToString();
                            ObjUsuarios.Password = ObjDataReader["Password"].ToString();
                            ObjUsuarios.CodTipo = int.Parse(ObjDataReader["CodTipo"].ToString());

                            ListaUsuarios.Add(ObjUsuarios);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaUsuarios;
        }
        //metodos para Materiais
        public void InserirMateriais(string NomeMaterial, float Rendimento, string Observacoes, string UnidadeDeRendimento, float ConteudoEmbalagem, string UnidadeDoConteudo_Cx, int CodCat)
        {//precisa alterar no banco a coluna Rendimento para float
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertMateriais,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@NomeMaterial", NomeMaterial);
                    ObjComando.Parameters.AddWithValue("@Rendimento", Rendimento);
                    ObjComando.Parameters.AddWithValue("@Observacoes", Observacoes);
                    ObjComando.Parameters.AddWithValue("@UnidadeDeRendimento", UnidadeDeRendimento);
                    ObjComando.Parameters.AddWithValue("@ConteudoEmbalagem", ConteudoEmbalagem);
                    ObjComando.Parameters.AddWithValue("@UnidadeDoConteudo_Cx", UnidadeDoConteudo_Cx);
                    ObjComando.Parameters.AddWithValue("@CodCat", CodCat);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void AlterarMateriais(int CodMaterial, string NomeMaterial, float Rendimento, string Observacoes, string UnidadeDeRendimento, float ConteudoEmbalagem, string UnidadeDoConteudo_Cx)
        {//precisa alterar no banco a coluna Rendimento para float
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strAlterarMateriais, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodMaterial", CodMaterial);
                    ObjComando.Parameters.AddWithValue("@NomeMaterial", NomeMaterial);
                    ObjComando.Parameters.AddWithValue("@Rendimento", Rendimento);
                    ObjComando.Parameters.AddWithValue("@Observacoes", Observacoes);
                    ObjComando.Parameters.AddWithValue("@UnidadeDeRendimento", UnidadeDeRendimento);
                    ObjComando.Parameters.AddWithValue("@ConteudoEmbalagem", ConteudoEmbalagem);
                    ObjComando.Parameters.AddWithValue("@UnidadeDoConteudo_Cx", UnidadeDoConteudo_Cx);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void DeletarMateriais(int CodMaterial)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strDeletarMateriais, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodMaterial", CodMaterial);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Materiais> ConsultaMateriais()
        {
            List<Materiais> ListaMaterial = new List<Materiais>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectMateriais, ObjConexao))
                {
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Materiais ObjMateriais = new Materiais();
                            ObjMateriais.CodMaterial = int.Parse(ObjDataReader["CodMaterial"].ToString());
                            ObjMateriais.NomeMaterial = ObjDataReader["NomeMaterial"].ToString();
                            ObjMateriais.Rendimento = float.Parse(ObjDataReader["Rendimento"].ToString());
                            ObjMateriais.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjMateriais.UnidadeDeRendimento = ObjDataReader["UnidadeDeRendimento"].ToString();
                            ObjMateriais.ConteudoEmbalagem = float.Parse(ObjDataReader["ConteudoEmbalagem"].ToString());
                            ObjMateriais.UnidadeDoConteudo_Cx = ObjDataReader["UnidadeDoConteudo_Cx"].ToString();

                            ListaMaterial.Add(ObjMateriais);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaMaterial;
        }
        public List<Materiais> ConsultaMateriaisCat(int CodCat)
        {
            List<Materiais> ListaMaterial = new List<Materiais>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectMateriaisCat, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodCat", CodCat);
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Materiais ObjMateriais = new Materiais();
                            ObjMateriais.CodMaterial = int.Parse(ObjDataReader["CodMaterial"].ToString());
                            ObjMateriais.NomeMaterial = ObjDataReader["NomeMaterial"].ToString();
                            ObjMateriais.Rendimento = float.Parse(ObjDataReader["Rendimento"].ToString());
                            ObjMateriais.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjMateriais.UnidadeDeRendimento = ObjDataReader["UnidadeDeRendimento"].ToString();
                            ObjMateriais.ConteudoEmbalagem = float.Parse(ObjDataReader["ConteudoEmbalagem"].ToString());
                            ObjMateriais.UnidadeDoConteudo_Cx = ObjDataReader["UnidadeDoConteudo_Cx"].ToString();

                            ListaMaterial.Add(ObjMateriais);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaMaterial;
        }
        public Materiais ConsultaMateriaisCodMat(int CodMaterial)
        {
            Materiais ObjMaterial = new Materiais();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectMateriaisCodMat, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodMaterial", CodMaterial);
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            ObjMaterial.CodMaterial = int.Parse(ObjDataReader["CodMaterial"].ToString());
                            ObjMaterial.NomeMaterial = ObjDataReader["NomeMaterial"].ToString();
                            ObjMaterial.Rendimento = float.Parse(ObjDataReader["Rendimento"].ToString());
                            ObjMaterial.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjMaterial.UnidadeDeRendimento = ObjDataReader["UnidadeDeRendimento"].ToString();
                            ObjMaterial.ConteudoEmbalagem = float.Parse(ObjDataReader["ConteudoEmbalagem"].ToString());
                            ObjMaterial.UnidadeDoConteudo_Cx = ObjDataReader["UnidadeDoConteudo_Cx"].ToString();

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ObjMaterial;
        }

        public List<Materiais> ConsultaMateriais_ultimaCadas() //consulta o ultimo material cadastrado
        {
            List<Materiais> ListaMaterial = new List<Materiais>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectMateriaisUltim, ObjConexao))
                {
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Materiais ObjMateriais = new Materiais();
                            ObjMateriais.CodMaterial = int.Parse(ObjDataReader["CodMaterial"].ToString());
                            ObjMateriais.NomeMaterial = ObjDataReader["NomeMaterial"].ToString();
                            ObjMateriais.Rendimento = float.Parse(ObjDataReader["Rendimento"].ToString());
                            ObjMateriais.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjMateriais.UnidadeDeRendimento = ObjDataReader["UnidadeDeRendimento"].ToString();
                            ObjMateriais.ConteudoEmbalagem = float.Parse(ObjDataReader["ConteudoEmbalagem"].ToString());
                            ObjMateriais.UnidadeDoConteudo_Cx = ObjDataReader["UnidadeDoConteudo_Cx"].ToString();

                            ListaMaterial.Add(ObjMateriais);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaMaterial;
        }

        //Metodos para Pessoa
        public void InserirPessoa(string Nome, DateTime DataNascimento, string RG, string CPF, string Endereco, int CodProfissao, string Obs)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertPessoa, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Nome", Nome);
                    ObjComando.Parameters.AddWithValue("@DataNascimento", DataNascimento);
                    ObjComando.Parameters.AddWithValue("@RG", RG);
                    ObjComando.Parameters.AddWithValue("@CPF", CPF);
                    ObjComando.Parameters.AddWithValue("@Endereco", Endereco);
                    ObjComando.Parameters.AddWithValue("@CodProfissao", CodProfissao);
                    ObjComando.Parameters.AddWithValue("@Obs", Obs);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();

                }
            }
        }
        public void AlterarPessoa(int CodPessoa, string Nome, DateTime DataNascimento, string RG, string CPF, string Endereco, int CodProfissao, string Obs)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strAlterarPessoa, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);
                    ObjComando.Parameters.AddWithValue("@Nome", Nome);
                    ObjComando.Parameters.AddWithValue("@DataNascimento", DataNascimento);
                    ObjComando.Parameters.AddWithValue("@RG", RG);
                    ObjComando.Parameters.AddWithValue("@CPF", CPF);
                    ObjComando.Parameters.AddWithValue("@Endereco", Endereco);
                    ObjComando.Parameters.AddWithValue("@CodProfissao", CodProfissao);
                    ObjComando.Parameters.AddWithValue("@Obs", Obs);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void DeletarPessoa(int CodPessoa)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strDeletarPessoa,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public Pessoa ConsultaPessoa_ultimaCadas()
        {
            Pessoa ObjPessoa = new Pessoa();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoaUltim, ObjConexao))
                {
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            ObjPessoa.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa.Nome = ObjDataReader["Nome"].ToString();
                            ObjPessoa.DataNascimento = DateTime.Parse(ObjDataReader["DataNascimento"].ToString());
                            ObjPessoa.RG = ObjDataReader["RG"].ToString();
                            ObjPessoa.CPF = ObjDataReader["CPF"].ToString();
                            ObjPessoa.Endereco = ObjDataReader["Endereco"].ToString();
                            ObjPessoa.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                            ObjPessoa.Obs = ObjDataReader["Obs"].ToString();

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ObjPessoa;
        }
        public List<Pessoa> ConsultaPessoa(int CodProfissao)
        {
            List<Pessoa> ListaPessoa = new List<Pessoa>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoa, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodProfissao", CodProfissao);

                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Pessoa ObjPessoa = new Pessoa();
                            ObjPessoa.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa.Nome = ObjDataReader["Nome"].ToString();
                            ObjPessoa.DataNascimento = DateTime.Parse(ObjDataReader["DataNascimento"].ToString());
                            ObjPessoa.RG = ObjDataReader["RG"].ToString();
                            ObjPessoa.CPF = ObjDataReader["CPF"].ToString();
                            ObjPessoa.Endereco = ObjDataReader["Endereco"].ToString();
                            ObjPessoa.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                            ObjPessoa.Obs = ObjDataReader["Obs"].ToString();

                            ListaPessoa.Add(ObjPessoa);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaPessoa;
        }
        public Pessoa ConsultaPessoaCodPess(int CodPessoa)
        {
            Pessoa ObjPessoa = new Pessoa();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoaCodPess, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);

                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            
                            ObjPessoa.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa.Nome = ObjDataReader["Nome"].ToString();
                            ObjPessoa.DataNascimento = DateTime.Parse(ObjDataReader["DataNascimento"].ToString());
                            ObjPessoa.RG = ObjDataReader["RG"].ToString();
                            ObjPessoa.CPF = ObjDataReader["CPF"].ToString();
                            ObjPessoa.Endereco = ObjDataReader["Endereco"].ToString();
                            ObjPessoa.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                            ObjPessoa.Obs = ObjDataReader["Obs"].ToString();

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ObjPessoa;
        }
        public List<Pessoa> ConsultaPessoaAll()
        {
            List<Pessoa> ListaPessoa = new List<Pessoa>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelecPessoaAll, ObjConexao))
                {
                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Pessoa ObjPessoa = new Pessoa();
                            ObjPessoa.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa.Nome = ObjDataReader["Nome"].ToString();
                            ObjPessoa.DataNascimento = DateTime.Parse(ObjDataReader["DataNascimento"].ToString());
                            ObjPessoa.RG = ObjDataReader["RG"].ToString();
                            ObjPessoa.CPF = ObjDataReader["CPF"].ToString();
                            ObjPessoa.Endereco = ObjDataReader["Endereco"].ToString();
                            ObjPessoa.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                            ObjPessoa.Obs = ObjDataReader["Obs"].ToString();

                            ListaPessoa.Add(ObjPessoa);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaPessoa;
        }
        public Pessoa ConsultaPessoaCPF(string CPF)
        {
            Pessoa ObjPessoa = new Pessoa();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoaCPF, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CPF", CPF);

                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            
                            ObjPessoa.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa.Nome = ObjDataReader["Nome"].ToString();
                            ObjPessoa.DataNascimento = DateTime.Parse(ObjDataReader["DataNascimento"].ToString());
                            ObjPessoa.RG = ObjDataReader["RG"].ToString();
                            ObjPessoa.CPF = ObjDataReader["CPF"].ToString();
                            ObjPessoa.Endereco = ObjDataReader["Endereco"].ToString();
                            ObjPessoa.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                            ObjPessoa.Obs = ObjDataReader["Obs"].ToString();

                        }
                        ObjDataReader.Close();
                    }
                    else
                    {
                        throw new RegistroNaoEncontrado();
                    }
                    ObjConexao.Close();
                }
            }
            return ObjPessoa;
        }

        //Metodos para Pessoa_email
        public void InserirPessoa_email(int CodPessoa, string Email)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertPessoa_email, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);
                    ObjComando.Parameters.AddWithValue("@Email", Email);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void AlterarPessoa_email(int Cod, string Email)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strAlterarPessoa_email, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Cod", Cod);
                    ObjComando.Parameters.AddWithValue("@Email", Email);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void DeletarPessoa_email(int Cod)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strDeletarPessoa_email, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Cod", Cod);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Pessoa_email> ConsultarPessoa_email(int CodPessoa)
        {
            List<Pessoa_email> ListaPessoa_email = new List<Pessoa_email>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoa_email, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Pessoa_email ObjPessoa_email = new Pessoa_email();
                            ObjPessoa_email.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            ObjPessoa_email.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa_email.Email = ObjDataReader["Email"].ToString();

                            ListaPessoa_email.Add(ObjPessoa_email);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();

                }
            }
            return ListaPessoa_email;
        }
        //Metodos para Pessoa_Telefone
        public void InserirPessoa_Telefone(int CodPessoa, string Telefone, string TipoTelefone)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertPessoa_Telefone, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);
                    ObjComando.Parameters.AddWithValue("@Telefone", Telefone);
                    ObjComando.Parameters.AddWithValue("@TipoTelefone", TipoTelefone);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void AlterarPessoa_Telefone(int Cod, string Telefone, string TipoTelefone)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strAlterarPessoa_Telefone, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Cod", Cod);
                    ObjComando.Parameters.AddWithValue("@Telefone", Telefone);
                    ObjComando.Parameters.AddWithValue("@TipoTelefone", TipoTelefone);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public void DeletarPessoa_Telefone(int Cod)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strDeletarPessoa_Telefone, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Cod", Cod);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Pessoa_Telefone> ConsultarPessoa_Telefone(int CodPessoa)
        {
            List<Pessoa_Telefone> ListaPessoa_Telefone = new List<Pessoa_Telefone>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoa_Telefone, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Pessoa_Telefone ObjPessoa_Telefone = new Pessoa_Telefone();
                            ObjPessoa_Telefone.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            ObjPessoa_Telefone.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ObjPessoa_Telefone.Telefone = ObjDataReader["Telefone"].ToString();
                            ObjPessoa_Telefone.TipoTelefone = ObjDataReader["TipoTelefone"].ToString();

                            ListaPessoa_Telefone.Add(ObjPessoa_Telefone);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();

                }
            }
            return ListaPessoa_Telefone;
        }
        //Metodos para Pessoa_Usuarios
        public void InserirPessoa_Usuarios(int CodPessoa, int CodUsuario)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertPessoa_Usuarios,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodUsuario", CodUsuario);
                    ObjComando.Parameters.AddWithValue("@CodPessoa", CodPessoa);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Pessoa_Usuarios> ConsultarPessoas_Usuarios()
        {
            List<Pessoa_Usuarios> ListaPessoa_Usuarios = new List<Pessoa_Usuarios>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using(SqlCommand ObjComando = new SqlCommand(strSelectPessoa_Usuarios, ObjConexao))
                {
                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Pessoa_Usuarios ObjPessoa_Usuarios = new Pessoa_Usuarios();
                            ObjPessoa_Usuarios.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            ObjPessoa_Usuarios.CodUsuario = int.Parse(ObjDataReader["CodUsuario"].ToString());
                            ObjPessoa_Usuarios.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            ListaPessoa_Usuarios.Add(ObjPessoa_Usuarios);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaPessoa_Usuarios;
        }
        public Pessoa_Usuarios ConsultarPessoaUsuarios_CodUsuario(int CodUsuario)
        {
            Pessoa_Usuarios Objeto = new Pessoa_Usuarios();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoa_UsuariosCodUsua,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodUsuario", CodUsuario);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Objeto.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            Objeto.CodUsuario = int.Parse(ObjDataReader["CodUsuario"].ToString());
                            Objeto.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                        }
                        ObjDataReader.Close();
                    }
                    else
                    {
                        throw new RegistroNaoEncontrado();
                    }
                    ObjConexao.Close();
                }
            }
            return Objeto;
        }
        public bool HouveCadstroPessoas_Usuarios()
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectPessoa_Usuarios, ObjConexao))
                {
                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();

                    return (ObjDataReader.HasRows) ;

                    ObjConexao.Close();
                }
            }
        }
        //Metodos para Orcamento
        public int Consulta_UltimoOrcamentoCadastrado()
        {
            int CodOrcamento = 0;
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamentoUltimoCads, ObjConexao))
                {
                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return CodOrcamento;
        }//dsfhffgs
        public void InserirOrcamento(string Observacoes, double MaodeObra, double ValorTotal, DateTime DataEmissao, DateTime Validade, int CodCliente, int CodProfissional)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertOrcamento, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@Observacoes", Observacoes);
                    ObjComando.Parameters.AddWithValue("@MaodeObra", MaodeObra);
                    ObjComando.Parameters.AddWithValue("@ValorTotal", ValorTotal);
                    ObjComando.Parameters.AddWithValue("@DataEmissao", DataEmissao);
                    ObjComando.Parameters.AddWithValue("@Validade", Validade);
                    ObjComando.Parameters.AddWithValue("@CodCliente", CodCliente);
                    ObjComando.Parameters.AddWithValue("@CodProfissional", CodProfissional);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Orcamento> ConsultaOrcamento()
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento, ObjConexao))
                {
                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodCliente(int CodCliente)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodCliente, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodCliente", CodCliente);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodClienteASC(int CodCliente)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodClienteASC, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodCliente", CodCliente);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodClienteDESC(int CodCliente)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodClienteDESC, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodCliente", CodCliente);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodProfis(int CodProfissional)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodProfissi, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodProfissional", CodProfissional);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodProfisASC(int CodProfissional)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodProfissiASC, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodProfissional", CodProfissional);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public List<Orcamento> ConsultaOrcamento_CodProfisDESC(int CodProfissional)
        {
            List<Orcamento> ListaOrcamento = new List<Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodProfissiDESC, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodProfissional", CodProfissional);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento ObjOrcamento = new Orcamento();
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                            ListaOrcamento.Add(ObjOrcamento);

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaOrcamento;
        }
        public Orcamento ConsultaOrcamento_CodOrca(int CodOrcamento)
        {
            Orcamento ObjOrcamento = new Orcamento();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectOrcamento_CodOrca, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodOrcamento", CodOrcamento);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            ObjOrcamento.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjOrcamento.Observacoes = ObjDataReader["Observacoes"].ToString();
                            ObjOrcamento.MaodeObra = double.Parse(ObjDataReader["MaodeObra"].ToString());
                            ObjOrcamento.ValorTotal = double.Parse(ObjDataReader["ValorTotal"].ToString());
                            ObjOrcamento.DataEmissao = DateTime.Parse(ObjDataReader["DataEmissao"].ToString());
                            ObjOrcamento.Validade = DateTime.Parse(ObjDataReader["Validade"].ToString());
                            ObjOrcamento.CodCliente = int.Parse(ObjDataReader["CodCliente"].ToString());
                            ObjOrcamento.CodProfissional = int.Parse(ObjDataReader["CodProfissional"].ToString());

                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ObjOrcamento;
        }
        //Metodo para Descricao_Orcamento
        public void InserirDescricao_Orcamento(int CodOrcamento, int CodMaterial, int Item, double QuantidadeMateriais, string UnidadeMedida, int NumeroUnidades, string UnidadeAgrupamento, double ValorUnitario)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertDescricao_Orcamento, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodOrcamento", CodOrcamento);
                    ObjComando.Parameters.AddWithValue("@CodMaterial", CodMaterial);
                    ObjComando.Parameters.AddWithValue("@Item", Item);
                    ObjComando.Parameters.AddWithValue("@QuantidadeMateriais", QuantidadeMateriais);
                    ObjComando.Parameters.AddWithValue("@UnidadeMedida", UnidadeMedida);
                    ObjComando.Parameters.AddWithValue("@NumeroUnidades", NumeroUnidades);
                    ObjComando.Parameters.AddWithValue("@UnidadeAgrupamento", UnidadeAgrupamento);
                    ObjComando.Parameters.AddWithValue("@ValorUnitario", ValorUnitario);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Descricao_Orcamento> ConsultaDescricao_Orcamento_CodOrcam(int CodOrcamento)
        {
            List<Descricao_Orcamento> ListaDescricaoOrca = new List<Descricao_Orcamento>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectDescricao_Orcamento_CodOrcam, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodOrcamento", CodOrcamento);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Descricao_Orcamento ObjDescricao = new Descricao_Orcamento();

                            ObjDescricao.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            ObjDescricao.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjDescricao.CodMaterial = int.Parse(ObjDataReader["CodMaterial"].ToString());
                            ObjDescricao.nomeMaterial = ObjDataReader["NomeMaterial"].ToString();
                            ObjDescricao.Item = int.Parse(ObjDataReader["Item"].ToString());
                            ObjDescricao.QuantidadeMateriais = double.Parse(ObjDataReader["QuantidadeMateriais"].ToString());
                            ObjDescricao.UnidadeMedida = ObjDataReader["UnidadeMedida"].ToString();
                            ObjDescricao.NumeroUnidades = int.Parse(ObjDataReader["NumeroUnidades"].ToString());
                            ObjDescricao.UnidadeAgrupamento = ObjDataReader["UnidadeAgrupamento"].ToString();
                            ObjDescricao.ValorUnitario = double.Parse(ObjDataReader["ValorUnitario"].ToString());

                            ListaDescricaoOrca.Add(ObjDescricao);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaDescricaoOrca;
        }
        //metodo para Orcamento_TipoAtividade
        public void InserirOrcamento_TipoAtividade(int CodOrcamento, int CodTipo)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertOrcamento_TipoAtividade, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodOrcamento", CodOrcamento);
                    ObjComando.Parameters.AddWithValue("@CodTipo", CodTipo);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        public List<Orcamento_TipoAtividade> ConsultaOrcamento_TipoAtividade(int CodOrcamento)
        {
            List<Orcamento_TipoAtividade> ListaAtividades = new List<Orcamento_TipoAtividade>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strConsultaOrcamento_TipoAtividade_CodOrcam, ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodOrcamento", CodOrcamento);

                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Orcamento_TipoAtividade ObjTipoAtiviOrcam = new Orcamento_TipoAtividade();
                            ObjTipoAtiviOrcam.Cod = int.Parse(ObjDataReader["Cod"].ToString());
                            ObjTipoAtiviOrcam.CodOrcamento = int.Parse(ObjDataReader["CodOrcamento"].ToString());
                            ObjTipoAtiviOrcam.CodTipo = int.Parse(ObjDataReader["CodTipo"].ToString());
                            ObjTipoAtiviOrcam.atividade = ObjDataReader["Atividade"].ToString();

                            ListaAtividades.Add(ObjTipoAtiviOrcam);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaAtividades;
        }
        //metodos para TipoAtividade_Materiais
        public void InserirTipoAtividade_Materiais(int CodMaterial, int CodTipo)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsertTipoAtividade_Materiais,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodMaterial", CodMaterial);
                    ObjComando.Parameters.AddWithValue("@CodTipo", CodTipo);

                    ObjConexao.Open();
                    ObjComando.ExecuteNonQuery();
                    ObjConexao.Close();
                }
            }
        }
        //metodo para TipoAtividade
        public List<TipoAtividade> ConsultarTipoAtividade()
        {
            List<TipoAtividade> ListaAtividade = new List<TipoAtividade>();
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectTipoAtividade, ObjConexao))
                {
                    ObjConexao.Open();
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            TipoAtividade ObjTipoAtividade = new TipoAtividade();

                            ObjTipoAtividade.CodTipo = int.Parse(ObjDataReader["CodTipo"].ToString());
                            ObjTipoAtividade.Atividade = ObjDataReader["Atividade"].ToString();

                            ListaAtividade.Add(ObjTipoAtividade);
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return ListaAtividade;
        }
        //Metodo para Retornar CodPessoa e CodProfissao a partir do codUsuario
        public CodPessoa_CodProfissao Consulta_CodPessoaCodProfissao(int CodUsuario)
        {
            CodPessoa_CodProfissao Objeto = new CodPessoa_CodProfissao();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelectCodPessoa_CodProfiss,ObjConexao))
                {
                    ObjComando.Parameters.AddWithValue("@CodUsuario", CodUsuario);

                    ObjConexao.Open();

                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    if (ObjDataReader.HasRows)
                    {
                        while (ObjDataReader.Read())
                        {
                            Objeto.CodPessoa = int.Parse(ObjDataReader["CodPessoa"].ToString());
                            Objeto.CodProfissao = int.Parse(ObjDataReader["CodProfissao"].ToString());
                        }
                        ObjDataReader.Close();
                    }
                    ObjConexao.Close();
                }
            }
            return Objeto;
        }

    }
    public class RegrasNegocio
    {
        public static double QuantidadeBrutaTotalMaterial(double area, float rendimentoMaterial)
        {
            return area * rendimentoMaterial;
        }
        public static double PrecoTotalPorItem(double precoUnitario, int qtdEmbalagem)
        {
            return precoUnitario * qtdEmbalagem;
        }
        public static int QuantidadeEmbalagensMaterial(float conteudoEmbalagem, double quantidadeTotal)
        {
            double resultado = quantidadeTotal / conteudoEmbalagem;
            if (resultado == (int)resultado)
            {
                return (int)resultado;
            }
            else
            {
                return (int)resultado + 1;
            }
        }
        public static double PrecoTotalItensOrcamento(ArrayList Lista)
        {
            double valorTotal = 0;
            foreach  (Itens_orcamento item in Lista)
            {
                valorTotal = valorTotal + item.valortotal;
            }
            return valorTotal;
        }
        public static double PrecoTotalOrcamento(double precoTotalItems, double maoObra)
        {
            return precoTotalItems + maoObra;
        }
        public static double PrecoTotalOrcamento2(ArrayList lista, double maoObra)
        {
            double valorTotal = 0;
            foreach (Itens_orcamento item in lista)
            {
                valorTotal = valorTotal + item.valortotal;
            }
            return valorTotal + maoObra;
        }

    }
    public class SenhaDiferente : Exception
    {
        string message;
        public SenhaDiferente(string message)
        {
            this.message = message;
        }
        public string Message
        {
            get
            {
                return message;
            }
        }
    }
    public class RegistroNaoEncontrado : Exception
    {
        string message;
        public RegistroNaoEncontrado()
        {
            this.message = "Registro não encontrado";
        }
        public string Message
        {
            get
            {
                return message;
            }
        }
    }
}
