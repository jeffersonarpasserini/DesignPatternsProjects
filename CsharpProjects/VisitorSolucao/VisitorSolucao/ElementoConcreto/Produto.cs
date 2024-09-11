namespace VisitorSolucao.ElementoConcreto;

public class Produto : Elemento
{
    public string nome { get; set; }
    public double preco { get; set; }
    public double margemLucro { get; set; }

    public Produto() { }

    public Produto(string nome, double preco, double margemLucro)
    {
        this.nome = nome;
        this.preco = preco;
        this.margemLucro = margemLucro;
    }

    public double aceitar(Visitor.Visitor visitor)
    {
        return visitor.visitProduto(this);
    }
}