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
public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(double valor, Gateway gateway) {
        super.valor = valor;
        super.gateway = gateway;
    }
    
    @Override
    public double calcularTaxa(){
        return super.valor*0.05;
    }
    
    @Override
    public double calcularDesconto(){
        if(super.valor>300)
            return super.valor*0.02;
        else return 0;
    }
}
