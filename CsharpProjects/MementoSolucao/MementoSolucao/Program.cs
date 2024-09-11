using MementoSolucao;

Historico historio = new Historico();

//cria uma textbox
TextBox textBox = new TextBox(2,10,"Texto versao 01", "monospace",
    15, "center","bold");

//salva a posicao atual
historio.criarCheckPoint(textBox);

//altera o texto para nova versáo da checkbox
textBox.text = "Texto versão 02";

//salva a posicao atual
historio.criarCheckPoint(textBox);

//altera outro valor posicao x e y
textBox.x = 100;
textBox.y = 200;

//versao atual - x 100, y 200 e text - texto versao02
Console.WriteLine("Ultima atualização");
historio.imprimir();
historio.desfazer();

//versao anterior - x 2, y 10, text - texto versao02
Console.WriteLine("Versão anterior");
historio.imprimir();
historio.desfazer();

//primeira versáo - x 2, y 10  - text - texto versao01
Console.WriteLine("Primeira versão");
historio.imprimir();





