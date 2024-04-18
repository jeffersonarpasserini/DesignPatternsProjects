/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author jeffe
 */
public class MassaIntegral extends AcrescimoDecorator{

    private double valorMassaIntegral = 5;
    
    public MassaIntegral(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescricao() {
        return this.pizza.getDescricao()+" Massa Integral";
    }

    @Override
    public double getPreco() {
        return this.pizza.getPreco()+valorMassaIntegral;
    }
    
}
