/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletobancario;

/**
 *
 * @author jeffe
 */
public class BancoCaixa {
    
    private BoletoSimpleFactory boletoSimpleFactory;

    public BancoCaixa(BoletoSimpleFactory boletoSimpleFactory) {
        this.boletoSimpleFactory = boletoSimpleFactory;
    }
    
    public void gerarBoleto(int vencimento, double valor) throws Exception{
        Boleto boleto = this.boletoSimpleFactory.criarBoleto(vencimento, valor);
        
        System.out.println("Boleto gerado com sucesso no valor de R$"+valor);
        System.out.println("Valor Juros R$"+boleto.calcularJuros());
        System.out.println("Valor Multa R$"+boleto.calcularMulta());
        System.out.println("Valor Desconto R$"+boleto.calcularDesconto());
        System.out.println("--------------------------------------------------------------");
    }
    
}
