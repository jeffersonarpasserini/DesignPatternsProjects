using CommandSolucao.devices;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandSolucao.Commands
{
    public class MudarTemperaturaArCondicionado : Command
    {
        private ArCondicionado arCondicionado;
        private int temperatura;
        private int temperaturaAnterior;

        public MudarTemperaturaArCondicionado(ArCondicionado arCondicionado)
        {
            this.arCondicionado = arCondicionado;
            this.temperatura = arCondicionado.getTemperatura();
        }

        public void setTemperatura(int temperatura)
        {
            this.temperaturaAnterior = this.temperatura;
            this.temperatura = temperatura;
        }

        public void desfazer()
        {
            //no método desfazer, seta a temp. anterior
            this.arCondicionado.setTemperatura(this.temperaturaAnterior);
            //chamar o método toString() para feedback
            this.arCondicionado.toString();
        }

        public void executar()
        {
            //no método executar, seta a temp.
            this.arCondicionado.setTemperatura(this.temperatura);
            //chamar o método toString() para feedback
            this.arCondicionado.toString();
        }

    }
}
