using CommandSolucao.devices;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandSolucao.Commands
{
    public class LigarLampada : Command
    {
        private Lampada lampada;

        public LigarLampada(Lampada lampada)
        {
            this.lampada = lampada;
        }

        public void desfazer()
        {
            //no método desfazer, chamar o método desligar
            this.lampada.desligar();
            //chamar o método toString() para feedback
            this.lampada.toString();
        }

        public void executar()
        {
            //no método desfazer, chamar o método ligar
            this.lampada.ligar();
            //chamar o método toString() para feedback
            this.lampada.toString();
        }
    }
}
