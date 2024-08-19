using CommandSolucao;
using CommandSolucao.devices;
using CommandSolucao.Commands;

//criando dispositivos
Lampada lampadaSala = new Lampada("Lampada Sala", false);
Lampada lampadaQuarto = new Lampada("Lampada Quarto", false);
ArCondicionado ar = new ArCondicionado("Ar Condicionado", false, 26);

//criar app
Aplicativo meuApp = new Aplicativo();

//criar comandos
Command ligarLampadaSala = new LigarLampada(lampadaSala);
Command desligarLampadaSala = new DesligarLampada(lampadaSala);

Command ligarLampadaQuarto = new LigarLampada(lampadaQuarto);
Command desligarLampadaQuarto = new DesligarLampada(lampadaQuarto);

Command ligarAr = new LigarArCondicionado(ar);
Command desligarAr = new DesligarArCondicionado(ar);
Command mudarTemperatura = new MudarTemperaturaArCondicionado(ar);

//armazenar comandos no app
//os ids recebem o indice do comando adicionado no app

int idLigarLampadaSala = meuApp.setComando(ligarLampadaSala);
int idDesligarLampadaSala = meuApp.setComando(desligarLampadaSala);

int idLigarLampadaQuarto = meuApp.setComando(ligarLampadaQuarto);
int idDesligarLampadaQuarto = meuApp.setComando(desligarLampadaQuarto);

int idLigarAr = meuApp.setComando(ligarAr);
int idDesligarAr = meuApp.setComando(desligarAr);
int idMudarTemperatura = meuApp.setComando(mudarTemperatura);

//vamos executar os comandos.
meuApp.aoPrecionarBotao(idLigarLampadaSala);
meuApp.aoPrecionarBotao(idDesligarLampadaSala);

meuApp.aoPrecionarBotao(idLigarLampadaQuarto);
meuApp.aoPrecionarBotao(idDesligarLampadaQuarto);

meuApp.aoPrecionarBotao(idLigarAr);
//é necessário utilizar um Cast para transformar a interface Command na Classe Comando.
((MudarTemperaturaArCondicionado)meuApp.getCommando(idMudarTemperatura)).setTemperatura(25);
meuApp.aoPrecionarBotao(idMudarTemperatura);
meuApp.aoPrecionarBotao(idDesligarAr);

//desfazer
meuApp.duploCliqueBotao(idDesligarAr);
meuApp.duploCliqueBotao(idMudarTemperatura);
meuApp.duploCliqueBotao(idLigarAr);
meuApp.duploCliqueBotao(idDesligarLampadaQuarto);







