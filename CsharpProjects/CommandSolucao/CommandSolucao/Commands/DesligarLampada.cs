using CommandSolucao.devices;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandSolucao.Commands
{
    public class DesligarLampada : Command
    {
        private Lampada lampada;

        public DesligarLampada(Lampada lampada)
        {
            this.lampada = lampada;
        }

        public void desfazer()
        {
            //no método desfazer, chamar o método ligar
            this.lampada.ligar();
            //chamar o método toString() para feedback
            this.lampada.toString();
        }

        public void executar()
        {
            //no método desfazer, chamar o método desligar
            this.lampada.desligar();
            //chamar o método toString() para feedback
            this.lampada.toString();
        }

    }
}
