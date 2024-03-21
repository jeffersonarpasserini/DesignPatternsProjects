/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

/**
 *
 * @author jeffe
 */
public class Pedido {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calculaFreteComum(){
        return this.valor*0.05;
    }
    
    public double calculaFreteExpresso(){
        return this.valor*0.1;
    }
}
