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
        /*
        public Cao(string nome, string raca)
        {
            this.nome = nome;
            this.raça = raca;
        }

        public Cao(string nome)
        {
            this.nome = nome;
        }*/
    }
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList Cachorro = new ArrayList();
            Cachorro.Add(new Cao());
            //Cachorro.Add(new Cao());
            //Cachorro.Add("torta");
            //Console.WriteLine(Cachorro[0]);
            //int i = 2;
            foreach (Cao c in Cachorro)
            {
                Console.Write("Digite o nome do cachorro: ");
                c.Nome = Console.ReadLine();
                
                /*Console.WriteLine(c.Raca);
                Console.WriteLine();
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
