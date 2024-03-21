using StrategyExemplo03.Pedido;

try
{
    //Cria pedido de eletronicos
    Pedido pedidoEletro = new PedidoEletronicos();
    //define valor do pedido
    pedidoEletro.valor = 100;
    //Calcula frete comum
    Console.WriteLine("Frete Comum " + pedidoEletro.nomeSetor + " R$" + pedidoEletro.calculaFreteComum());
    //calcula frete expresso
    Console.WriteLine("Frete Comum " + pedidoEletro.nomeSetor + " R$" + pedidoEletro.calculaFreteExpresso());

    //Cria pedido de moveis
    Pedido pedidoMoveis = new PedidoMoveis();
    //define valor do pedido
    pedidoMoveis.valor = 100;
    //Calcula frete comum
    Console.WriteLine("Frete Comum " + pedidoMoveis.nomeSetor + " R$" + pedidoMoveis.calculaFreteComum());
    //calcula frete expresso
    Console.WriteLine("Frete Expresso " + pedidoMoveis.nomeSetor + " R$" + pedidoMoveis.calculaFreteExpresso());

}
catch (Exception e)
{
    Console.WriteLine(e.ToString());
}
