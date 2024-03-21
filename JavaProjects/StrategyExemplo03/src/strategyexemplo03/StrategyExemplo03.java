/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyexemplo03;

import Pedidos.Pedido;
import Pedidos.PedidoEletronicos;
import Pedidos.PedidoMoveis;

/**
 *
 * @author jeffe
 */
public class StrategyExemplo03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
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
            
             //cria pedido
            Pedido pedidoMoveis = new PedidoMoveis();
            //define valor do pedido
            pedidoMoveis.setValor(100);
            //calcula frete comum
            System.out.println("Frete Comum - "+pedidoMoveis.getNomeSetor()+
                " R$"+pedidoMoveis.calculaFreteComum());
            //calcula frete expresso
            System.out.println("Frete Comum - "+pedidoMoveis.getNomeSetor()+
                " R$"+pedidoMoveis.calculaFreteExpresso());
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
