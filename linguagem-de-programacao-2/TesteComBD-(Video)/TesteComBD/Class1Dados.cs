using System;
//Uso da classe System.Configuration;
using System.Configuration;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//uso da biblioteca
using System.Data;
using System.Data.SqlClient;

/*
    Para conectar com o Banco de Dados, você pode conectar através do
    'Data Sources > Add New Data Source', escolhendo e configurando um banco de dados,
    ou você pode ir até 'Server Explorer > Conect to Database', Configurando uma
    Conexão com o BD "manual"

    Você terá também que editar o App.config, adicionando a string de conexão com
    o Banco. Caso você opte a iniciar através do 'Data Sources', esta configuração
    é feita automática. O comando para adicionar esta configuração é a seguinte,
    inserindo:

    <connectionStrings>
        <add name="ConnectionStringBDLP2"
            connectionString="Data Source=ADM-PC;Initial Catalog=BDLP2;Integrated Security=True"
            providerName="System.Data.SqlClient" />
    </connectionStrings>
    onde: "Data Source=ADM-PC" => Nome do Servidor SQL;
          "Initial Catalog=BDLP2" => Banco de Dados (que está no Servidor)
          e "<add name="nome".... => nome da chave. Este nome pode ser qualquer um,
          mas é recomendado que seja um nome intuitivo.

    Para criar a variável que irá receber esta string de conexão, é necessário
    adicionar a classe "System.Configuration;" com o 'using' e incluir a
    referência 'System.Configuration' em 'Soluction Explorer > References'.
    */

namespace TesteComBD
{
    
    public class Class1Dados
    {
        //Variável que receberá a string de conexão
        public string stringConexao = ConfigurationManager.ConnectionStrings["ConnectionStringBDLP2"].ConnectionString;
        //ConnectionStrings["nome_da_chave_criada_em_App.config"]

        //Variáveis constantes que conterão as instruções SQL para o BDLP2
        //const = Para declarar variáveis constantes
        public const string strInsert = "INSERT INTO alunos VALUES (@nome, @idade, @data_nasc)";
        public const string strDelete = "DELETE FROM alunos WHERE matricula = @matricula";
        public const string strSelect = "SELECT * FROM alunos"; //caso der erro, especifique cada coluna com o nome que deseja realizar a consulta
        public const string strUpdate = "UPDATE alunos SET nome = @nome, idade = @idade, data_nasc = @data_nasc WHERE matricula = @matricula";

        //não esquecer de incluir as bibliotecas 'System.Data' e 'System.Data.SqlClient' em 'using'

        public class Alunos // Classe que referencia a tabela 'Aluno' do banco. Será utilizado para consultas
        {
            public int matricula { get; set; }
            public string nome { get; set; }
            public int idade { get; set; }
            public DateTime data_nasc { get; set; }
           
        }

        //Método que faz a gravação de dados no banco
        public void Gravar(string nome, int idade, DateTime data_nasc)
        {//Cláusula 'using' = "Boa prática de desenvolvimento". Usando esta
         //cláusula você tem a garantia que tudo que for utilizado dentro dela
         //serão liberados da memória quando terminar a execução
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using(SqlCommand ObjComando = new SqlCommand(strInsert, ObjConexao))
                {
                    //ObjComando.Connection = ObjConexao; => Seria necessário caso não fosse passado como parâmetro
                    //na instancialização

                    //Adição de parâmetros ao objeto
                    ObjComando.Parameters.AddWithValue("@nome", nome);
                    ObjComando.Parameters.AddWithValue("@idade", idade);
                    ObjComando.Parameters.AddWithValue("@data_nasc", data_nasc);

                    //abertura do objeto de conexão
                    ObjConexao.Open();

                    //Este comando é responsável por executar instruções de INSERT, UPDATE e DELETE no banco
                    ObjComando.ExecuteNonQuery();

                    //Fechamento do objeto de Conexão
                    ObjConexao.Close();
                }
                
            }
        }
        //metodo que realizará as consultas
        public List<Alunos> Consultar()
        {
            List<Alunos> lstAlunos = new List<Alunos>();

            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strSelect, ObjConexao))
                {
                    ObjConexao.Open();

                    //ObjComando.ExecuteReader(); é responsável por executar o comando 'SELECT'
                    //na base de dados e retornar os dados para o objeto ObjDataReader
                    SqlDataReader ObjDataReader = ObjComando.ExecuteReader();
                    //com os dados retornados, é necessário que verifique se houve retorno da base
                    //desta forma, utiliza-se o comando:
                    if(ObjDataReader.HasRows)
                    {//a propriedade ".HasRows" retorna um 'bool' informando 'true' se ela
                     //retornar uma ou mais linhas, ou 'false' se nao houver registros no 
                     //DataReader

                        while (ObjDataReader.Read())
                        {//enquanto o 'ObjDataReader.Read()' estiver "lendo", é preciso passar os valores para a lista<alunos>
                            
                            Alunos ObjAlunos = new Alunos();                            
                                //ObjDataReader["matricula"]. => onde "matricula" é o nome da coluna
                                ObjAlunos.matricula = int.Parse(ObjDataReader["matricula"].ToString());
                                ObjAlunos.nome = ObjDataReader["nome"].ToString();
                                ObjAlunos.idade = int.Parse(ObjDataReader["idade"].ToString());
                                ObjAlunos.data_nasc = DateTime.Parse(ObjDataReader["data_nasc"].ToString()); 
                                //ObjAlunos.data_nasc = Convert.ToDateTime(ObjDataReader["data_nasc"].ToString());

                            //adicionando os objetos com os campos preenchidos para a lista:
                            lstAlunos.Add(ObjAlunos);
                        }
                        //Ao final, fecha o DataReader:
                        ObjDataReader.Close();
                    }

                    ObjConexao.Close();
                }
            }
            //retorna a lstAlunos com os registros extraídos do banco
                    return lstAlunos;
        }

        //Metodo que faz a atualização de dados
        public void Atualizar(int matricula, string nome, int idade, DateTime data_nasc)
        {
            using (SqlConnection ObjetoConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjetoComando = new SqlCommand(strUpdate,ObjetoConexao))
                {
                    ObjetoComando.Parameters.AddWithValue("@matricula", matricula);
                    ObjetoComando.Parameters.AddWithValue("@nome", nome);
                    ObjetoComando.Parameters.AddWithValue("@idade", idade);
                    ObjetoComando.Parameters.AddWithValue("@data_nasc", data_nasc);

                    ObjetoConexao.Open();

                    ObjetoComando.ExecuteNonQuery();

                    ObjetoConexao.Close();
                }
            }
        }

        //Metodo que exclui a linha (registro)
        public void Excluir(int matricula)
        {
            using (SqlConnection OBConect = new SqlConnection(stringConexao))
            {
                using (SqlCommand OBComand = new SqlCommand(strDelete, OBConect))
                {
                    OBComand.Parameters.AddWithValue("@matricula", matricula);

                    OBConect.Open();

                    OBComand.ExecuteNonQuery();

                    OBConect.Close();
                }
            }
        }
    }

}
