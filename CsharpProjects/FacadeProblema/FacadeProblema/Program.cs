using FacadeProblema.cadastros;
using FacadeProblema.vendas;

Consumidor consumidor = new Consumidor("Consumidor01", "0101010101", "consum@gmail.com");

Produto produto1 = new Produto("Blusa", "Blusa feminina", 80);
Produto produto2 = new Produto("Camiseta", "Camiseta Masculina", 45);
Produto produto3 = new Produto("Calça Jeans", "Calça Jeans Masculina", 120);

Pedido pedido = new Pedido();
pedido.consumidor = consumidor;
pedido.addProduto(produto1);
pedido.addProduto(produto2);
pedido.addProduto(produto3);

Pagamento pagamento = new PagamentoBoleto(pedido);
EmailPedido email = new EmailPedido(pedido);

if (pagamento.realizarPagamento())
{
    email.enviarEmail("Pagamento realizado com sucesso");
}
else
{
    email.enviarEmail("Falha no pagamento do pedido");
}