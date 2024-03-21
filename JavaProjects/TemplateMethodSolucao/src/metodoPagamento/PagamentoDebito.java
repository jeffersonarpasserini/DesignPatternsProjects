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
public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(double valor, Gateway gateway) {
        super.valor = valor;
        super.gateway = gateway;
    }
    
    @Override
    public double calcularTaxa(){
        return 4;
    }
    
    @Override
    public double calcularDesconto(){
            return super.valor*0.05;
    }
    
}
