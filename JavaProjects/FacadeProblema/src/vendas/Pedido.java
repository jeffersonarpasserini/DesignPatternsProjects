/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import cadastro.Consumidor;
import cadastro.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class Pedido {
    
    private Consumidor consumidor;
    private List<Produto> produtos = new ArrayList<>();
    
    public String getConsumidor(){
        return this.consumidor.getNome();
    }
    
    public void setConsumidor(Consumidor consumidor)
    {
        this.consumidor = consumidor;
    }
    
    public void addProduto(Produto produto)
    {
        this.produtos.add(produto);
    }
}
