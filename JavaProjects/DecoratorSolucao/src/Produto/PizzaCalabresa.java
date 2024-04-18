/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author jeffe
 */
public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa(){
        this.descricao = "Deliciosa pizza de calabresa";
        this.preco = 25;
    }
    
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
    
}
