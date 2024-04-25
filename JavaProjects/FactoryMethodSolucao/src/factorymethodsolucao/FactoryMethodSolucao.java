/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethodsolucao;

import boletobancario.Banco;
import boletobancario.bancocaixa.BancoCaixa;
import boletobancario.bancodobrasil.BancoDoBrasil;

/**
 *
 * @author jeffe
 */
public class FactoryMethodSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Banco Caixa --------------------------------");
        Banco bancoCaixa = new BancoCaixa();
        bancoCaixa.gerarBoleto(10, 100);
        bancoCaixa.gerarBoleto(30, 100);
        bancoCaixa.gerarBoleto(60, 100);
        
        System.out.println("Banco do Brasil --------------------------------");
        Banco bancoDoBrasil = new BancoDoBrasil();
        bancoDoBrasil.gerarBoleto(10, 100);
        bancoDoBrasil.gerarBoleto(30, 100);
        bancoDoBrasil.gerarBoleto(60, 100);
    }
    
}
