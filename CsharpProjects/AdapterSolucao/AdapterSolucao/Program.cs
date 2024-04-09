// See https://aka.ms/new-console-template for more information
using AdapterSolucao.Adapter;
using AdapterSolucao.Cobranca;
using AdapterSolucao.Pagamento;

Console.WriteLine("Configura a Cobranca");
Cobranca cobranca = new Cobranca();
cobranca.setValor(100);
cobranca.setNumeroCartao("999999999999");
cobranca.setCVV("163");
//teste PagFacil
cobranca.setGateway(new PagFacilAdapter());
cobranca.validarCartao();
cobranca.realizarPagamento();

//teste TopPagamentos
//teste PagFacil
cobranca.setGateway(new TopPagamentosAdapter());
cobranca.validarCartao();
cobranca.realizarPagamento();
