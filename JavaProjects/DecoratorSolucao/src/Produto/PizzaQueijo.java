/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author jeffe
 */
public class PizzaQueijo extends Pizza {

    public PizzaQueijo(){
        this.descricao="Deliciosa pizza de queijo";
        this.preco=22;
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
