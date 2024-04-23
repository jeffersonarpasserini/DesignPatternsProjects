/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

/**
 *
 * @author jeffe
 */
public class EmailPedido {
    
    private Pedido pedido;
    
    public EmailPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    public void enviarEmail(String mensagem){
        System.out.println("Email enviado para: "+this.pedido.getConsumidor());
        System.out.println(mensagem);
    }
    
}
