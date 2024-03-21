
using StrategyExemplo02.Pedidos;

//Cria pedido de eletronicos
Pedido pedidoEletro = new PedidoEletronicos();
//define valor do pedido
pedidoEletro.valor = 100;
//Calcula frete comum
Console.WriteLine("Frete Comum "+pedidoEletro.nomeSetor+" R$"+pedidoEletro.calculaFreteComum());
//calcula frete expresso
Console.WriteLine("Frete Comum " + pedidoEletro.nomeSetor + " R$" + pedidoEletro.calculaFreteExpresso());

