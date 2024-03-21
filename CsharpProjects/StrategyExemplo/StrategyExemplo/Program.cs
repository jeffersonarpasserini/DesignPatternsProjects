using StrategyExemplo.Pedidos;

//criação do pedido
Pedido pedido = new Pedido();

//atribuição do valor
pedido.valor = 100;

//calculo para frete comum
Console.WriteLine("Frete Comum: R$"+pedido.calculaFreteComum());
//calculo para frete
Console.WriteLine("Frete Expresso: R$"+pedido.calculaFreteExpresso());


