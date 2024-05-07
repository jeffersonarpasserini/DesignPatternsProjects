/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto;

import boleto.configuraDesconto.Desconto;
import boleto.configuraJuros.Juros;
import boleto.configuraMulta.Multa;
import boleto.familia.CalculosFactory;

/**
 *
 * @author jeffe
 */
public class Boleto {
    
    protected double valor;
    protected Juros juros;
    protected Desconto desconto;
    protected Multa multa;
    
    public Boleto(double valor, CalculosFactory factory)
    {
        this.valor = valor;
        this.juros = factory.criarJuros();
        this.desconto = factory.criarDesconto();
        this.multa = factory.criarMulta();
    }

    public double calcularJuros()
    {
        return this.valor * this.juros.getJuros();
    }

    public double calcularDesconto()
    {
        return this.valor * this.desconto.getDesconto();
    }

    public double calcularMulta()
    {
        return this.valor * this.multa.getMulta();
    }
    
}
