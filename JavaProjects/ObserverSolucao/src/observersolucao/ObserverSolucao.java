/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observersolucao;

import observers.Cliente;
import observers.Fornecedor;
import observers.Funcionario;
import observers.Parceiro;
import subjects.Newsletter;

/**
 *
 * @author jeffe
 */
public class ObserverSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criação Newsletter (subject)
        Newsletter newsletter = new Newsletter();
        //criação funcionarios
        Funcionario funcionario1 = new Funcionario("Func01", "func01@teste.com");
        newsletter.registerObserver(funcionario1);
        Funcionario funcionario2 = new Funcionario("Func02", "func02@teste.com");
        newsletter.registerObserver(funcionario2);
        //cricao cliente
        Cliente cliente = new Cliente("Cli01", "cli01@teste.com");
        newsletter.registerObserver(cliente);
        //criacao parceiro
        Parceiro parceiro = new Parceiro("Parca01", "parca01@teste.com");
        newsletter.registerObserver(parceiro);
        //criacao fornecedor
        Fornecedor fornecedor = new Fornecedor("forn01", "forn01@teste.com");
        newsletter.registerObserver(fornecedor);

        //envio primeira mensagem
        System.out.println("--------------TESTE PRIMEIRA MENSAGEM--------------------------------------");
        newsletter.addMessage("Primeira Mensagem");

        newsletter.removeObserver(funcionario2);
        System.out.println("--------------TESTE SEGUNDA MENSAGEM--------------------------------------");
        newsletter.addMessage("Segunda mensagem");

        newsletter.registerObserver(funcionario2);
        System.out.println("--------------TESTE TERCEIRA MENSAGEM--------------------------------------");
        newsletter.addMessage("Terceira mensagem");
    }
}
