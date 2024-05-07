/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto;

import boleto.familia.CalculosFactory;

/**
 *
 * @author jeffe
 */
public class Banco {
    
     public Boleto gerarBoleto(double valor, CalculosFactory factory)
    {
        Boleto boleto = new Boleto(valor,factory);

        System.out.println("Boleto gerado com sucesso no valor de R$" + valor);
        System.out.println("Valor Juros R$" + boleto.calcularJuros());
        System.out.println("Valor Multa R$" + boleto.calcularMulta());
        System.out.println("Valor Desconto R$" + boleto.calcularDesconto());
        System.out.println("--------------------------------------------------");

        return boleto;
    }
    
}
