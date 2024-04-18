/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author jeffe
 */
public abstract class AcrescimoDecorator extends Pizza {
    
    protected Pizza pizza;
    
    @Override
    public abstract String getDescricao();
    
    @Override
    public abstract double getPreco();
    
}
