/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeffe
 */
public interface Gateway {
    
    public void setValor(double valor);
    public void setParcelas(int parcelas);
    public void setNumeroCartao(String numeroCartao);
    public void setCVV(String cvv);
    public boolean validarCartao();
    public boolean realizarPagamento();
    
}
