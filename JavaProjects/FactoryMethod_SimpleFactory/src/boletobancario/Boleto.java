/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletobancario;

/**
 *
 * @author jeffe
 */
public abstract class Boleto {
    
    protected double valor;
    protected double juros;
    protected double desconto;
    protected double multa;

    public double calcularJuros(){
        return this.valor*this.juros;
    }
    
    public double calcularDesconto(){
        return this.valor*this.desconto;
    }
    
    public double calcularMulta(){
        return this.valor*this.multa;
    }
}
