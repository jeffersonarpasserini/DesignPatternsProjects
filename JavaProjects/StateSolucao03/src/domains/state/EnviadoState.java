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
public class EnviadoState implements State{

    private Pedido pedido;

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Override
    public void sucessoAoPagar() {
        try {
            throw new Exception("Operação não suportada - pedido cancelado");
        } catch (Exception ex) {
            Logger.getLogger(CanceladoState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cancelarPedido() {
        try {
            throw new Exception("Operação não suportada - pedido cancelado");
        } catch (Exception ex) {
            Logger.getLogger(CanceladoState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void despacharPedido() {
        try {
            throw new Exception("Operação não suportada - pedido cancelado");
        } catch (Exception ex) {
            Logger.getLogger(CanceladoState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
