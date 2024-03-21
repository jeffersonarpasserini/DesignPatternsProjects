using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo03.Pedido
{
    internal class PedidoEletronicos : Pedido
    {
        public PedidoEletronicos() 
        {
            this.nomeSetor = "Eletronicos";
        }

        public override double calculaFreteComum()
        {
            return this.valor * 0.05;
        }

        public override double calculaFreteExpresso()
        {
            return this.valor * 0.1;
        }
    }
}
