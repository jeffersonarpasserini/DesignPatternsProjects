/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethodsolucao;

import gatewayPagamento.Gateway;
import metodoPagamento.PagamentoCredito;
import metodoPagamento.PagamentoDebito;
import metodoPagamento.PagamentoDinheiro;

/**
 *
 * @author jeffe
 */
public class TemplateMethodSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = 1000;
        Gateway gateway = new Gateway();
        
        System.out.println("Crédito");
        PagamentoCredito pgCred = 
            new PagamentoCredito(valor, gateway);
        pgCred.realizarCobranca();
        
        System.out.println("Débito");
        PagamentoDebito pgDeb = 
            new PagamentoDebito(valor, gateway);
        pgDeb.realizarCobranca();
        
        System.out.println("Dinheiro");
        PagamentoDinheiro pgDin = 
            new PagamentoDinheiro(valor, gateway);
        pgDin.realizarCobranca();
    }
    
}
