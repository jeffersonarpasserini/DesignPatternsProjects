/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domains;

import domains.state.AguardandoPagamentoState;
import domains.state.CanceladoState;
import domains.state.EnviadoState;
import domains.state.PagoState;
import domains.state.State;

/**
 *
 * @author jeffe
 */
public class Pedido {
    
    private State aguardandoPagamento;
    private State pago;
    private State cancelado;
    private State enviado;
    //estado atual do pedido.
    private State estadoAtual;

    public Pedido() {
        System.out.println("Pedido aguardando pagamento");
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);
        //define o estado atual
        this.estadoAtual = this.aguardandoPagamento;
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

    public State getAguardandoPagamento() {
        return aguardandoPagamento;
    }

    public State getCancelado() {
        return cancelado;
    }

    public State getEnviado() {
        return enviado;
    }

    public State getPago() {
        return pago;
    }

    public void setEstadoAtual(State estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    
}
