/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatewayPagamento;

import java.util.Random;
/**
 *
 * @author jeffe
 */
public class Gateway {
    
    public Boolean cobrar(double valor){
        Boolean[] respostas = {true, false};
        //imprime valor cobrado
        System.out.println("Valor Cobrado: R$"+valor);
        return respostas[new Random().nextInt(2)];
    }
    
}
