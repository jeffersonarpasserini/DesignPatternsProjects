using StateSolucao01.domains;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StateSolucao02.domains.state
{
    internal class AguardandoPagamentoState : State
    {
        private Pedido pedido;
        public AguardandoPagamentoState(Pedido pedido)
        {
            this.pedido = pedido;
        }
        void State.cancelarPedido()
        {
            this.pedido.estadoAtual = pedido.cancelado;
        }
        void State.despacharPedido()
        {
            throw new Exception("Operacao não suportada, " +
                "pedido ainda não foi pago");
        }
        void State.sucessoAoPagar()
        {
            this.pedido.estadoAtual = pedido.pago;
        }
    }
}
