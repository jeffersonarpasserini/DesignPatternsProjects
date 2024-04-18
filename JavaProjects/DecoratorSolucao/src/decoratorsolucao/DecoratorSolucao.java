/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorsolucao;

import Produto.BordaRequeijao;
import Produto.MassaIntegral;
import Produto.Pizza;
import Produto.PizzaQueijo;

/**
 *
 * @author jeffe
 */
public class DecoratorSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cria uma pizza de queijo");
        Pizza pizzaQueijo = new PizzaQueijo();
        System.out.println("Produto --> "+pizzaQueijo.getDescricao()+
                " Valor R$"+pizzaQueijo.getPreco());
        
        System.out.println(" ");
        System.out.println("Adiciona borda de requeijao");
        Pizza pizzaQueijoBorda = new BordaRequeijao(pizzaQueijo);
        System.out.println("Produto --> "+pizzaQueijoBorda.getDescricao()+
                " Valor R$"+pizzaQueijoBorda.getPreco());
        
        System.out.println(" ");
        System.out.println("Adiciona Massa Integral");
        Pizza pizzaQueijoBordaMassaIntegral = new MassaIntegral(pizzaQueijoBorda);
        System.out.println("Produto --> "+pizzaQueijoBordaMassaIntegral.getDescricao()+
                " Valor R$"+pizzaQueijoBordaMassaIntegral.getPreco());
    } 
}
