﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo03.Pedido
{

    public class PedidoMoveis : Pedido
    {
        public PedidoMoveis() 
        {
            this.nomeSetor = "Moveis";
        }

        public override double calculaFreteComum()
        {
            return this.valor * 0.05;
        }

        public override double calculaFreteExpresso()
        {
            throw new Exception("Não é permitido frete expresso");
        }
    }
}
