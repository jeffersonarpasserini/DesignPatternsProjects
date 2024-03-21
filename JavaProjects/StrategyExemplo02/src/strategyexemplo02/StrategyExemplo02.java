/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyexemplo02;

import Pedidos.Pedido;
import Pedidos.PedidoEletronicos;

/**
 *
 * @author jeffe
 */
public class StrategyExemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cria pedido
        Pedido pedidoEletro = new PedidoEletronicos();
        //define valor do pedido
        pedidoEletro.setValor(100);
        //calcula frete comum
        System.out.println("Frete Comum - "+pedidoEletro.getNomeSetor()+
                " R$"+pedidoEletro.calculaFreteComum());
        //calcula frete expresso
        System.out.println("Frete Comum - "+pedidoEletro.getNomeSetor()+
                " R$"+pedidoEletro.calculaFreteExpresso());
    }
}
