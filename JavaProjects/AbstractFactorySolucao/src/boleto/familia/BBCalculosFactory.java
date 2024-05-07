/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto.familia;

import boleto.configuraDesconto.BBDesconto;
import boleto.configuraDesconto.Desconto;
import boleto.configuraJuros.BBJuros;
import boleto.configuraJuros.Juros;
import boleto.configuraMulta.BBMulta;
import boleto.configuraMulta.Multa;

/**
 *
 * @author jeffe
 */
public class BBCalculosFactory implements CalculosFactory {

    @Override
    public Juros criarJuros() {
        return new BBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new BBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new BBMulta();
    }
    
}
