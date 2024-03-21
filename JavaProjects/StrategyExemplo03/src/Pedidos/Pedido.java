/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jeffe
 */
public abstract class Pedido {
    
    private double valor;
    private String nomeSetor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
    
    public abstract double calculaFreteComum();
    
    public abstract double calculaFreteExpresso();
}
