
using StrategyExemplo04.Fretes;
using StrategyExemplo04.Pedidos;

try
{
    //criação dos tipos de frete
    Frete freteComum = new FreteComum();
    Frete freteExpresso = new FreteExpresso();


    //Cria pedido de eletronicos
    Pedido pedidoEletro = new PedidoEletronicos();
    //define valor do pedido
    pedidoEletro.valor = 100;
    //define o tipo de frete
    pedidoEletro.tipoFrete = freteComum;
    //Calcula frete comum
    Console.WriteLine("Frete Comum " + pedidoEletro.nomeSetor + " R$" + pedidoEletro.calculaFrete());

    //altera o tipo de frete
    pedidoEletro.tipoFrete = freteExpresso;
    //calcula frete expresso
    Console.WriteLine("Frete Comum " + pedidoEletro.nomeSetor + " R$" + pedidoEletro.calculaFrete());

}
catch (Exception e)
{
    Console.WriteLine(e.ToString());
}
