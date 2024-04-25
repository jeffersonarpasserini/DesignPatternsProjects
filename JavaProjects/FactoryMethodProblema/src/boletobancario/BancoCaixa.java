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
    
    public Boleto gerarBoleto(int vencimento, double valor) throws Exception{
        Boleto boleto;
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
                throw new Exception("Vencimento indisponível");
        }
        
        System.out.println("Boleto gerado com sucesso no valor de R$"+valor);
        System.out.println("Valor Juros R$"+boleto.calcularJuros());
        System.out.println("Valor Multa R$"+boleto.calcularMulta());
        System.out.println("Valor Desconto R$"+boleto.calcularDesconto());
        System.out.println("--------------------------------------------------------------");
        
        return boleto;
    }
}
