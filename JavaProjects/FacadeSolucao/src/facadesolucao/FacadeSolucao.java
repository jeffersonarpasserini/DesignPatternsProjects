/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadesolucao;

import cadastro.Consumidor;
import cadastro.Produto;
import facade.FacadeVendas;

/**
 *
 * @author jeffe
 */
public class FacadeSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Consumidor01", 
                "0101010101","consum@gmail.com");
        Produto produto1 = new Produto("Blusa", "Blusa feminina", 80);
        Produto produto2 = new Produto("Camiseta", "Camiseta Masculina", 45);
        Produto produto3 = new Produto("Calça Jeans", 
                "Calça Jeans Masculina", 120);
        
        FacadeVendas pedido = new FacadeVendas(consumidor);        
        pedido.addProduto(produto1);
        pedido.addProduto(produto2);
        pedido.addProduto(produto3);
        pedido.pedidoBoleto();        
    }
}
