/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterproblema;

import Cobranca.Cobranca;
import Pagamento.PagFacil;

/**
 *
 * @author jeffe
 */
public class AdapterProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Configura a Cobranca");

        Cobranca cobranca = new Cobranca();
        cobranca.setValor(100);
        cobranca.setNumeroCartao("999999999999");
        cobranca.setCVV("163");
        cobranca.setGateway(new PagFacil());
        cobranca.validarCartao();
        cobranca.realizarPagamento();

    }
    
}
