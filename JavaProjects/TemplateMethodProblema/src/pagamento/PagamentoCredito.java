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
public class PagamentoCredito {
    private double valor;
    private Gateway gateway;

    public PagamentoCredito(double valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }
    
    public double calcularTaxa(){
        return this.valor*0.05;
    }
    
    public double calcularDesconto(){
        if(this.valor>300)
            return this.valor*0.05;
        else return 0;
    }
    
    public Boolean realizarCobranca(){
        double valorPago = this.valor+
                this.calcularTaxa()-
                this.calcularDesconto();
        return this.gateway.cobrar(valorPago);
    }
}
