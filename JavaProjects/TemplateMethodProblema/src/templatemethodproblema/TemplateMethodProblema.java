/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethodproblema;

import gatewayPagamento.Gateway;
import pagamento.PagamentoCredito;
import pagamento.PagamentoDebito;
import pagamento.PagamentoDinheiro;
/**
 *
 * @author jeffe
 */
public class TemplateMethodProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = 100;
        Gateway gateway = new Gateway();
        System.out.println("Crédito");
        PagamentoCredito pgCred = new PagamentoCredito(valor, gateway);
        pgCred.realizarCobranca();
        System.out.println("Débito");
        PagamentoDebito pgDeb = new PagamentoDebito(valor, gateway);
        pgDeb.realizarCobranca();
        System.out.println("Dinheiro");
        PagamentoDinheiro pgDin = new PagamentoDinheiro(valor, gateway);
        pgDin.realizarCobranca();
    }
}
