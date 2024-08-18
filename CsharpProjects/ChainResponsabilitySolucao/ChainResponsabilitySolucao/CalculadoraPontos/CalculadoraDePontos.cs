using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ChainResponsabilitySolucao.Pedido;

namespace ChainResponsabilitySolucao.CalculadoraPontos
{
    public class CalculadoraDePontos
    {

        public int calcularPontos(PedidoLanche pedido, int dia)
        {
            //inicializa os calculadores da cadeia
            CalculadorDePontos pontos70 = new Pontos70Reais();
            CalculadorDePontos pontos40 = new Pontos40Reais();
            CalculadorDePontos pontos20 = new Pontos20Reais();
            CalculadorDePontos nenhumPonto = new NenhumPonto();

            //define a ordem da cadeia de calculo.
            pontos70.setProximo(pontos40);
            pontos40.setProximo(pontos20);
            pontos20.setProximo(nenhumPonto);

            if (dia >= 16 && dia <= 31)
            {
                return pontos70.calcularPontos(pedido) * 2;
            }

            return pontos70.calcularPontos(pedido);
        }
    }
}
