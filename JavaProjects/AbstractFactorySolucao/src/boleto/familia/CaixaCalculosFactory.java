/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto.familia;

import boleto.configuraDesconto.CaixaDesconto;
import boleto.configuraDesconto.Desconto;
import boleto.configuraJuros.CaixaJuros;
import boleto.configuraJuros.Juros;
import boleto.configuraMulta.CaixaMulta;
import boleto.configuraMulta.Multa;

/**
 *
 * @author jeffe
 */
public class CaixaCalculosFactory implements CalculosFactory{

    @Override
    public Juros criarJuros() {
        return new CaixaJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta();
    }
    
}
