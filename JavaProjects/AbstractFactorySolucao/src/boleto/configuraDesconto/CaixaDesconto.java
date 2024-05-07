/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto.configuraDesconto;

/**
 *
 * @author jeffe
 */
public class CaixaDesconto implements Desconto{

    @Override
    public double getDesconto() {
        return 0.1;
    }
    
}
