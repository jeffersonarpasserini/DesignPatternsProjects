/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adaptersolucao;

import Adapter.PagFacilAdapter;
import Adapter.TopPagamentosAdapter;
import Cobranca.Cobranca;
import Pagamento.PagFacil;

/**
 *
 * @author jeffe
 */
public class AdapterSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Configura a Cobranca");

        Cobranca cobranca = new Cobranca();
        cobranca.setValor(100);
        cobranca.setNumeroCartao("999999999999");
        cobranca.setCVV("163");
        //pagfacil
        cobranca.setGateway(new PagFacilAdapter());
        cobranca.validarCartao();
        cobranca.realizarPagamento();
        //toppagamentos
        cobranca.setGateway(new TopPagamentosAdapter());
        cobranca.validarCartao();
        cobranca.realizarPagamento();
    }
    
}
