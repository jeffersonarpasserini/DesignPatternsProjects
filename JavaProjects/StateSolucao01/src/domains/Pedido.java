/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domains;

import domains.enums.StatusPedido;
/**
 *
 * @author jeffe
 */
public class Pedido {
    
    private StatusPedido statusPedido;

    public Pedido() {
        this.statusPedido = StatusPedido.AGUARDANDO_PAGAMENTO;
    }
    
    public void sucessoAoPagar() throws Exception
    {
        if (this.statusPedido == StatusPedido.AGUARDANDO_PAGAMENTO)
        {
            //muda status
            System.out.println("Pedido Pago");
            this.statusPedido = StatusPedido.PAGO;
        }
        else
        {
            throw new Exception("O pedido não está aguardando pagamento");
        }
    }

    public void cancelarPedido() throws Exception
    {
        if (this.statusPedido == StatusPedido.PAGO ||
            this.statusPedido == StatusPedido.AGUARDANDO_PAGAMENTO)
        {
            //muda status
            System.out.println("Pedido Cancelado");
            this.statusPedido = StatusPedido.CANCELADO;
        }
        else
        {
            throw new Exception("O pedido se encontra "+this.statusPedido.toString());
        }
    }

    public void despacharPedido() throws Exception
    {
        if(this.statusPedido == StatusPedido.PAGO)
        {
            //muda status
            System.out.println("Pedido Enviado");
            this.statusPedido = StatusPedido.ENVIADO;
        } else
        {
            throw new Exception("O pedido se encontra cancelado");
        }
    }
}
