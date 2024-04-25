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
public class BancoDoBrasilBoleto30Dias extends Boleto {

    public BancoDoBrasilBoleto30Dias(double valor) {
        this.valor=valor;
        this.juros = 0.05;
        this.desconto=0.02;
        this.multa=0.05;
    }
    
}
