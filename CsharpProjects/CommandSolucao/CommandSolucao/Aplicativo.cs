using CommandSolucao.Commands;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandSolucao
{
    public class Aplicativo
    {
        private List<Command> comandos = new List<Command>();

        //para um comando ser adicionado a lista de comandos
        //do app ele precisa implementar a interface command,
        //assim sabemos que ele possui o método executar.
        public int setComando(Command comando)
        {
            //adiciona o comando na ultima posição
            this.comandos.Add(comando);
            //retorna para o cliente a posição do array em que foi
            //inserido.
            return comandos.Count-1;
        }

        //metodo que será chamado sempre sera q um botão for press.
        //na interface do app. passando o indice a ser executado.
        public void aoPrecionarBotao(int id) 
        {
            this.comandos[id].executar();
        }

        //metodo sera chamado sempre que o botão for pressionado
        //duas vezes rapidamente na interface do app.
        //precisa passar o indice do comando a ser desfeito
        public void duploCliqueBotao(int id)
        {
            this.comandos[id].desfazer();
        }

        //retorna um comando do app.
        public Command getCommando(int id)
        {
            return this.comandos[id];
        }
    }
}
