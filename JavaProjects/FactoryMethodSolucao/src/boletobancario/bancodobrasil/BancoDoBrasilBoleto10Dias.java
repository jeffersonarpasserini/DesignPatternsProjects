/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletobancario.bancodobrasil;

import boletobancario.Boleto;

/**
 *
 * @author jeffe
 */
public class BancoDoBrasilBoleto10Dias extends Boleto {

    public BancoDoBrasilBoleto10Dias(double valor) {
        this.valor=valor;
        this.juros = 0.03;
        this.desconto=0.05;
        this.multa=0.02;
    } 
}
