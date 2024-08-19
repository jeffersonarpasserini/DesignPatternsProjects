using CommandSolucao.devices;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandSolucao.Commands
{
    public class LigarArCondicionado : Command
    {
        private ArCondicionado arCondicionado;

        public LigarArCondicionado(ArCondicionado arCondicionado)
        {
            this.arCondicionado = arCondicionado;
        }

        public void desfazer()
        {
            //no método desfazer, chamar o método desligar
            this.arCondicionado.desligar();
            //chamar o método toString() para feedback
            this.arCondicionado.toString();
        }

        public void executar()
        {
            //no método desfazer, chamar o método ligar
            this.arCondicionado.ligar();
            //chamar o método toString() para feedback
            this.arCondicionado.toString();
        }
    }
}
