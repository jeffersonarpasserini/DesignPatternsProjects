using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo03.Pedido
{
    public abstract class Pedido
    {
        public double valor { get; set; }
        public string? nomeSetor { get; set; }

        public abstract double calculaFreteComum();
        public abstract double calculaFreteExpresso();

    }
}
