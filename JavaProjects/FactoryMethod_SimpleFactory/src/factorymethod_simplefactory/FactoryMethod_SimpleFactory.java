/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod_simplefactory;

import boletobancario.BancoCaixa;
import boletobancario.BoletoSimpleFactory;

/**
 *
 * @author jeffe
 */
public class FactoryMethod_SimpleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BancoCaixa bancoCaixa = new BancoCaixa(new BoletoSimpleFactory());
        bancoCaixa.gerarBoleto(10, 100);
        bancoCaixa.gerarBoleto(30, 100);
        bancoCaixa.gerarBoleto(60, 100);
    }
    
}
