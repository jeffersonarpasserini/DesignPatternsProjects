/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

/**
 *
 * @author jeffe
 */
public class TopPagamentos {
    
    final double taxaPagamento = 5;
    final double juroMensal = 0.1;

    public double valorTotal;
    public int quantidadeParcelas;
    public String numeroCartao;
    public String cvv;

    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas)
    {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public void setCartao(String cartao, String cvv)
    {
        this.cvv = cvv;
        this.numeroCartao = cartao;
    }

    public boolean realizarPagamento()
    {
        return true;
    }
}
