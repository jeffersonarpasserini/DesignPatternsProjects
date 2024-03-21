/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

import gatewayPagamento.Gateway;

/**
 *
 * @author jeffe
 */
public class PagamentoDinheiro {
    private double valor;
    private Gateway gateway;

    public PagamentoDinheiro(double valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }
    
    public double calcularTaxa(){
        return 0;
    }
    
    public double calcularDesconto(){
            return this.valor*0.1;
    }
    
    public Boolean realizarCobranca(){
        double valorPago = this.valor+
                this.calcularTaxa()-
                this.calcularDesconto();
        return this.gateway.cobrar(valorPago);
    }
}
