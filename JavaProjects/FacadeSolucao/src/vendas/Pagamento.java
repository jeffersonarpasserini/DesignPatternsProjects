/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

/**
 *
 * @author jeffe
 */
public abstract class Pagamento {
    
    protected Pedido pedido;
    
    public abstract boolean realizarPagamento();
    
}
