using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using ChainResponsabilityProblema.Pedido;

namespace ChainResponsabilityProblema.CalculadoraPontos
{
    public class CalculadorDePontos
    {
        public int CalcularPontos(PedidoLanche pedido, int dia)
        {
            int pontos = 0;
            if (pedido.valor >= 70)
            {
                pontos = (int) pedido.valor / 5;
            } else if (pedido.valor >= 40)
            {
                pontos = (int)pedido.valor / 7;
            } else if (pedido.valor >= 20)
            {
                pontos = (int)(pedido.valor / 10);
            } else
            {
                pontos = 0;
            }

            if(dia >= 16 && dia <= 31)
            {
                pontos *= 2;
            }
            return pontos;
        }
    }
}
