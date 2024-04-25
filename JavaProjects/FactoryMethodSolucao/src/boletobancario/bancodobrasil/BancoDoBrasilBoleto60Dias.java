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
public class BancoDoBrasilBoleto60Dias extends Boleto {

    public BancoDoBrasilBoleto60Dias(double valor) {
        this.valor=valor;
        this.juros = 0.1;
        this.desconto=0;
        this.multa=0.15;
    }
}
