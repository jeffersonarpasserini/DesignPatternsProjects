using StateSolucao01.domains;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StateSolucao02.domains.state
{
    public class PagoSate : State
    {
        private Pedido pedido;
        public PagoSate(Pedido pedido)
        {
            this.pedido = pedido;
        }
        void State.cancelarPedido()
        {
            this.pedido.estadoAtual = pedido.cancelado;
        }
        void State.despacharPedido()
        {
            this.pedido.estadoAtual = pedido.enviado;
        }
        void State.sucessoAoPagar()
        {
            throw new Exception("Operacao não suportada, pedido já foi pago");
        }
    }
}
