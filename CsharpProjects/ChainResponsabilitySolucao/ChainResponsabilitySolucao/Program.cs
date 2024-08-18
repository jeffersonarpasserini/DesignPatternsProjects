// See https://aka.ms/new-console-template for more information
using ChainResponsabilitySolucao.CalculadoraPontos;
using ChainResponsabilitySolucao.Pedido;

PedidoLanche pedido = new PedidoLanche(21);
CalculadoraDePontos calcPontos = new CalculadoraDePontos();

Console.Write("Até do dia 15 - Pontos -> ");
Console.WriteLine(calcPontos.calcularPontos(pedido, 15));
Console.Write("A partir do dia 16 - Pontos -> ");
Console.WriteLine(calcPontos.calcularPontos(pedido, 16));

pedido.valor = 100;
Console.Write("Até do dia 15 - Pontos -> ");
Console.WriteLine(calcPontos.calcularPontos(pedido, 15));
Console.Write("A partir do dia 16 - Pontos -> ");
Console.WriteLine(calcPontos.calcularPontos(pedido, 16));
