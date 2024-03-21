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
public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valor, Gateway gateway) {
        super.valor = valor;
        super.gateway = gateway;
    }

    @Override
    public double calcularDesconto(){
            return super.valor*0.1;
    }
}
