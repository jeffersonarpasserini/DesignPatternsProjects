
using System.Security.AccessControl;
using System.Threading.Channels;
using VisitorSolucao.ElementoConcreto;
using VisitorSolucao.Visitor;

Supermercado supermercado = new Supermercado("Supermercado da Esquina");

Departamento departamento01 = new Departamento("Alimentação básica");
Produto arroz = new Produto("Arroz 5kg", 18, 30);
Produto macarrao = new Produto("Macarrão", 3.20, 15);

departamento01.addProduto(arroz);
departamento01.addProduto(macarrao);

Departamento departamento02 = new Departamento("Higiene");
Produto papelHigienico = new Produto("Papel Higienico", 11, 35);
Produto sabonete = new Produto("Sabonente", 1.2, 10);

departamento02.addProduto(papelHigienico);
departamento02.addProduto(sabonete);

supermercado.addDepartamento(departamento01);
supermercado.addDepartamento(departamento02);

//calcula lucratividade
Lucratividade visitorLucratividade = new Lucratividade();

//passagem do visitor pelo metodo acessar() do supermercado, departamentos e produtos

Console.WriteLine($"----- Margem Produtos - {departamento01.nome} ------");
Console.WriteLine($"Produto: {arroz.nome} - lucro: {arroz.aceitar(visitorLucratividade)}");
Console.WriteLine($"Produto: {macarrao.nome} - lucro: {macarrao.aceitar(visitorLucratividade)}");

Console.WriteLine($"--- Margem lucro do {departamento01.nome}");
Console.WriteLine($"Lucro do Departamento: {departamento01.aceitar(visitorLucratividade)}");


Console.WriteLine($"----- Margem Produtos - {departamento02.nome} ------");
Console.WriteLine($"Produto: {papelHigienico.nome} - lucro: {papelHigienico.aceitar(visitorLucratividade)}");
Console.WriteLine($"Produto: {sabonete.nome} - lucro: {sabonete.aceitar(visitorLucratividade)}");

Console.WriteLine($"--- Margem lucro do {departamento02.nome}");
Console.WriteLine($"Lucro do Departamento: {departamento02.aceitar(visitorLucratividade)}");

Console.WriteLine($"--- Margem lucro do {supermercado.nome}");
Console.WriteLine($"Lucro do Supermercado: {supermercado.aceitar(visitorLucratividade)}");
