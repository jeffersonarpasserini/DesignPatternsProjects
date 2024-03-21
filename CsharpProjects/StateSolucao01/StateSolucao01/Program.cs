// See https://aka.ms/new-console-template for more information
using StateSolucao01.domains;
try
{
    Console.WriteLine("---------- Pedido 01 ------------------");
    //Faça seus teste aqui!!!
    Pedido pedido = new Pedido();
    pedido.sucessoAoPagar();
    pedido.despacharPedido();

    Console.WriteLine("---------- Pedido 02 ------------------");
    Pedido pedido2 = new Pedido();
    pedido2.sucessoAoPagar();
    pedido2.despacharPedido();
    pedido2.cancelarPedido();


} catch (Exception e)
{
    Console.WriteLine(e.Message);
}
