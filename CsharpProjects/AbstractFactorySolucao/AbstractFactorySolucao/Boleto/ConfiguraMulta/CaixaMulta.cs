﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactorySolucao.Boleto.ConfiguraMulta
{
    public class CaixaMulta : Multa
    {
        public double getMulta()
        {
            return 0.05;
        }
    }
}
