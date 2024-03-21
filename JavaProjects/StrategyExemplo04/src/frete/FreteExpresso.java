/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frete;

/**
 *
 * @author jeffe
 */
public class FreteExpresso implements Frete{

    @Override
    public double calcula(double valorPedido) {
        return valorPedido*0.1;
    }
    
}
