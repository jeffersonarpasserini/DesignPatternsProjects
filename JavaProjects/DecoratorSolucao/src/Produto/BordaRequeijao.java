/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author jeffe
 */
public class BordaRequeijao extends AcrescimoDecorator {

    private double valorBorda = 8.5;
    
    public BordaRequeijao(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescricao() {
        return this.pizza.getDescricao()+" Borda recheada de requeijao";
    }

    @Override
    public double getPreco() {
        return this.pizza.getPreco()+valorBorda;
    }
    
    
}
