/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

/**
 *
 * @author jeffe
 */
public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(Pedido pedido){
        this.pedido = pedido;
    }
    
    @Override
    public boolean realizarPagamento() {
        return true;
    }
    
}
