using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FactoryMethodSolucao.boletobancario;

namespace FactoryMethodSolucao.boletobancario.Bancodobrasil
{
    public class BancoDoBrasilBoleto60Dias : Boleto
    {
        public BancoDoBrasilBoleto60Dias(double valor)
        {
            this.valor = valor;
            juros = 0.1;
            desconto = 0;
            multa = 0.15;
        }
    }
}
