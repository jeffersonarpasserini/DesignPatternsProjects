// See https://aka.ms/new-console-template for more information
using AdapterProblema.Cobranca;
using AdapterProblema.Pagamento;

Console.WriteLine("Configura a Cobranca");

Cobranca cobranca = new Cobranca();
cobranca.setValor(100);
cobranca.setNumeroCartao("999999999999");
cobranca.setCVV("163");
cobranca.setGateway(new PagFacil());
cobranca.validarCartao();
cobranca.realizarPagamento();
