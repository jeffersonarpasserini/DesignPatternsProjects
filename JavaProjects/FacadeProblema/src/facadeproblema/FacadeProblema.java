/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadeproblema;

import cadastro.Consumidor;
import cadastro.Produto;
import vendas.EmailPedido;
import vendas.Pagamento;
import vendas.PagamentoBoleto;
import vendas.Pedido;

/**
 *
 * @author jeffe
 */
public class FacadeProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumidor consumidor = new Consumidor("Consumidor01", "0101010101","consum@gmail.com");
        
        Produto produto1 = new Produto("Blusa", "Blusa feminina", 80);
        Produto produto2 = new Produto("Camiseta", "Camiseta Masculina", 45);
        Produto produto3 = new Produto("Calça Jeans", "Calça Jeans Masculina", 120);
        
        Pedido pedido = new Pedido();
        pedido.setConsumidor(consumidor);
        pedido.addProduto(produto1);
        pedido.addProduto(produto2);
        pedido.addProduto(produto3);
        
        Pagamento pagamento = new PagamentoBoleto(pedido);
        EmailPedido email = new EmailPedido(pedido);
        
        if (pagamento.realizarPagamento()){
            email.enviarEmail("Pagamento realizado com sucesso");
        } else {
            email.enviarEmail("Falha no pagamento do pedido");
        }   
    }
}
