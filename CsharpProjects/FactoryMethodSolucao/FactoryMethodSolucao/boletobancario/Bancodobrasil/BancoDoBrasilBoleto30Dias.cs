﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FactoryMethodSolucao.boletobancario;

namespace FactoryMethodSolucao.boletobancario.Bancodobrasil
{
    public class BancoDoBrasilBoleto30Dias : Boleto
    {
        public BancoDoBrasilBoleto30Dias(double valor)
        {
            this.valor = valor;
            juros = 0.05;
            desconto = 0.02;
            multa = 0.05;
        }
    }
}