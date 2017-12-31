using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace WindowsFormsApplication4_teste
{
    class Aluno
    {
        public string nome;
        public int ano;
    }
    public partial class Teste
    {
        public static ArrayList alu = new ArrayList();
        public ArrayList retornaArray()
        {
            return alu;
        }
    }
}
