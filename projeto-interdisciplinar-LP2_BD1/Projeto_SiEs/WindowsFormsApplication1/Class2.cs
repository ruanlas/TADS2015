using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApplication1
{
    class FerramentaEstimativa
    {

        static float qtdMateriais;
        static int qtdCaixas;


        static void ZerarValores()
        {//este método zera as variáveis staticas
            qtdMateriais = 0;
            qtdCaixas = 0;

        }

        public static float quantidadeTotal(float area, float rendimento)
        {//este método faz o cálculo da quantidade de materiais totais que serão utilizados
         //sem levar em conta a quantidade de materiais que estão na embalagem
            return qtdMateriais = (area * rendimento);
        }
        public static int quantidadeCaixas_Embalagens(float itensCaixa)
        {//este metodo faz o calculo de quantas caixas ou embalagens de um material serão necessários
            if ((qtdMateriais / itensCaixa) == (int)(qtdMateriais / itensCaixa))
            {
                //ou => Math.Truncate(temp / itensCaixa);
                //entretanto, esta função retorna double
                return qtdCaixas = (int)(qtdMateriais / itensCaixa);
            }
            else
            {
                return qtdCaixas = (int)((qtdMateriais / itensCaixa) + 1);
            }
        }
        public static double precoTotalMaterial(double precoUnitario)
        {//este método calcula o preço total de caixas de um determinado material
            return (precoUnitario * qtdCaixas);
        }
    }
}
