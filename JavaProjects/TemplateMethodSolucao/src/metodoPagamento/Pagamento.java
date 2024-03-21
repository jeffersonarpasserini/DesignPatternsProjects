/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoPagamento;

import gatewayPagamento.Gateway;

/**
 *
 * @author jeffe
 */
public abstract class Pagamento {
    protected double valor;
    protected Gateway gateway;
    //metodo hook
    public double calcularTaxa(){
        return 0;
    }
    //metodo abstrato
    public abstract double calcularDesconto();
    
    public Boolean realizarCobranca(){
        double valorPago = this.valor+
                this.calcularTaxa()-
                this.calcularDesconto();
        return this.gateway.cobrar(valorPago);
    }
    
}
