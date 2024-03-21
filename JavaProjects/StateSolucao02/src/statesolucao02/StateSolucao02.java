/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statesolucao02;

import domains.Pedido;

/**
 *
 * @author jeffe
 */
public class StateSolucao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            System.out.println("---------- Pedido 01 ------------------");
            //Faça seus teste aqui!!!
            Pedido pedido = new Pedido();
            pedido.sucessoAoPagar();
            pedido.despacharPedido();

            System.out.println("---------- Pedido 02 ------------------");
            Pedido pedido2 = new Pedido();
            pedido2.sucessoAoPagar();
            pedido2.despacharPedido();
            pedido2.cancelarPedido();


        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
