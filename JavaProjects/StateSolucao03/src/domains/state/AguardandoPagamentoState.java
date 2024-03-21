/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domains.state;

import domains.Pedido;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeffe
 */
public class AguardandoPagamentoState implements State{
    
    private Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstadoAtual(new PagoState(pedido));
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(new CanceladoState(pedido));
    }

    @Override
    public void despacharPedido() {
        try {
            throw new Exception("Operação não suportada - pedido ainda não foi pago");
        } catch (Exception ex) {
            Logger.getLogger(AguardandoPagamentoState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
