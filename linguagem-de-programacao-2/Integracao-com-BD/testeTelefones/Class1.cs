using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Configuration;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Collections;

namespace testeTelefones
{
    class Class1
    {
        public string stringConexao = ConfigurationManager.ConnectionStrings["ConnectionStringTEL"].ConnectionString;
        public const string strInsert = "INSERT INTO telefone VALUES (@fone)";
        public const string strDelete = "DELETE FROM telefone WHERE id = @id";
        public const string strSelect = "SELECT * FROM telefone";

        public void Gravar(int fone)
        {
            using (SqlConnection ObjConexao = new SqlConnection(stringConexao))
            {
                using (SqlCommand ObjComando = new SqlCommand(strInsert, ObjConexao))
                {
                    /*foreach (int item in fone)
                    {
                        ObjComando.Parameters.AddWithValue("@fone", item);


                        ObjConexao.Open();

                        ObjComando.ExecuteNonQuery();

                        ObjConexao.Close();
                    }*/
                    ObjComando.Parameters.AddWithValue("@fone", fone);


                    ObjConexao.Open();

                    ObjComando.ExecuteNonQuery();

                    ObjConexao.Close();

                }

            }
        }

    }
}
