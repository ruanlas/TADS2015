using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayDentado
{
    class Program
    {
        static void Main(string[] args)
        {
            int[][] numeros = new int[2][];
            numeros[0] = new int[2];
            numeros[1] = new int[4];
            numeros[0][0] = 7;
            numeros[0][1] = 7;
            numeros[1][0] = 8;
            numeros[1][1] = 8;
            numeros[1][2] = 8;
            numeros[1][3] = 8;
        }
    }
}
