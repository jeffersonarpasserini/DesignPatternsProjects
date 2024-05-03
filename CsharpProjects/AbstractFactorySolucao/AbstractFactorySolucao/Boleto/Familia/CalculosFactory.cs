using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactorySolucao.Boleto.ConfiguraJuros;
using AbstractFactorySolucao.Boleto.ConfiguraDesconto;
using AbstractFactorySolucao.Boleto.ConfiguraMulta;

namespace AbstractFactorySolucao.Boleto.Familia
{
    public interface CalculosFactory
    {
        public Juros criarJuros();
        public Desconto criarDesconto();
        public Multa criarMulta();

    }
}
