using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Exercicio_4
{
    class Qualquer
    {
        static ArrayList numeros = new ArrayList();
        static ArrayList vetorNumeros10 = new ArrayList();
        static ArrayList vetorNumerosSem0 = new ArrayList();

        static public void ArmazenarNumeros(int x)
        {
            numeros.Add(x);
        }
        static public int TamanhoArray()
        {
            return numeros.Count;
        }
        static public void ArmazenarEMostrar10Primeiros()
        {
            int cont = 0;
            for (int i = 0; i < numeros.Count; i++)
            {
                if (cont < 10)
                {
                    if ((int)numeros[i] % 2 == 0)
                    {
                        vetorNumeros10.Add(numeros[i]);
                        cont = cont + 1;
                    }
                }
                

                
            }
            Console.WriteLine();
            Console.WriteLine("Os 10 Primeiros numeros pares armazenados:");
            foreach(int num in vetorNumeros10)
            {
                Console.Write("{0}, ",num);
            }
        }
        static public void ArmazenarVetorAntesDo0()
        {
            for(int i = 0; i < (numeros.Count -1); i++)
            {
                vetorNumerosSem0.Add(numeros[i]);
            }
            Console.WriteLine();
            Console.WriteLine("Foram digitados {0} numeros antes do 0", numeros.Count - 1);
            foreach (var item in vetorNumerosSem0)
            {
                Console.Write("{0}, ", item);
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            
            int x = 9;
            Console.WriteLine("Digite um número inteiro qualquer diferente de 0");
            while( x != 0)
            {
                x = int.Parse(Console.ReadLine());
                Qualquer.ArmazenarNumeros(x); 
            }
            Console.WriteLine();
            Qualquer.ArmazenarEMostrar10Primeiros();
            Console.WriteLine();
            Qualquer.ArmazenarVetorAntesDo0();

            Console.ReadKey();
        }
    }
}
