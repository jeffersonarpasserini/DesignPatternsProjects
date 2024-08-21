namespace CompositeSolucao;

public abstract class Component
{
    public abstract void adicionar(Component componente);
    public abstract void remover(Component componente);
    public abstract Component recuperarFilho(int indice);
    public abstract void exibir();


}