using VisitorSolucao.ElementoConcreto;

namespace VisitorSolucao.Visitor;

public interface Visitor
{
    public double visitSupermercado(Supermercado supermercado);

    public double visitDepartamento(Departamento departamento);

    public double visitProduto(Produto produto);
}