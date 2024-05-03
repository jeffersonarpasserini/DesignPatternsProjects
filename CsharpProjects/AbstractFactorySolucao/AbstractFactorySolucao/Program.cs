using AbstractFactorySolucao.Boleto;
using AbstractFactorySolucao.Boleto.Familia;

Banco banco = new Banco();

CaixaCalculosFactory factoryCaixa = new CaixaCalculosFactory();

BBCalculosFactory factoryBB = new BBCalculosFactory();

Console.WriteLine("cria boleto caixa");
banco.gerarBoleto(100, factoryCaixa);

Console.WriteLine("cria boleto BB");
banco.gerarBoleto(100, factoryBB);