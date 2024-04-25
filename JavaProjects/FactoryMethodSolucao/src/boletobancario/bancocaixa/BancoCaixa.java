/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletobancario.bancocaixa;

import boletobancario.Banco;
import boletobancario.Boleto;

/**
 *
 * @author jeffe
 */
public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimento, double valor){
        Boleto boleto = null;
        switch (vencimento) {
            case 10:
                boleto = new BancoCaixaBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoCaixaBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoCaixaBoleto60Dias(valor);
                break;
            default:
            {
                try {
                    throw new Exception("Vencimento indisponível");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return boleto;
    }
}
