/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import cadastro.Consumidor;
import cadastro.Produto;
import vendas.EmailPedido;
import vendas.Pagamento;
import vendas.PagamentoBoleto;
import vendas.PagamentoCredito;
import vendas.Pedido;

/**
 *
 * @author jeffe
 */
public class FacadeVendas {
    
    private Pedido pedido;
    private Pagamento pagamento;
    private EmailPedido email;
    
    public FacadeVendas(Consumidor consumidor) {
        this.pedido = new Pedido();
        this.pedido.setConsumidor(consumidor);
        
        this.email = new EmailPedido(pedido);
    }
    
    public void addProduto(Produto produto){
        this.pedido.addProduto(produto);
    }
    
    public void pedidoCredito(){
        this.pagamento = new PagamentoCredito(this.pedido);
        if(this.pagamento.realizarPagamento()){
            this.email.enviarEmail("Pagamento realizado "
                    + "com sucesso (crédito)");
        } else {
            this.email.enviarEmail("Falha no pagamento "
                    + "do pedido");
        }
    }
    
    public void pedidoBoleto(){
        this.pagamento = new PagamentoBoleto(this.pedido);
        if(this.pagamento.realizarPagamento()){
            this.email.enviarEmail("Pagamento realizado "
                    + "com sucesso (boleto)");
        } else {
            this.email.enviarEmail("Falha no pagamento"
                    + " do pedido");
        }
    }
}
