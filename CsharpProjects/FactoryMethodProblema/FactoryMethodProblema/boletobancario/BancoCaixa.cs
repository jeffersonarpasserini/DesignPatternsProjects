using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryMethodProblema.boletobancario
{
    public class BancoCaixa
    {
        public Boleto gerarBoleto(int vencimento, double valor)
        {
            Boleto boleto;
            switch (vencimento) {
                case 10:
                    boleto = new BancoCaixaBoleto10Dias(valor);
                    break;
                case 30:
                    boleto = new BancoCaixaBoleto30Dias(valor);
                    break;
                case 60:
                    boleto = new BancoCaixaBoleto60Dias(valor);
                    break;
                default:
                    throw new Exception("Vencimento indisponível");
            }
            Console.WriteLine("Boleto gerado com sucesso no valor de R$" + valor);
            Console.WriteLine("Valor Juros R$" + boleto.calcularJuros());
            Console.WriteLine("Valor Multa R$" + boleto.calcularMulta());
            Console.WriteLine("Valor Desconto R$" + boleto.calcularDesconto());
            Console.WriteLine("--------------------------------------------------------------");
            return boleto;
        }

    }
}
