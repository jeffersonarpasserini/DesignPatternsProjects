/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domains;

import domains.state.AguardandoPagamentoState;
import domains.state.State;

/**
 *
 * @author jeffe
 */
public class Pedido {
    
    //estado atual do pedido.
    private State estadoAtual;

    public Pedido() {
        System.out.println("Pedido aguardando pagamento");
        //define o estado atual
        this.estadoAtual = new AguardandoPagamentoState(this);
    }
    public void sucessoAoPagar(){
        try{
            System.out.println("Pedido Pago");
            this.estadoAtual.sucessoAoPagar();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void cancelarPedido(){
        try{
            System.out.println("Pedido Cancelar");
            this.estadoAtual.cancelarPedido();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void despacharPedido(){
        try{
            System.out.println("Pedido Enviado");
            this.estadoAtual.despacharPedido();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void setEstadoAtual(State estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
}
