/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

/**
 *
 * @author jeffe
 */
public class PedidoEletronicos extends Pedido {

    public PedidoEletronicos() {
        super.setNomeSetor("Eletronicos");
    }

    @Override
    public double calculaFreteComum() {
        return this.getValor()*0.05;
    }

    @Override
    public double calculaFreteExpresso() {
        return this.getValor()*0.1;
    }
}
