namespace VisitorSolucao.ElementoConcreto;

using VisitorSolucao.Visitor;
public interface Elemento
{
    public double aceitar(Visitor visitor);
}