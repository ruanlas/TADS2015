using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication15
{

    class Livro
    {
        public string Titulo;
        public string Autor;
        int PosEstante;

        public Livro(string Titulo)
        {
            this.Titulo = Titulo;
        }

        public void MostraLivro()
        {
            Console.WriteLine("Titulo: {0} Autor  {1}", Titulo, Autor);
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            //criar um vetor da classe Livro e atribuí-lo a uma variável vetor de classe Livro

            Livro[] MinhaEstante = new Livro[10];

            for (int i = 0; i < 2 ; i++) {
                MinhaEstante[i] = new Livro (Console.ReadLine());
                MinhaEstante[i].Autor = Console.ReadLine();
            }
            //MinhaEstante[0].Autor = "J K Rowling";
            

            for (int i = 0; i < 2; i ++){
                MinhaEstante[i].MostraLivro();
            }

            Console.ReadKey();
        }
    }
}
