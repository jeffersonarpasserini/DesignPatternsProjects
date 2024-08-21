
using CompositeSolucao;

//cria pastas
Component raiz = new Pasta("Raiz","/");
Component pasta1 = new Pasta("Pasta 1","pasta1/");
Component pasta2 = new Pasta("Pasta 2","pasta2/");
Component pasta3 = new Pasta("Pasta 3","pasta3/");
Component pasta2_1 = new Pasta("Pasta 2.1","pasta2_1/");

//Adiciona as pasta para montar a hierarquia
raiz.adicionar(pasta1);
raiz.adicionar(pasta2);
raiz.adicionar(pasta3);
pasta2.adicionar(pasta2_1);

//cria os arquivos
Component arquivo01 = new Arquivo("Arquivo01", "/arquivo01");
Component arquivo02 = new Arquivo("Arquivo02", "/arquivo02");
Component arquivo03 = new Arquivo("Arquivo03", "/arquivo03");
Component arquivo04 = new Arquivo("Arquivo04", "/arquivo04");
Component arquivo05 = new Arquivo("Arquivo05", "/arquivo05");
Component arquivo06 = new Arquivo("Arquivo06", "/arquivo06");

//adiciona os arquivos as pastas
pasta1.adicionar(arquivo01);
pasta1.adicionar(arquivo02);
pasta2.adicionar(arquivo03);
pasta2.adicionar(arquivo04);
pasta2_1.adicionar(arquivo05);
pasta3.adicionar(arquivo06);

//criacao do gerenciador de arquivos
GerenciadorArquivo gerenciador = new GerenciadorArquivo(raiz);
gerenciador.exibirTodos();

