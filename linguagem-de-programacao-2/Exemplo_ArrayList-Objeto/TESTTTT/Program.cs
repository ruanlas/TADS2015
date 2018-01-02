using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;


namespace TESTTTT
{
    class Cao
    {
        string nome;
        string raça;
        int dataNascimento;

        public string Nome
        {
            get
            {
                return nome;
            }
            set
            {
                nome = value;
            }
        }
        public string Raca
        {
            get
            {
                return raça;
            }
            set
            {
                raça = value;
            }
        }

        public Cao(string nome, string raca)
        {
            this.nome = nome;
            this.raça = raca;
        }

        public Cao(string nome)
        {
            this.nome = nome;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList Cachorro = new ArrayList();
            Cachorro.Add(new Cao("Totó","Vira-lata"));
            Cachorro.Add(new Cao("mexico", "xiuaua"));
            //Cachorro.Add("torta");
            //Console.WriteLine(Cachorro[0]);
                       
            foreach (Cao c in Cachorro)
            {
                Console.WriteLine(c.Nome);
                Console.WriteLine(c.Raca);
                /*if (c.Nome.Equals("Totó"))
                {
                    c.Raca = "pitbull";
                    Console.WriteLine(c.Nome + " raça "+ c.Raca);
                }*/
            }

          
            
            
            Console.ReadKey();
            

        }
    }
}
