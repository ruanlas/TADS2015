using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace testeEx1_8Out
{
    public class Aluno
    {
        string nome;
        string matricula;
        int serie;
        double notaP1;
        double notaP2;
        double mediaFinal;

        static ArrayList alunos = new ArrayList();

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
        public string Matricula
        {
            get
            {
                return matricula;
            }
            set
            {
                matricula = value;
            }
        }
        public int Serie
        {
            get
            {
                return serie;
            }
            set
            {
                serie = value;
            }
        }
        public double NotaP1
        {
            get
            {
                return notaP1;
            }
            set
            {
                notaP1 = value;
            }
        }
        public double NotaP2
        {
            get
            {
                return notaP2;
            }
            set
            {
                notaP2 = value;
            }
        }

        public double MediaFinal()
        {
            return mediaFinal = (notaP1 + notaP2) / 2;
        }
        public ArrayList ListaAlunos()
        {
            return alunos;
        }
        public void addAlunos()
        {
            alunos.Add(new Aluno());
        }
    }
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
