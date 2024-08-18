// See https://aka.ms/new-console-template for more information
using ChainResponsabilityProblema.CalculadoraPontos;
using ChainResponsabilityProblema.Pedido;

PedidoLanche pedido = new PedidoLanche(21);
CalculadorDePontos calcPontos = new CalculadorDePontos();

Console.Write("Até do dia 15 - Pontos -> ");
Console.WriteLine(calcPontos.CalcularPontos(pedido,15));
Console.Write("A partir do dia 16 - Pontos -> ");
Console.WriteLine(calcPontos.CalcularPontos(pedido, 16));

pedido.valor = 100;
Console.Write("Até do dia 15 - Pontos -> ");
Console.WriteLine(calcPontos.CalcularPontos(pedido, 15));
Console.Write("A partir do dia 16 - Pontos -> ");
Console.WriteLine(calcPontos.CalcularPontos(pedido, 16));
