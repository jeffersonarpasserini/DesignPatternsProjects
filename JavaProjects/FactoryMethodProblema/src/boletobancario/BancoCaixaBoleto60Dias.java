/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletobancario;

/**
 *
 * @author jeffe
 */
public class BancoCaixaBoleto60Dias extends Boleto {

    public BancoCaixaBoleto60Dias(double valor) {
        this.valor=valor;
        this.juros = 0.1;
        this.desconto=0;
        this.multa=0.2;
    }
}
