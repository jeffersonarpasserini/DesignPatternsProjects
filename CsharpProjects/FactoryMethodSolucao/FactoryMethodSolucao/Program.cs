
using FactoryMethodSolucao.boletobancario;
using FactoryMethodSolucao.boletobancario.Bancodobrasil;
using FactoryMethodSolucao.boletobancario.Caixa;

Console.WriteLine("-------------CAIXA---------------");
Banco bancoCaixa = new BancoCaixa();
bancoCaixa.gerarBoleto(10, 100);
bancoCaixa.gerarBoleto(30, 100);
bancoCaixa.gerarBoleto(60, 100);

Console.WriteLine("-------------BANCO DO BRASIL---------------");
Banco bancoBrasil = new BancoDoBrasil();
bancoBrasil.gerarBoleto(10, 100);
bancoBrasil.gerarBoleto(30, 100);
bancoBrasil.gerarBoleto(60, 100);
