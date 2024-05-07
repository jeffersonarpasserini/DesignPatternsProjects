/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package boleto.familia;

import boleto.configuraDesconto.Desconto;
import boleto.configuraJuros.Juros;
import boleto.configuraMulta.Multa;

/**
 *
 * @author jeffe
 */
public interface CalculosFactory {
    
    public Juros criarJuros();
    public Desconto criarDesconto();
    public Multa criarMulta();
    
}
