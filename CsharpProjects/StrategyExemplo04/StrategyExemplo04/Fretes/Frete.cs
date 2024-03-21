using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrategyExemplo04.Fretes
{
    public interface Frete
    {
        public double calcula(double valorPedido);
    }
}
