using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo04.Pedidos
{
    public class PedidoMoveis : Pedido
    {
        public PedidoMoveis() 
        {
            this.nomeSetor = "Moveis";
        }
    }
}
