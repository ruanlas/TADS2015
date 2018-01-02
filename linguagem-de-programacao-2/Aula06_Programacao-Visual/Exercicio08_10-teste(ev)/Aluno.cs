using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio08_10
{
   
    class Aluno
    {
        private string nome;
        private int idade;
        public Aluno(string nome, int idade)
        {
            this.nome = nome;
            this.idade = idade;
        }

        public int getIdade()
        {
            return this.idade;
        }

        public string getNome()
        {
            return this.nome;
        }
    }

}