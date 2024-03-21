using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo02.Pedidos
{
    public class PedidoEletronicos : Pedido
    {
        public PedidoEletronicos()
        {
            this.nomeSetor = "Eletronicos";
        }
    }
}
