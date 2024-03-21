/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyexemplo04;

import Pedidos.Pedido;
import Pedidos.PedidoEletronicos;
import Pedidos.PedidoMoveis;
import frete.Frete;
import frete.FreteComum;
import frete.FreteExpresso;

/**
 *
 * @author jeffe
 */
public class StrategyExemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //cria os tipos de frete
            Frete freteComum = new FreteComum();
            Frete freteExpresso = new FreteExpresso();
            
             //cria pedido
            Pedido pedidoEletro = new PedidoEletronicos();
            //define valor do pedido
            pedidoEletro.setValor(100);
            
            //define o tipo de frete para o pedido
            pedidoEletro.setTipoFrete(freteComum);
            //calcula frete comum
            System.out.println("Frete Comum - "+pedidoEletro.getNomeSetor()+
                " R$"+pedidoEletro.calculaFrete());
            
            //altera tipo de frete no pedido
            pedidoEletro.setTipoFrete(freteExpresso);
            //calcula frete expresso
            System.out.println("Frete Comum - "+pedidoEletro.getNomeSetor()+
                " R$"+pedidoEletro.calculaFrete());
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
