/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cobranca;

import Adapter.Gateway;
import Pagamento.PagFacil;

/**
 *
 * @author jeffe
 */
public class Cobranca implements Gateway {
    
    public Gateway gateway;
    public double valor;
    public int parcelas;
    public String numeroCartao;
    public String cvv;

    public Cobranca() { }

    public void setGateway(Gateway gateway)
    {
        this.gateway = gateway;
        gateway.setValor(valor);
        gateway.setNumeroCartao(numeroCartao);
        gateway.setCVV(cvv);
        gateway.setParcelas(parcelas);
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public void setParcelas(int parcelas)
    {
        this.parcelas = parcelas;
    }

    public void setNumeroCartao(String numeroCartao)
    {
        this.numeroCartao = numeroCartao;
    }

    public void setCVV(String cvv)
    {
        this.cvv = cvv;
    }

    public boolean validarCartao()
    {
        boolean valida = false;

        if (gateway.validarCartao() == true)
        {
            System.out.println("Cartão validado com sucesso");
            valida = true;
        } else
        {
            System.out.println("Cartão invalido");
        }
        return valida;
    }

    public boolean realizarPagamento()
    {
        boolean realiza = false;

        if (gateway.realizarPagamento() == true)
        {
            System.out.println("Aprovado");
            realiza = true;
        } else
        {
            System.out.println("Recusado");
        }
        return realiza;
    }
    
}
