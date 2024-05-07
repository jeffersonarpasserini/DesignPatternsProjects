/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactorysolucao;

import boleto.Banco;
import boleto.familia.BBCalculosFactory;
import boleto.familia.CaixaCalculosFactory;
import boleto.familia.CalculosFactory;

/**
 *
 * @author jeffe
 */
public class AbstractFactorySolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco();

        CalculosFactory factoryCaixa = new CaixaCalculosFactory();

        CalculosFactory factoryBB = new BBCalculosFactory();

        System.out.println("cria boleto caixa");
        banco.gerarBoleto(100, factoryCaixa);

        System.out.println("cria boleto BB");
        banco.gerarBoleto(100, factoryBB);
    }
    
}
