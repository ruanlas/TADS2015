using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_01b
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();
            //r.Next() %6, onde %6 seria o parâmetro para a geração de numeros aleatorios (de 0 a 6)
            float[] numero = new float[10]{r.Next() %6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, r.Next() % 6, };
            //float[] verificador = new float[10];
            float soma = 0;
            float media = 0;
            float[] moDa = new float[10] { 0,0,0,0,0, 0, 0, 0, 0, 0 };
            int[] contm = new int[10] { 1,1,1,1,1, 1, 1, 1, 1, 1 };
            int maior = 0;
            int contadormoda = 0;

            /*for (int i = 0; i < numero.Length; i++)
            {
                Console.WriteLine("Digite um valor para a posição {0} do vetor: ", i + 1);
                numero[i] = float.Parse(Console.ReadLine());
            }
            */
            for (int i = 0; i < numero.Length; i++)
            {
                soma = soma + numero[i];
            }

            
            for (int i = 0; i < (numero.Length); i++) //bloco que faz a verificação de quantas vezes o
            {                                       //numero se repete no vetor
                for (int j=(numero.Length - 1); j > i; j--)
                {
                    if (numero[i] == numero[j])
                    {
                        moDa[i] = numero[i];
                        contm[i] = contm[i] + 1;
                    }
                }
            }
            for (int i=0; i < (numero.Length - 1); i++)
            {
                if (contm[i] > maior)
                {
                    maior = contm[i];
                }
                else
                {
                    maior = maior;
                }
            }

            /*
            for (int i=0; i < numero.Length; i++)
            {
                if (maior == contm[i])
                {
                    moda = moDa[i];
                }
            }
            */

            media = soma / numero.Length;
            Console.WriteLine("Media: {0}", media);

            for (int i = 0; i < numero.Length; i++)//bloco que faz a contagem de quantas modas há no vetor
            {
                if (maior == contm[i])
                {
                    contadormoda = contadormoda + 1;
                }
            }
            if (contadormoda > 1)//condicional: Se houver mais de uma moda, ele mostrará as duas
            {                   // informando a existencia de mais de uma moda, caso contrario
                int cont = 0;   // ele mostrará apenas a moda encontrada
                Console.WriteLine("Existem mais de uma Moda");
                for (int i = 0; i < moDa.Length; i++)
                {
                    if (maior == contm[i])
                    {
                        cont = cont + 1;
                        Console.WriteLine("Moda {0}: {1}", cont, moDa[i]);
                    }
                }
            }
            else
            {
                for (int i = 0; i < moDa.Length; i++)
                {
                    if (maior == contm[i])
                    {
                        Console.WriteLine("Moda: {0}", moDa[i]);
                    }
                }
            }
            //Console.WriteLine("Moda: {0}", moda);
            /*
            for (int i=0;i<moDa.Length; i++)
            {
                Console.WriteLine("Moda {0} - ContadorModa {1}", moDa[i], contm[i]);
            }
            */
            Console.ReadKey();
        }
    }
}
