/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyexemplo;

import Pedidos.Pedido;

/**
 *
 * @author jeffe
 */
public class StrategyExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criação do pedido
        Pedido pedido = new Pedido();
        //define o valor do pedido
        pedido.setValor(100);
        //calcula o frete comum
        System.out.println("Frete Comum R$"+pedido.calculaFreteComum());
        //calcula o frete Expresso
        System.out.println("Frete Comum R$"+pedido.calculaFreteExpresso());
        
    }
    
}
