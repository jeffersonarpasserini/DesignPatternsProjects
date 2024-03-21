using ObserverSolucao.Observers;
using ObserverSolucao.Subjects;

//criação Newsletter (subject)
Newsletter newsletter = new Newsletter();

//criação funcionarios
Funcionario funcionario1 = new Funcionario("Func01", "func01@teste.com");
newsletter.registerObserver(funcionario1);
Funcionario funcionario2 = new Funcionario("Func02", "func02@teste.com");
newsletter.registerObserver(funcionario2);

//cricao cliente
Cliente cliente = new Cliente("Cli01", "cli01@teste.com");
newsletter.registerObserver(cliente);

//criacao parceiro
Parceiro parceiro = new Parceiro("Parca01", "parca01@teste.com");
newsletter.registerObserver(parceiro);

//criacao fornecedor
Fornecedor fornecedor = new Fornecedor("forn01", "forn01@teste.com");
newsletter.registerObserver(fornecedor);

//envio primeira mensagem
Console.WriteLine("--------------TESTE PRIMEIRA MENSAGEM--------------------------------------");
newsletter.addMessage("Primeira Mensagem");

newsletter.removeObserver(funcionario2);

Console.WriteLine("--------------TESTE SEGUNDA MENSAGEM--------------------------------------");
newsletter.addMessage("Segunda mensagem");

newsletter.registerObserver(funcionario2);

Console.WriteLine("--------------TESTE TERCEIRA MENSAGEM--------------------------------------");
newsletter.addMessage("Terceira mensagem");


